package net.easyunion.biz.fpfs.ctais;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import net.easyunion.biz.fpfs.IFpfsServie;
import net.easyunion.biz.fpfs.vo.BsxxVo;
import net.easyunion.biz.fpfs.vo.GpResultVo;
import net.easyunion.biz.fpfs.vo.GpxxVo;
import net.easyunion.biz.fpfs.vo.NsrxxVo;
import net.easyunion.biz.fpfs.vo.SaveGpxxVo;
import net.easyunion.biz.fpfs.vo.TpResultVo;
import net.easyunion.biz.fpfs.vo.TpxxVo;
import net.easyunion.biz.fpfs.vo.YjResultVo;
import net.easyunion.common.service.BaseService;
import net.easyunion.common.util.HttpToolKit;
import net.easyunion.common.util.PropertiesUtil;
import oracle.jdbc.OracleTypes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.stereotype.Service;

/**
 * 防伪数控发票种类代码对照
 * 
 * YB  增值税专票
 * P1  增值税普票
 *    
 * @author bony
 *
 */
@Service("fpfsCtaisService")
public class FpfsCtaisService extends BaseService implements IFpfsServie {
	
	private final static Logger logger = LoggerFactory.getLogger(FpfsCtaisService.class);

	@Override
	public List<NsrxxVo> getNsrxxByID(String sfzhm) {
		List<NsrxxVo> list = new ArrayList<NsrxxVo>();
		try{
			String sql = "select * from fp_gpy t1,dj_nsrxx t2 where t2.nsrsbh = t1.nsrsbh and t1.zjhm='"+sfzhm+"'";
			List<Map<String, Object>> res = this.getJdbcDao().find(sql);
			logger.info("-----------查询getNsrxxByID is size:" +res.size());
			if(res!=null && res.size()>0){
				for(Map<String, Object> map:res){
					NsrxxVo vo = new NsrxxVo();
					vo.setGprIdCard(sfzhm);
					vo.setGprmc(map.get("FPJBR")==null?"":map.get("FPJBR").toString());
					vo.setNsrmc(map.get("NSRMC")==null?"":map.get("NSRMC").toString());
					vo.setNsrsbh(map.get("NSRSBH")==null?"":map.get("NSRSBH").toString());
					list.add(vo);
				}
			}
		}catch(Exception ex){
			logger.error("查询getNsrxxByID错误："+ex.toString());
			ex.printStackTrace();
		}
		logger.info("-----------返回getNsrxxByID查询结果 size ：" +list.size());
		return list;
	}

