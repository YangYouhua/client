package net.easyunion.biz.fpfs.jssq.send;

import net.easyunion.common.model.Gt3WebServiceVo;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.vo.TranIdVo;
import net.easyunion.common.webservice.Gt3WebServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

public class QueryFplgmxxx {
	////查询发票领购簿待打印明细信息
	private final static Logger logger = LoggerFactory.getLogger(QueryFplgmxxx.class);

	/**
	 * <djxh>10111309000126611897</djxh>
	 * 请求webservice
	 * @return
	 */
	public static Document send(String ywuuid ,String type  ) throws Exception{
		Gt3WebServiceVo vo = new Gt3WebServiceVo();
		vo.setResult(getXml(ywuuid , type));
		vo.setTranId(TranIdVo.CXFPLGBDYMXXX );
		String res = "";
		try {
			logger.error("===========请求" + TranIdVo.CXFPLGBDYMXXX  +" 开始。。。。");
			res = Gt3WebServiceUtil.sendWebService(vo.getDoc());
			logger.error("===========请求" + TranIdVo.CXFPLGBDYMXXX  +" 结束。。。。");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DocTool.getDocument(res);
	}
	
	/**
	 * 生成xml
	 * @return
	 */
	public static String getXml(String ywuuid ,String type) {
		String xml = "<taxML xsi:type=\"HXZGFP05137Request\" bbh=\"String\" xmlbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/ TaxMLBw_HXZG_FP_05137_Request_V1.0.xsd\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ywuuid>"+ywuuid+"</ywuuid><type>4</type></taxML>";
		return xml;
	}

}
