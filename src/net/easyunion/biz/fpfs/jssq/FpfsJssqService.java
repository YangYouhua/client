package net.easyunion.biz.fpfs.jssq;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
























import oracle.jdbc.OracleTypes;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;

import net.easyunion.biz.fpfs.IFpfsServie;
import net.easyunion.biz.fpfs.jssq.send.GetNsrfpjc;
import net.easyunion.biz.fpfs.jssq.send.GetNsrxx;
import net.easyunion.biz.fpfs.jssq.send.GetNsrxxGprxx;
import net.easyunion.biz.fpfs.jssq.send.Jyfstj;
import net.easyunion.biz.fpfs.jssq.send.QueryGtkcxx;
import net.easyunion.biz.fpfs.jssq.send.SaveFpfs;
import net.easyunion.biz.fpfs.jssq.send.SaveFpyj;
import net.easyunion.biz.fpfs.jssq.send.SaveLgb;
import net.easyunion.biz.fpfs.jssq.send.SaveTpxx;
import net.easyunion.biz.fpfs.jssq.send.query.QueryFpLgb;
import net.easyunion.biz.fpfs.jssq.send.query.QueryFpLgbDyhs;
import net.easyunion.biz.fpfs.jssq.send.query.QueryFplgbFF;
import net.easyunion.biz.fpfs.vo.BsxxVo;
import net.easyunion.biz.fpfs.vo.GpResultVo;
import net.easyunion.biz.fpfs.vo.GpxxVo;
import net.easyunion.biz.fpfs.vo.NsrxxVo;
import net.easyunion.biz.fpfs.vo.PrintLgbVo;
import net.easyunion.biz.fpfs.vo.SaveGpxxVo;
import net.easyunion.biz.fpfs.vo.TpResultVo;
import net.easyunion.biz.fpfs.vo.TpxxVo;
import net.easyunion.biz.fpfs.vo.YjResultVo;
import net.easyunion.common.service.BaseService;
import net.easyunion.common.util.AnalyzeXml;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.util.HttpToolKit;
import net.easyunion.common.util.PropertiesUtil;
import net.easyunion.common.util.StringUtil;
import net.easyunion.common.util.XmlUtil;
import net.easyunion.common.vo.ResultXmlVo;

@Service("fpfsJssqService")
public class FpfsJssqService extends BaseService implements IFpfsServie {
	
	private final static Logger logger = LoggerFactory.getLogger(FpfsJssqService.class);

	@Override
	public List<NsrxxVo> getNsrxxByID(String sfzhm) {
		return null;
	}
	
