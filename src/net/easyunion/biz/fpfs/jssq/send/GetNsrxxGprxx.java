package net.easyunion.biz.fpfs.jssq.send;

import net.easyunion.common.model.Gt3WebServiceVo;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.vo.TranIdVo;
import net.easyunion.common.webservice.Gt3WebServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * 校验并提取纳税人基本信息、资格信息、已有票种核定信息、已有购票人信息
 * @author Administrator
 *
 */
public class GetNsrxxGprxx {
	
	private final static Logger logger = LoggerFactory.getLogger(GetNsrxxGprxx.class);
	
	/**
	 * 请求webservice
	 * @return
	 */
	public static Document send(String djxh) throws Exception{
		Gt3WebServiceVo vo = new Gt3WebServiceVo();
		vo.setResult(getXml(djxh));
		vo.setTranId(TranIdVo.CSHPZHDSQ);
		String res = "";
		try {
			System.out.println(vo.getDoc());
			res = Gt3WebServiceUtil.sendWebService(vo.getDoc());
			logger.error("返回报文："+res);
		} catch (Exception e) {
			logger.error(e.toString()+e.getMessage());
			e.printStackTrace();
		}
		return DocTool.getDocument(res);
	}
	
	/**
	 * 校验并提取纳税人基本信息、资格信息、已有票种核定信息、已有购票人信息
	 * @return
	 */
	public static String getXml(String djxh) {
		String xml = "<taxML xsi:type=\"HXZGFP00000Request\" bbh=\"String\" xmlbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/ TaxMLBw_HXZG_FP_00000_Request_V1.0.xsd\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><djxh>"+djxh+"</djxh><swjgDm></swjgDm><lcslid>1</lcslid></taxML>";
		return xml;
	}

}