	@Override
	public List<GpxxVo> getNsrGpxx(final String nsrsbh, final String fpzlDm, final String fpkfDm, final String lrrDm, final String swjgDm, final String djxh, final String fpzh) {
		List<GpxxVo> resList = new ArrayList<GpxxVo>();
		GpxxVo result = new GpxxVo();
		try{
			//校验操作
			{
				//1.判断是不是一般纳税人
				String ckSql = "select 1 from rd_nsrzg where nsrzg_dm = '03' and nsrsbh = '"+nsrsbh+"'";
				if (this.getJdbcDao().find(ckSql).size() > 0) {
					result.setFpDm("0");
					result.setFpQh("0");
					result.setKfsl(0L);
					result.setJyxx("您是辅导期一般纳税人，暂时不可以从自助设备领购发票");
					resList.add(result);
					return resList;
				}
			}
			
			
			//验旧操作
			{
				final List<Map<String, Object>> ls = this.getJdbcDao().find("select * from fp_nsrjc t where t.nsrsbh = ?", nsrsbh);
				
				//取当前日期前4个月报税信息
				for(int i=1;i<=3;i++){
					Calendar cal = Calendar.getInstance();
					cal.add(Calendar.MONTH, -i);
					Date date = cal.getTime();
					final String kprq = new SimpleDateFormat("yyyyMM").format(date)+"01";
					
					@SuppressWarnings("unchecked")
					List<BsxxVo> lsBsxx = (List<BsxxVo>)this.getFwskDao().getJdbcTemplate().execute(new ConnectionCallback<Object>() {
						@Override
						public Object doInConnection(Connection conn)
								throws SQLException, DataAccessException {
							CallableStatement cst = conn.prepareCall("{?=call htjs.p_get_fwsk_bsxx(?,?,?,?)}");
							cst.registerOutParameter(1, OracleTypes.NUMBER);
							cst.setString(2, nsrsbh);
							cst.setString(3, kprq);
							cst.registerOutParameter(4, OracleTypes.CURSOR);
							cst.registerOutParameter(5, OracleTypes.VARCHAR);
							cst.execute();
							ResultSet rs = (ResultSet) cst.getObject(4);
							
							List<BsxxVo> _lsBsxx = new ArrayList<BsxxVo>();
							
							while (rs.next()) {
								String str = "#" + rs.getString("AVC_FPDM") + "|"
										+ rs.getString("AVC_FPQH") + "|" + rs.getString("AVC_FPZH")
										+ "|" + rs.getFloat("AN_JE") + "|" + rs.getFloat("AN_SE") + "|"
										+ rs.getString("AC_FPTKZT") + "|" + rs.getString("AVC_KPRQQ") + "|"
										+ rs.getString("AVC_KPRQZ") + "|" + rs.getInt("FS");
								
								logger.error("接口返回验旧信息：" + str);
								
								//判断记录是否在结存中，不在则跳过
								for (Map<String, Object> m : ls){
									double jcFpqh = Double.parseDouble(m.get("FPQH").toString());
									double jcFpzh = Double.parseDouble(m.get("FPZH").toString());
									String jczl = m.get("FPZL_DM").toString().trim();  //判断种类
									
									double bsFpqh = Double.parseDouble(rs.getString("AVC_FPQH"));
									double bsFpzh = Double.parseDouble(rs.getString("AVC_FPZH"));
									
									logger.error("结存中的发票种类代码：" + jczl);
									logger.error("当前机器传入的发票种类代码" + fpzlDm);
									logger.error("当前发票起号：[结存]:" + String.valueOf(jcFpqh) + ", [报税]" + String.valueOf(bsFpqh));
									logger.error("当前发票止号：[结存]:" + String.valueOf(jcFpzh) + ", [报税]" + String.valueOf(bsFpzh));
									logger.error("票种类判断：" + fpzlDm.equals(jczl));
									//只验旧机器对应的发票种类和结存中存在的发票
									if (bsFpqh >= jcFpqh && bsFpzh <= jcFpzh && fpzlDm.equals(jczl)){
										//获取发票种类代码
										logger.error("此发票段在纳税人结存中存在，且是对应的发票种类.");
										BsxxVo bsxx = new BsxxVo();
										bsxx.setFpDm(rs.getString("AVC_FPDM"));
										bsxx.setFpQh(rs.getString("AVC_FPQH"));
										bsxx.setFpZh(rs.getString("AVC_FPZH"));
										bsxx.setJe(rs.getFloat("AN_JE")+"");
										bsxx.setSe(rs.getFloat("AN_SE")+"");
										bsxx.setFptkzt(rs.getString("AC_FPTKZT"));
										bsxx.setKprqQ(rs.getString("AVC_KPRQQ"));
										bsxx.setKprqZ(rs.getString("AVC_KPRQZ"));
										bsxx.setFs(rs.getInt("FS")+"");
										bsxx.setNsrsbh(nsrsbh);
										bsxx.setFpzlDm(fpzlDm);
										bsxx.setLrrDm(lrrDm);
										bsxx.setSwjgDm(swjgDm);
										
										_lsBsxx.add(bsxx);
											
									}
								}
								
							}
							return _lsBsxx;
						}
					});
					
					//去重
					lsBsxx = removeDuplicate(lsBsxx);
					logger.error("共找到" + lsBsxx.size() + "条需要验旧的记录");
					//执行验旧
					/*for (BsxxVo vo : lsBsxx) {
						System.out.println("验旧信息:" + vo.toString());
						logger.error("验旧信息:" + vo.toString());
						YjResultVo ret = saveYjxx(vo);
						System.out.println(kprq + "验旧结果：" + ret.isOk() + " " + ret.getMsg());
						logger.error(kprq + "验旧结果：" + ret.isOk() + " " + ret.getMsg());
					}*/
				}
			
				
			}
			
			
			
			//获取可购票数量
			{
				String sql = "select a.fpzl_dm,"
						+ "       decode(a.lgsl, null, 0, a.lgsl) as lgsl,"
						+ "       decode(a.myyl, null, 0, a.myyl) as myyl,"
						+ "       decode(a.month_amount, null, 0, a.month_amount) as month_amount,"
						+ "       (select decode(sum(bs), null, 0, sum(bs))"
						+ "          from fp_xs x"
						+ "         where to_char(x.lrrq, 'yyyy-mm') = to_char(sysdate, 'yyyy-mm')"
						+ "           and x.nsrsbh = a.nsrsbh and x.fpzl_dm = a.fpzl_dm) as sale_count,"
						+ "       (select decode(sum(fs), null, 0, sum(fs)) jcsl"
						+ "          from fp_nsrjc k"
						+ "         where k.nsrsbh = a.nsrsbh"
						+ "           and k.fpzl_dm = a.fpzl_dm) as jcsl,"
						+ "       c.fpzl_mc" + "  from fp_pz a, dm_fpzl c"
						+ " where a.fpzl_dm = c.fpzl_dm"
						+ "   and a.nsrsbh = '"+nsrsbh+"' and a.fpzl_dm = '"+fpzlDm+"'";
				logger.info("==================查询纳税人可领购数量sql:" + sql);
				List<Map<String, Object>> list = this.getJdbcDao().find(sql);
				sql = "select * from fp_kc where fpkf_dm = '"+fpkfDm+"' and fpzl_dm='"+fpzlDm+"' order by lrrq ";
				logger.info("==================查询库房库存sql:" + sql);
				List<Map<String, Object>> kcList = this.getJdbcDao().find(sql);
				if(kcList!=null && kcList.size()>0){
					result.setFpDm(kcList.get(0).get("FP_DM")==null?"":kcList.get(0).get("FP_DM").toString());
					result.setKfsl(kcList.get(0).get("BS")==null?0:Long.parseLong(kcList.get(0).get("BS").toString()));
					result.setFpQh(kcList.get(0).get("FPQH")==null?"":kcList.get(0).get("FPQH").toString());
				}else{
					logger.info("==================查询库房库存结果为null！");
				}
				
				long canFp = 0;
				
				if(list!=null && list.size()>0){
					Map<String, Object> map = list.get(0);
					long lgsl = Long.parseLong(map.get("lgsl").toString());
					long myyl = Long.parseLong(map.get("myyl").toString());
					long monthAmount = Long.parseLong(map.get("month_amount").toString());
					long saleCount = Long.parseLong(map.get("sale_count").toString());
					long jcsl = Long.parseLong(map.get("jcsl").toString());
					
					if(myyl - jcsl >= lgsl){
						if(lgsl <= monthAmount - saleCount){
							canFp = lgsl;
						}else{
							canFp = monthAmount - saleCount;
						}
					}else{
						if(myyl - jcsl <= monthAmount - saleCount){
							canFp = myyl - jcsl;
						}else{
							canFp = monthAmount - saleCount;
						}
					}
				}
				logger.info("-----------可领购数量为："+canFp);
				result.setKgsl(canFp);
			}
			
			
		}catch(Exception ex){
			logger.error("执行getNsrGpxx错误："+ex.toString());
			ex.printStackTrace();
		}
		resList.add(result);
		return resList;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public GpResultVo saveGpxx(SaveGpxxVo saveGpxxVo) {
		final GpResultVo result = new GpResultVo();
		try{
			String sql = "select SEQ_FPXSLSH.nextval XLH from dual";
			@SuppressWarnings("deprecation")
			final long xlh = this.getJdbcDao().getJdbcTemplate()
					.queryForLong(sql);

			sql = "select fpxj from dm_fp where fpzl_dm = ? and fp_dm = ?";

			double dj = Double.parseDouble(this
					.getJdbcDao()
					.getJdbcTemplate()
					.queryForMap(sql, saveGpxxVo.getFpzlDm(), saveGpxxVo.getFpDm())
					.get("FPXJ").toString());

			double je = dj * saveGpxxVo.getFs();
			
			//张超
			//2015-02-11 重构购票，从ctais后台获取纳税人的收款国库代码
			//获取纳税人收款国库代码 
			sql = "select * from dj_sz where nsrsbh = '"+saveGpxxVo.getNsrsbh()+"' and zsxm_dm = '01'";
			List<Map<String,Object>> list = this.getJdbcDao().find(sql);
			String skgkDm = "";
			if (list.size() > 0) {
				skgkDm = list.get(0).get("SKGK_DM")+"";
			}
			
			sql = "insert into ctais.TMP_FP_WBJK_XS(xh,line_id,nsrsbh,fstpbz,yssphm,fpkfdm,"
					+ "lrrdm,rq,fpdm,fpqh,fpzh,bs,dj,je,fpzl_dm,mark,skgk_dm) values"
					+ "(?, ?, ?, 'F', '0', ?, "
					+ "?, sysdate, ?, ?, ?, ?, ?, ?, ?, '', ?)";
			logger.info("==================sql:" + sql);
			List<Object> args = new ArrayList<Object>();
			args.add(xlh);
			args.add(xlh);
			args.add(saveGpxxVo.getNsrsbh());
			args.add(saveGpxxVo.getFpkfDm());
			args.add(saveGpxxVo.getLrrDm());
			args.add(saveGpxxVo.getFpDm());
			args.add(saveGpxxVo.getFpQh());
			args.add(saveGpxxVo.getFpZh());
			args.add(saveGpxxVo.getFs());
			args.add(dj);
			args.add(je);
			args.add(saveGpxxVo.getFpzlDm());
			args.add(skgkDm);

			this.getJdbcDao().getJdbcTemplate().update(sql, args.toArray());
			logger.info("success==================sql:" + sql);

			//这里插入fp_xs表，其中 FPDZXXLQFS（发票电子信息领取方式）  为 2  为网上领票  1为带盘上门       
			
			final String beforeProcedureName = "{ ?=call ctais.P_WBJK_FP_FS_CHECK(?,?,?)}";

			this.getJdbcDao().getJdbcTemplate()
					.execute(new ConnectionCallback() {
						public Object doInConnection(Connection conn)
								throws SQLException, DataAccessException {
							CallableStatement call = conn
									.prepareCall(beforeProcedureName);
							call.setLong(2, xlh);
							call.registerOutParameter(3, OracleTypes.VARCHAR);
							call.registerOutParameter(4, OracleTypes.NUMBER);
							call.registerOutParameter(1, Types.INTEGER);
							call.execute();
							int scn = call.getInt(1);
							if (100 == call.getInt(1)) {
								result.setOk(true);
							} else {
								result.setOk(false);
							}
							result.setMsg(call.getString(3));
							result.setLgbhs(call.getLong(4));
							call.close();
							return scn;
						}
					});
			logger.info("success==================P_WBJK_FP_FS_CHECK");
			
			logger.info("开始写入防伪税控系统==============================");
			
			
			//如果ctais发售成功，再继续执行后面的代码
			if (result.isOk()) {
				String sNsrsbh = saveGpxxVo.getNsrsbh();
				String sFpdm = saveGpxxVo.getFpDm();
				String sSwjgdmIn = "";
				String sFpqh = saveGpxxVo.getFpQh();
				String sFpzh = saveGpxxVo.getFpZh();
				String iFssl = saveGpxxVo.getFs().toString();
				String sCzymc = "ctais";
				String sFpzl = saveGpxxVo.getFpzlDmdz(); // P1 普通发票 YB 专票
				String swjgSql = "select nsr_swjg_dm from dj_nsrxx where nsrsbh = '" + sNsrsbh + "'";
				
				List<Map<String, Object>> ret = this.getJdbcDao().find(swjgSql);
				
				if (ret.size() > 0) {
					sSwjgdmIn = ret.get(0).get("NSR_SWJG_DM").toString();
				}
				
				swjgSql = "select FWSK_SWJG_DM from FP_FWSK_SWJGDZ where ZHZG_SWJG_DM = '" + sSwjgdmIn + "'";
				
				ret = this.getJdbcDao().find(swjgSql);
				
				if (ret.size() > 0) {
					sSwjgdmIn = ret.get(0).get("FWSK_SWJG_DM").toString();
				}
				
				
//				String fRkdj = "0.0";
//		        String fFsdj = "0.0";
//		        String gpfs = "NET";// NET 网络购票    HALL上门购票
				
		        String fwskUrl = PropertiesUtil.getInstance().getProperties("fwsk.url");
		        fwskUrl = fwskUrl + "/FpfsJoin?rkdj=0.0&fsdj=0.0&gpfs=NET";
		        logger.error("fwskUrl : " + fwskUrl);
		        System.out.println("fwskUrl : " + fwskUrl);
		        
		        String postData = "1AND" + sNsrsbh + "AND" + sFpdm + "AND" + sSwjgdmIn + "AND" + sFpqh + "AND" + sFpzh + "AND" + iFssl + "AND" + sCzymc + "AND" + sFpzl;
		        
		        System.out.println("postData: " + postData);
		        
		        String retFwsk = HttpToolKit.doPost(fwskUrl, postData);
		        
		        
		        if ("0".equals(retFwsk.trim())) {
		        	result.setOk(true);
		        } else {
		        	TpxxVo tpVo = new TpxxVo();
		        	tpVo.setBs(Integer.parseInt(saveGpxxVo.getFs().toString()));
		        	tpVo.setDj(0.0);
		        	tpVo.setFpDm(saveGpxxVo.getFpDm());
		        	tpVo.setFpqh(saveGpxxVo.getFpQh());
		        	tpVo.setFpzh(saveGpxxVo.getFpZh());
		        	tpVo.setJe(0.0);
		        	tpVo.setKfdm(saveGpxxVo.getFpkfDm());
		        	tpVo.setLrrDm(saveGpxxVo.getLrrDm());
		        	tpVo.setNsrsbh(saveGpxxVo.getNsrsbh());
		        	tpVo.setYssphm("0000000000");
		        	
		        	TpResultVo tpRetVo = saveTpxx(tpVo);
		        	
		        	String tpErrorMsg = "";
		        	if (!tpRetVo.isOk()){
		        		tpErrorMsg = tpRetVo.getMsg();
		        	}
		        	
		        	result.setOk(false);
		        	result.setMsg(retFwsk + "|" + tpErrorMsg);
		        }

		        logger.error("写入防伪税控完毕，返回值：" + retFwsk);
			}
	        
			return result;
		}catch(Exception ex){
			logger.error("执行saveGpxx错误："+ex.toString());
			result.setOk(false);
			result.setMsg(ex.toString());
			ex.printStackTrace();
		}
		return result;
	}

	@Override
	public TpResultVo saveTpxx(TpxxVo tpxxVo) {
		TpResultVo result = new TpResultVo();
		Connection conn = null;
		CallableStatement cst = null;
		try{
			conn = this.getJdbcDao().getJdbcTemplate().getDataSource().getConnection();
//			log.info("退票数据nsrbm="+nsrbm+"invsa.getYssphm()="+invsa.getYssphm()+"invsa.getSalescounter()="+invsa.getSalescounter()+"invsa.getTaxoperatingpersonnel()="+invsa.getTaxoperatingpersonnel()+"时间="+new  SimpleDateFormat("yyyyMMdd").format(new  Date())+"invsa.getInvno()="+invsa.getInvno()+"fpqh="+fpqh+"fpzh="+fpzh+"invsa.getInvcount()="+invsa.getInvcount()+"invsa.getDj()="+invsa.getDj()+"invsa.getJe()="+invsa.getJe());
			// 调用写入ctais函数
			//P_HB_WBJK_FP_TP_CHECK 河北接口
			cst = conn.prepareCall("{?=call ctais.P_WBJK_FP_TP_CHECK(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cst.registerOutParameter(1, OracleTypes.NUMBER);
			cst.setString(2, tpxxVo.getNsrsbh());
			cst.setString(3, "T");
			cst.setString(4, tpxxVo.getYssphm());
			cst.setString(5, tpxxVo.getKfdm());
			cst.setString(6, tpxxVo.getLrrDm());
			cst.setString(7, new  SimpleDateFormat("yyyyMMdd").format(new  Date()));
			cst.setString(8, tpxxVo.getFpDm());
			cst.setString(9, tpxxVo.getFpqh());
			cst.setString(10, tpxxVo.getFpzh());
			cst.setInt(11, tpxxVo.getBs());
			cst.setFloat(12, Float.parseFloat(tpxxVo.getDj().toString()));
			cst.setFloat(13, Float.parseFloat(tpxxVo.getJe().toString()));
			// 征收序号非必须
			//cst.setString(14,getZSXH(nsrbm,  new SimpleDateFormat("yyyyMMdd").format(new Date()), invsa.getDj()+""));
			cst.setString(14," ");
			cst.setInt(15, 1);
			cst.registerOutParameter(16, OracleTypes.VARCHAR);
			cst.executeQuery();
			int code = cst.getInt(1);
			String msg = cst.getString(16);
			if(code == 100){
				result.setOk(true);
			}else{
				result.setOk(false);
				result.setMsg(msg);
			}
			
			cst.close();
		}catch(Exception ex){
			logger.error("执行saveTpxx错误："+ex.toString());
			result.setOk(false);
			result.setMsg(ex.toString());
			ex.printStackTrace();
		}
		return result;
	}

	@Override
	public YjResultVo saveYjxx(final BsxxVo yjxxVo) {
		final YjResultVo result = new YjResultVo();
		final String beforeProcedureName = "{ ? = call ctais.P_WBJK_FP_YJXX(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		try {
			this.getJdbcDao().getJdbcTemplate()
					.execute(new ConnectionCallback<Object>() {
						public Object doInConnection(Connection conn)
								throws SQLException, DataAccessException {
							SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
							
							CallableStatement call = conn
									.prepareCall(beforeProcedureName);
							call.registerOutParameter(1, Types.FLOAT);
							call.setString(2, yjxxVo.getNsrsbh());
							call.setString(3, yjxxVo.getFpzlDm());
							call.setString(4, yjxxVo.getFpDm());
							call.setString(5, yjxxVo.getFptkzt());
							call.setLong(6, Long.parseLong(yjxxVo.getFpZh())
									- Long.parseLong(yjxxVo.getFpQh()) + 1);
							call.setString(7, yjxxVo.getFpQh());
							call.setString(8, yjxxVo.getFpZh());
							call.setString(9, "");
							
							call.setDate(10, new java.sql.Date(new Date().getTime()));
							Date kprqQ = null;
							Date kprqZ = null;
							try {
								kprqQ = sdf.parse(yjxxVo.getKprqQ());
								kprqZ = sdf.parse(yjxxVo.getKprqZ());
							} catch (ParseException e) {
								e.printStackTrace();
							}
							 
							
							call.setDate(11, new java.sql.Date(kprqQ.getTime()));
							call.setDate(12, new java.sql.Date(kprqZ.getTime()));
							
							call.setDouble(13, Double.parseDouble(yjxxVo.getJe()) - Double.parseDouble(yjxxVo.getSe()) ); // je
							call.setDouble(14, Double.parseDouble(yjxxVo.getSe())); // se
							call.registerOutParameter(15, Types.VARCHAR);
							call.execute();
							int scn = call.getInt(1);
							if (100 == call.getInt(1)) {
								result.setOk(true);
							} else {
								result.setOk(false);
							}
							result.setMsg(call.getString(15));
							logger.error("====================ctais.P_WBJK_FP_YJXX is ok============"
									+ scn);
							call.close();
							return scn;
						}
					});
			if (result.isOk()) {
				String sql = "update fp_yj set lrr_dm=?, xgr_dm=?,swjg_dm=? where nsrsbh=? and fpzl_dm=? and fpqh=? and fpzh=?";
				List<String> l = new ArrayList<String>();
				l.add(yjxxVo.getLrrDm());
				l.add(yjxxVo.getLrrDm());
				l.add(yjxxVo.getSwjgDm());
				l.add(yjxxVo.getNsrsbh());
				l.add(yjxxVo.getFpzlDm());
				l.add(yjxxVo.getFpQh());
				l.add(yjxxVo.getFpZh());
				this.getJdbcDao().getJdbcTemplate().update(sql, l.toArray());
			}
		} catch (Exception e) {
			e.printStackTrace();
			result.setOk(false);
			logger.error(e.toString());
			result.setMsg(e.toString());
		}
		return result;
	}

	@Override
	public List<BsxxVo> getBsxxByNsrsbh(final String nsrsbh, final String fpzlDm, final String lrrDm, final String swjgDm) {
		
		final List<BsxxVo> result = new ArrayList<BsxxVo>();
		
		try{
			
			final List<Map<String, Object>> ls = this.getJdbcDao().find("select * from fp_nsrjc t where t.nsrsbh = ?", nsrsbh);
			
			//取当前日期前4个月报税信息
			for(int i=0;i<=3;i++){
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.MONTH, -i);
				Date date = cal.getTime();
				final String kprq = new SimpleDateFormat("yyyyMM").format(date)+"01";
				
				this.getFwskDao().getJdbcTemplate().execute(new ConnectionCallback<Object>() {
					@Override
					public Object doInConnection(Connection conn)
							throws SQLException, DataAccessException {
						CallableStatement cst = conn.prepareCall("{?=call htjs.p_get_fwsk_bsxx(?,?,?,?)}");
						cst.registerOutParameter(1, OracleTypes.NUMBER);
						cst.setString(2, nsrsbh);
						cst.setString(3, kprq);
						cst.registerOutParameter(4, OracleTypes.CURSOR);
						cst.registerOutParameter(5, OracleTypes.VARCHAR);
						cst.execute();
						ResultSet rs = (ResultSet) cst.getObject(4);
						
						while (rs.next()) {
							String str = "#" + rs.getString("AVC_FPDM") + "|"
									+ rs.getString("AVC_FPQH") + "|" + rs.getString("AVC_FPZH")
									+ "|" + rs.getFloat("AN_JE") + "|" + rs.getFloat("AN_SE") + "|"
									+ rs.getString("AC_FPTKZT") + "|" + rs.getString("AVC_KPRQQ") + "|"
									+ rs.getString("AVC_KPRQZ") + "|" + rs.getInt("FS");
							
							logger.info("接口返回验旧信息：" + str);
							
							//判断记录是否在结存中，不在则跳过
							for (Map<String, Object> m : ls){
								double jcFpqh = Double.parseDouble(m.get("FPQH").toString());
								double jcFpzh = Double.parseDouble(m.get("FPZH").toString());
								
								double bsFpqh = Double.parseDouble(rs.getString("AVC_FPQH"));
								double bsFpzh = Double.parseDouble(rs.getString("AVC_FPZH"));
								
								//if (bsFpqh >= jcFpqh && bsFpzh <= jcFpzh){
								//只显示正常开具的发票
								if (bsFpqh >= jcFpqh && bsFpzh <= jcFpzh && "10".equals(rs.getString("AC_FPTKZT"))){
									//获取发票种类代码
									logger.info("此发票段在纳税人结存中存在.");
									BsxxVo bsxx = new BsxxVo();
									bsxx.setFpDm(rs.getString("AVC_FPDM"));
									bsxx.setFpQh(rs.getString("AVC_FPQH"));
									bsxx.setFpZh(rs.getString("AVC_FPZH"));
									bsxx.setJe(rs.getFloat("AN_JE")+"");
									bsxx.setSe(rs.getFloat("AN_SE")+"");
									bsxx.setFptkzt(rs.getString("AC_FPTKZT"));
									bsxx.setKprqQ(rs.getString("AVC_KPRQQ"));
									bsxx.setKprqZ(rs.getString("AVC_KPRQZ"));
									bsxx.setFs(rs.getInt("FS")+"");
									bsxx.setNsrsbh(nsrsbh);
									bsxx.setFpzlDm(fpzlDm);
									bsxx.setLrrDm(lrrDm);
									bsxx.setSwjgDm(swjgDm);
									
									result.add(bsxx);
								}
							}
							
						}
						return null;
					}
				});
				
			}
		}catch(Exception ex){
			logger.error(ex.toString());
			ex.printStackTrace();
		}
		return result;
	}