	@Override
	public List<GpxxVo> getNsrGpxx(final String nsrsbh, final String fpzlDm, final String fpkfDm, final String lrrDm, final String swjgDm, final String djxh, final String fpdm) {
		List<GpxxVo> result = new ArrayList<GpxxVo>();
		try {
			Document jcxxDoc = null;
			ResultXmlVo vo = null;
			
			//验旧操作
			{
				jcxxDoc = GetNsrfpjc.send(djxh, "0");
				vo = AnalyzeXml.analyzeJsDoc(jcxxDoc);
				logger.error("===========请求获取纳税人结存信息接口 code:" +vo.isResult()+ "  message :" +vo.getMessage());
				if(vo.isResult()){
					final List<Map<String, Object>> jcList = XmlUtil.getListMap(vo.getDoc(), "fpNsrfpjcVOListlb", "2");
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
									for (Map<String, Object> m : jcList){
										double jcFpqh = Double.parseDouble(m.get("fpqshm").toString());
										double jcFpzh = Double.parseDouble(m.get("fpzzhm").toString());
										String jczl = m.get("fpzlDm").toString().trim();  //判断种类
										
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
											bsxx.setDjxh(djxh);
											
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
						for (BsxxVo bsxxVo : lsBsxx) {
							System.out.println("验旧信息:" + bsxxVo.toString());
							logger.error("验旧信息:" + bsxxVo.toString());
							YjResultVo ret = saveYjxx(bsxxVo);
							System.out.println(kprq + "验旧结果：" + ret.isOk() + " " + ret.getMsg());
							logger.error(kprq + "验旧结果：" + ret.isOk() + " " + ret.getMsg());
						}
					}
				}
			
			}
			
			//获取购票信息
			{
				
				logger.error("开始计算纳税人可购票数量================================");
				
				logger.error("获取纳税人票种核定信息==================================");
				Document hdDoc = GetNsrxxGprxx.send(djxh);//获取票种核定信息
				vo = AnalyzeXml.analyzeJsDoc(hdDoc);
				if(vo.isResult()){
					long hdSl = 0L;//核定数量
					long jcSl = 0L;//结存数量
					long kcSl = 0L;//库房数量
					
					//获取核定数量
					List<Map<String, Object>> hdList = XmlUtil.getListMap(vo.getDoc(), "fpPzhdxxGridlb", "2");
					if(hdList!=null && hdList.size()>0){
						for(Map<String, Object> map:hdList){
							if(fpzlDm.equals(map.get("fpzlDm").toString())){
								hdSl = getFpFs(map.get("myzggpsl").toString());
							}
						}
					}
					
					logger.error("纳税人核定数量为："+hdSl+"=============================");
					
					if(hdSl <= 0){
						GpxxVo gpxx = new GpxxVo();
						gpxx.setFpDm("0");
						gpxx.setFpQh("0");
						gpxx.setKfsl(0L);
						gpxx.setKgsl(0L);
						gpxx.setJyxx("核定数量为零，不可领购发票，请联系税局人员！");
						result.add(gpxx);
						return result;
					}
					
					logger.error("获取纳税人验旧过后结存信息==================================");
					
					jcxxDoc = GetNsrfpjc.send(djxh, "0");
					vo = AnalyzeXml.analyzeJsDoc(jcxxDoc);
					
					List<Map<String, Object>> jcList = XmlUtil.getListMap(vo.getDoc(), "fpNsrfpjcVOListlb", "2");//获取结存信息
					
					//获取结存数量
					if(jcList !=null && jcList.size()>0){
						for(Map<String, Object> map:jcList){
							if(fpzlDm.equals(map.get("fpzlDm").toString())){
								jcSl = getFpFs(map.get("fs").toString()) + jcSl;
							}
						}
					}
					
					logger.error("纳税人结存信息为："+jcSl+"=================================");
					
					String fpDm = "";
					String fpQh = "";
					long canSl = 0L;
					ResultXmlVo kfxxVo = AnalyzeXml.analyzeJsDoc(QueryGtkcxx.send(djxh, null, fpkfDm, null));//查询柜台库存信息
					logger.error("fpdm:"+fpdm+",fpzlDm:"+fpzlDm+",开始匹配库存信息=========================");
					if(kfxxVo.isResult()){
						List<Map<String, Object>> kfList = XmlUtil.getListMap(kfxxVo.getDoc(), "swjgkfkcVOListlb", "2");
						if(kfList!=null && kfList.size()>0){
							for(Map<String, Object> kf:kfList){
								if(fpdm.equals(kf.get("fpDm")) && fpzlDm.equals(kf.get("fpzlDm"))){
									if(StringUtils.isEmpty(fpQh)){
										kcSl = getFpFs(kf.get("kcfs").toString());
										fpDm = kf.get("fpDm").toString();
										fpQh = kf.get("fpqshm").toString();
									}else{
										if(Long.parseLong(fpQh) > Long.parseLong(kf.get("fpqshm").toString())){
											kcSl = getFpFs(kf.get("kcfs").toString());
											fpDm = kf.get("fpDm").toString();
											fpQh = kf.get("fpqshm").toString();
										}
									}
								}
							}
						}
					}
					
					logger.error("库房数量："+kcSl+",发票代码："+fpDm+",发票起号："+fpQh+"============================");
					
					GpxxVo gpxxVo = new GpxxVo();
					gpxxVo.setFpDm(fpDm);
					gpxxVo.setKfsl(kcSl);
					gpxxVo.setFpQh(fpQh);
					if(hdSl >= jcSl){
						if(hdSl - jcSl > kcSl){
							canSl = kcSl;
						}else{
							canSl = hdSl - jcSl;
						}
					}else{
						gpxxVo.setJyxx("可够数量为0，暂时不能购票！");
					}
					
					logger.error("计算后纳税人可购票数量为："+canSl+"======================================");
					
					gpxxVo.setKgsl(canSl);
					result.add(gpxxVo);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public GpResultVo saveGpxx(SaveGpxxVo saveGpxxVo) {
		GpResultVo resVo = new GpResultVo();
		logger.error("开始写入发票领购信息============================");
		try {
//			List<Map<String, Object>> lgbFfList = QueryFplgbFF.send(saveGpxxVo.getDjxh());
//			if(lgbFfList!=null && lgbFfList.size()>0){
//				Map<String, Object> lgbFfMap = lgbFfList.get(0);
//				String lgbffUuid =lgbFfMap.get("FPLGBUUID").toString();
//				String lcslid = lgbFfMap.get("LCSLID").toString();
//				String sfzjHm = lgbFfMap.get("SFZJHM").toString();
//				
//				List<Map<String, Object>> lgbList = QueryFpLgb.send(saveGpxxVo.getDjxh());
//				Map<String, Object> lgbMap = lgbList.get(0);
//				String lgbhm = lgbMap.get("FPLGBHM").toString();
//				String swzjzlDm = lgbMap.get("SWZJZL_DM").toString();
//				String swzjHm = lgbMap.get("SWZJHM").toString();
//				String swzjglztDm = lgbMap.get("SWZJGLZT_DM").toString();
//				String lgbUuid = lgbMap.get("FPLGBUUID").toString();
				ResultXmlVo xmlVo = AnalyzeXml.analyzeJsDoc(SaveFpfs.send(saveGpxxVo));
				logger.error("===============写入发票领购信息返回 Code："+xmlVo.isResult()+",message:"+xmlVo.getMessage());
				if(xmlVo.isResult()){
					logger.error("写入发票领购信息成功============================");
					logger.info("开始写入防伪税控系统==============================");
					
					String fwskUrl = PropertiesUtil.getInstance().getProperties("fwsk.url");
			        fwskUrl = fwskUrl + "/FpfsJoin?rkdj=0.0&fsdj=0.0&gpfs=NET";
			        logger.error("fwskUrl : " + fwskUrl);
			        System.out.println("fwskUrl : " + fwskUrl);
//			        
			        String sCzymc = "ctais";
			        String sFpzl = "";
//			        
//			        //防伪税控发票种类   P1 普通发票 YB 专票
			        if(saveGpxxVo.getZppzDm().equals("1")){
			        	sFpzl = "YB";
			        }else{
			        	sFpzl = "P1";
			        }
			        String fwskSwjgDm = saveGpxxVo.getFwskSwjgDm().substring(0, saveGpxxVo.getFwskSwjgDm().length()-2);
			        String postData = "1|@|" + saveGpxxVo.getNsrsbh() + "|@|" + saveGpxxVo.getFpDm() + "|@|" + fwskSwjgDm + "|@|" + saveGpxxVo.getFpQh() + "|@|" + saveGpxxVo.getFpZh() + "|@|" + saveGpxxVo.getFs() + "|@|" + sCzymc + "|@|" + sFpzl;
			        
			        System.out.println("postData: " + postData);
			        
			        String retFwsk = HttpToolKit.doPost(fwskUrl, postData);
			        
			        
			        if ("0".equals(retFwsk.trim())) {
			        	resVo.setOk(true);
			        	resVo.setLgbhs(0L);
			        } else {
			        	TpxxVo tpxxVo = new TpxxVo();
			        	tpxxVo.setDjxh(saveGpxxVo.getDjxh());
			    		tpxxVo.setBs(saveGpxxVo.getFs().intValue());
			    		tpxxVo.setDj(0.0);
			    		tpxxVo.setFpDm(saveGpxxVo.getFpDm());
			    		tpxxVo.setFpqh(saveGpxxVo.getFpQh());
			    		tpxxVo.setFpzh(saveGpxxVo.getFpZh());
			    		tpxxVo.setJe(0.0);
			    		tpxxVo.setKfdm(saveGpxxVo.getFpkfDm());
			    		tpxxVo.setLrrDm(saveGpxxVo.getLrrDm());
			    		tpxxVo.setNsrsbh(saveGpxxVo.getNsrsbh());
			    		tpxxVo.setYssphm("0000000000");
			    		tpxxVo.setSwjgDm(saveGpxxVo.getSwjgDm());
			    		tpxxVo.setSqrXm(saveGpxxVo.getGprXm());
			    		tpxxVo.setFpzlDm(saveGpxxVo.getFpzlDm());
			    		tpxxVo.setZppzDm(saveGpxxVo.getZppzDm());
			    		tpxxVo.setFpdmmc(saveGpxxVo.getFpdmmc());
			    		
			    		TpResultVo tpRetVo = saveTpxx(tpxxVo);
			        	
			        	String tpErrorMsg = "";
			        	if (!tpRetVo.isOk()){
			        		tpErrorMsg = tpRetVo.getMsg();
			        	}
			        	resVo.setOk(false);
			        	resVo.setMsg(retFwsk + "|" + tpErrorMsg);
			        }
			        logger.error("写入防伪税控完毕，返回值：" + retFwsk);
				}else{
					resVo.setOk(false);
					resVo.setMsg(xmlVo.getMessage());
				}
					
					
//					PrintLgbVo vo = new PrintLgbVo(); 
//					vo.setSfzjhm(sfzjHm);
//					vo.setDjxh(saveGpxxVo.getDjxh());
//					vo.setLgbFfUuid(lgbffUuid);
//					vo.setLcslid(lcslid);
//					vo.setFplgbHm(lgbhm);
//					vo.setSwzjzlDm(swzjzlDm);
//					vo.setSwzjhm(swzjHm);
//					vo.setSwzjglztDm(swzjglztDm);
//					vo.setLgbUuid(lgbUuid);
//					vo.setLrrDm(saveGpxxVo.getLrrDm());
//					vo.setNsrsbh(saveGpxxVo.getNsrsbh());
//					vo.setSwjgDm(saveGpxxVo.getSwjgDm());
//					ResultXmlVo lgbVo = AnalyzeXml.analyzeJsDoc(SaveLgb.send(vo));
//					if(lgbVo.isResult()){
//						resVo.setOk(true);
//					}else{
//						resVo.setMsg(lgbVo.getMessage());
//						resVo.setOk(false);
//					}
//				}else{
//					resVo.setMsg(xmlVo.getMessage());
//					resVo.setOk(false);
//				}
//			}else{
//				resVo.setOk(false);
//				resVo.setMsg("");
//			}
		} catch (Exception e) {
			resVo.setOk(false);
			resVo.setMsg(e.toString());
			e.printStackTrace();
		}
		logger.error("写入发票发售信息结束=======================================");
		return resVo;
	}

	@Override
	public TpResultVo saveTpxx(TpxxVo tpxxVo) {
		TpResultVo resVo = new TpResultVo();
		logger.error("开始写入发票退票信息===============================");
		try {
			ResultXmlVo xmlVo = AnalyzeXml.analyzeJsDoc(SaveTpxx.send(tpxxVo));
			logger.error("==================写入退票信息返回code："+xmlVo.isResult()+",message:"+xmlVo.getMessage());
			if(xmlVo.isResult()){
				resVo.setOk(true);
			}else{
				resVo.setMsg(xmlVo.getMessage());
				resVo.setOk(false);
			}
		} catch (Exception e) {
			resVo.setOk(false);
			resVo.setMsg(e.toString());
			e.printStackTrace();
		}
		logger.error("结束写入发票退票信息===============================");
		return resVo;
	}

	@Override
	public YjResultVo saveYjxx(BsxxVo yjxxVo) {
		YjResultVo resVo = new YjResultVo();
		try {
			Document doc = SaveFpyj.send(yjxxVo);
			ResultXmlVo resXml = AnalyzeXml.analyzeJsDoc(doc);
			if(resXml.isResult()){
				resVo.setOk(true);
			}else{
				resVo.setOk(false);
				resVo.setMsg(resXml.getMessage());
			}
		} catch (Exception e) {
			resVo.setOk(false);
			resVo.setMsg(e.toString());
			e.printStackTrace();
		}
		return resVo;
	}

	@Override
	public List<BsxxVo> getBsxxByNsrsbh(String nsrsbh, String fpzlDm, String lrrDm, String swjgDm) {
		return null;
	}

	@Override
	public List<NsrxxVo> getNsrxxByNsrsbh(String nsrsbh) {
		List<NsrxxVo> list = new ArrayList<NsrxxVo>();
		Document doc = null;
		try {
			doc = GetNsrxx.send(nsrsbh);//根据纳税人识别号获取纳税人信息
			ResultXmlVo resXml = AnalyzeXml.analyzeJsDoc(doc);
			logger.error("==========查询纳税人信息接口返回值：" + resXml.isResult() + " , message :" + resXml.getMessage());
			if(resXml.isResult()){
				String djxh = DocTool.getChildValue(resXml.getDoc(), 0, "djxh");
				String nsrmc = DocTool.getChildValue(resXml.getDoc(), 0, "nsrmc");
				doc = GetNsrxxGprxx.send(djxh);//查询纳税人详细信息和购票人信息 
				resXml = AnalyzeXml.analyzeJsDoc(doc);
				logger.error("==========查询纳税人详细信息和购票人信息 接口返回值：" + resXml.isResult() + " , message :" + resXml.getMessage());
				List<Map<String, Object>> listMap = XmlUtil.getListMap(resXml.getDoc(), "fpPzhdgprxxGridlb", "2");
				logger.error("解析购票人信息listMap ：" +listMap.size());
				String cwfzrIdCard = DocTool.getChildValue(resXml.getDoc(), 0, "cwfzrsfzjhm");
				String fddbrIdCard = DocTool.getChildValue(resXml.getDoc(), 0, "fddbrsfzjhm");
				String zgswjDm = DocTool.getChildValue(resXml.getDoc(), 0, "zgswjDm");
				for(Map<String, Object> map:listMap){
					NsrxxVo vo = new NsrxxVo();
					vo.setDjxh(djxh);
					vo.setNsrsbh(nsrsbh);
					vo.setNsrmc(nsrmc);
					vo.setCwfzrIdCard(cwfzrIdCard);
					vo.setFddbrIdCard(fddbrIdCard);
					vo.setGprIdCard(map.get("sfzjhm").toString());
					vo.setGprmc(map.get("gprxm").toString());
					vo.setSwjgDm(zgswjDm);
					list.add(vo);
					logger.error("纳税人名称:" +nsrmc+ "，购票人名称：" + map.get("gprxm").toString());
				}
				
				logger.error("返回纳税人信息list：" +list.size());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
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
	
	public Long getFpFs(String str){
		if(str.indexOf(".") > -1){
			return Long.parseLong(str.substring(0 , str.indexOf(".")));
		}else{
			return Long.parseLong(str);
		}
		
	}

	@Override
	public List<Map<String, Object>> getSwjgKf(String swjgDm) {
		String sql = "select * from fp_fpkf where ssswjg_dm = '"+swjgDm+"'";
		return this.getJdbcDao().find(sql);
	}

}
