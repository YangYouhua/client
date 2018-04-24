package net.easyunion.biz.fpfs.jssq.send;

import net.easyunion.common.model.Gt3WebServiceVo;
import net.easyunion.common.util.AnalyzeXml;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.vo.TranIdVo;
import net.easyunion.common.webservice.Gt3WebServiceUtil;

import org.w3c.dom.Document;

/**
 * 根据纳税人识别号查询纳税人信息
 * @author Administrator
 *
 */
public class GetNsrxx {

	/**
	 * 请求webservice
	 * @return
	 */
	public static Document send(String nsrsbh) throws Exception{
		Gt3WebServiceVo vo = new Gt3WebServiceVo();
		vo.setResult(getXml(nsrsbh));
		vo.setTranId(TranIdVo.CXNSRXXBYDJXH);
		String res = "";
		try {
			res = Gt3WebServiceUtil.sendWebService(vo.getDoc());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DocTool.getDocument(res);
	}
	
	/**
	 * 根据登记序号或纳税人识别号查询纳税人信息生成xml
	 * @return
	 */
	public static String getXml(String nsrsbh) {
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><taxML xsi:type=\"HXZGDJ00004Request\" xmlbh=\"String\" bbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/TaxMLBw_HXZG_DJ_00004_Request_V1.0.xsd\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><djxh></djxh><nsrsbh>"
				+ nsrsbh + "</nsrsbh><gdslxDm>1</gdslxDm></taxML>";
		return xml;
	}

}
