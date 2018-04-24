package net.easyunion.biz.fpfs.jssq.send;

import net.easyunion.common.model.Gt3WebServiceVo;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.vo.TranIdVo;
import net.easyunion.common.webservice.Gt3WebServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

public class HdgprxxByDjxh {
	//根具登記序列號查詢納稅人票種核定購票人信息
	private final static Logger logger = LoggerFactory.getLogger(HdgprxxByDjxh.class);

	/**
	 * <djxh>10111309000126611897</djxh>
	 * 请求webservice
	 * @return
	 */
	public static Document send(String djxh ) throws Exception{
		Gt3WebServiceVo vo = new Gt3WebServiceVo();
		vo.setResult(getXml(djxh ));
		vo.setTranId(TranIdVo.CXNSRPZHDGPR );
		String res = "";
		try {
			logger.error("===========请求" + TranIdVo.CXNSRPZHDGPR  +" 开始。。。。");
			res = Gt3WebServiceUtil.sendWebService(vo.getDoc());
			logger.error("===========请求" + TranIdVo.CXNSRPZHDGPR  +" 结束。。。。");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DocTool.getDocument(res);
	}
	
	/**
	 * 生成xml
	 * @return
	 */
	public static String getXml(String djxh ) {
		String xml = "<taxML xsi:type=\"HXZGFP05196Request\" bbh=\"String\" xmlbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/ TaxMLBw_HXZG_FP_05196_Request_V1.0.xsd\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><djxh>10111309000126611897</djxh></taxML>";
		return xml;
	}
	
}
