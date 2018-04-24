package net.easyunion.biz.fpfs.jssq.send;

import java.util.Date;

import net.easyunion.biz.fpfs.vo.PrintLgbVo;
import net.easyunion.biz.fpfs.vo.TpxxVo;
import net.easyunion.common.model.Gt3WebServiceVo;
import net.easyunion.common.util.DateUtils;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.util.UUIDUtil;
import net.easyunion.common.vo.TranIdVo;
import net.easyunion.common.webservice.Gt3WebServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * 保存领购薄
 * @author Administrator
 *
 */
public class SaveLgb {
	
	private final static Logger logger = LoggerFactory.getLogger(SaveLgb.class);
	
	/**
	 * 请求webservice
	 * @return
	 */
	public static Document send(PrintLgbVo lgbVo) throws Exception{
		Gt3WebServiceVo vo = new Gt3WebServiceVo();
		vo.setResult(getXml(lgbVo));
		vo.setTranId(TranIdVo.BCLGBJBXX );
		String res = "";
		try {
			logger.error("===========请求" + TranIdVo.BCLGBJBXX  +" 开始。。。。");
			res = Gt3WebServiceUtil.sendWebService(vo.getDoc());
			logger.error("===========请求" + TranIdVo.BCLGBJBXX  +" 结束。。。。");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DocTool.getDocument(res);
	}
	
	public static String getXml(PrintLgbVo lgbVo){
		String fplgbUuid = UUIDUtil.getUUIDToCase();
		String xml = "<taxML xsi:type=\"HXZGFP00006Request\" bbh=\"String\" xmlbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/TaxMLBw_HXZG_FP_00006_Request_V1.0.xsd\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
					+"<lgbffVO>"
					+"	<fplgbuuid>"+lgbVo.getLgbFfUuid()+"</fplgbuuid>"
					+"	<lcslid>"+lgbVo.getLcslid()+"</lcslid>"
					+"	<djxh>"+lgbVo.getDjxh()+"</djxh>"
					+"	<fpglyxm></fpglyxm>"
					+"	<fplgbhm>"+lgbVo.getFplgbHm()+"</fplgbhm>"
					+"	<slswjgDm>"+lgbVo.getSwjgDm()+"</slswjgDm>"
					+"	<lrrDm>"+lgbVo.getLrrDm()+"</lrrDm>"
					+"	<xgrDm></xgrDm>"
					+"	<sjgsdq>"+lgbVo.getSwjgDm()+"</sjgsdq>"
					+"	<wszzrq>"+DateUtils.formatDateToString(new Date(), "yyyy-MM-dd hh:mm:ss")+"</wszzrq>"
					+"	<sfzjhm>"+lgbVo.getSfzjhm()+"</sfzjhm>"
					+"	<sfzjlxDm>201</sfzjlxDm>"
					+"</lgbffVO>"
					+"<lgbVO>"     
					+"	<fplgbuuid>"+lgbVo.getLgbUuid()+"</fplgbuuid>"
					+"	<djxh>"+lgbVo.getDjxh()+"</djxh>"
					+"	<swzjzlDm>"+lgbVo.getSwzjzlDm()+"</swzjzlDm>"    //08  ----  发票领购薄表中所有税务证件代码都为8
					+"	<swzjhm>"+lgbVo.getSwzjhm()+"</swzjhm>"          //税务证件号码
					+"	<swzjglztDm>"+lgbVo.getSwzjglztDm()+"</swzjglztDm>" //税务证件管理状态代码   01 ----使用
					+"	<ffrq>"+DateUtils.formatDateToString(new Date(), "yyyy-MM-dd hh:mm:ss")+"</ffrq>"
					+"	<yxqq></yxqq>"
					+"	<yxqz></yxqz>"
					+"	<lrrDm>"+lgbVo.getLrrDm()+"</lrrDm>"
					+"	<sjgsdq>"+lgbVo.getSwjgDm()+"</sjgsdq>"
					+"	<fplgbhm>"+lgbVo.getFplgbHm()+"</fplgbhm>"        //发票领购薄号码
					+"</lgbVO>"
					+"<hsxxVO>"
					+"	<djxh>"+lgbVo.getDjxh()+"</djxh>"
					+"	<hdhs></hdhs>"    //核定行数
					+"	<jxhs></jxhs>"     //缴销行数
					+"	<gshx></gshx>"     //挂失行数
					+"	<yjhs></yjhs>"     //验旧行数
					+"	<tphs>2</tphs>"     //退票行数
					+"	<lyhs>2</lyhs>"     //领用行数
					+"	<sjtbSj>"+DateUtils.formatDateToString(new Date(), "yyyy-MM-dd hh:mm:ss")+"</sjtbSj>"
					+"	<sjgsdq>"+lgbVo.getSwjgDm()+"</sjgsdq>"
					+"	<swjgDm>"+lgbVo.getSwjgDm()+"</swjgDm>"
					+"	<lrrDm>"+lgbVo.getLrrDm()+"</lrrDm>"
					+"	<xgrDm>"+lgbVo.getLrrDm()+"</xgrDm>"
					+"</hsxxVO>"
					+"</taxML>";
		return xml;
	}

}