	@Override
	public List<NsrxxVo> getNsrxxByNsrsbh(String nsrsbh) {
		List<NsrxxVo> resList = new ArrayList<NsrxxVo>();
		String sql = "select t1.zjhm,t1.fpjbr,t2.nsrmc,t2.zjhm as fddbrsfzh,t3.cwfzr_zjhm from fp_gpy t1,dj_nsrxx t2,dj_nsrxx_kz t3 where t2.nsrsbh = t3.nsrsbh and t2.nsrsbh = t1.nsrsbh and t2.nsrsbh='"+nsrsbh+"'";
		List<Map<String, Object>> list = this.getJdbcDao().find(sql);
		if(list!=null && list.size()>0){
			for(Map<String, Object> map : list){
				NsrxxVo vo = new NsrxxVo();
				vo.setNsrsbh(nsrsbh);
				vo.setNsrmc(map.get("NSRMC") == null ? "" : map.get("NSRMC").toString());
				vo.setGprIdCard(map.get("ZJHM") == null ? "" : map.get("ZJHM").toString());
				vo.setGprmc(map.get("FPJBR") == null ? "" : map.get("FPJBR").toString());
				vo.setCwfzrIdCard(map.get("CWFZR_ZJHM") == null ? "" : map.get("CWFZR_ZJHM").toString());
				vo.setFddbrIdCard(map.get("FDDBRSFZH") == null ? "" : map.get("FDDBRSFZH").toString());
				
				//先更新纳税人升级版标志,增加纳税人更新增值税发票升级版标志 更新
				String iSql = "update dj_nsrxx_kz set zzsfpsjb_bz = 'Y' where nsrsbh = '" + nsrsbh + "'";
				this.getJdbcDao().getJdbcTemplate().update(iSql);
				
				resList.add(vo);
			}
			
		}
		
		return resList;
	}

	
	public static List<BsxxVo> removeDuplicate(List<BsxxVo> _list) {
		List<BsxxVo> list = _list;
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = list.size() - 1; j > i; j--) {
				if (list.get(j).equals(list.get(i))) {
					list.remove(j);
				}
			}
		}
		return list;
	}

	@Override
	public List<Map<String, Object>> getSwjgKf(String swjgDm) {
		return null;
	}

	@Override
	public String getNsrJcxx(String djxh) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getDjxh(String djxh) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Map<String, Object>> getNsrzt(String djxh) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Map<String, Object>> getFxnsr(String nsrsbh) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Map<String, Object>> getQsqy(String djxh) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getWfwz(String nsrsbh) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getSmz(String nsrsbh) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
