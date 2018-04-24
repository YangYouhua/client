package net.easyunion.biz.fpfs.jssq.send;

import net.easyunion.common.model.Gt3WebServiceVo;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.vo.TranIdVo;
import net.easyunion.common.webservice.Gt3WebServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

//发票领用查询纳税人相关信息
public class GetNsrxxByfply {
	private final static Logger logger = LoggerFactory.getLogger(GetNsrxxByfply.class);
	/**
	 * 请求webservice
	 * @return
	 */
	public static Document send(String djxh , String N) throws Exception{
		Gt3WebServiceVo vo = new Gt3WebServiceVo();
		vo.setResult(getXml(djxh , N));
		vo.setTranId(TranIdVo.CXLYNSRXGXX);
		String res = "";
		try {
			
			logger.error("===========请求" + TranIdVo.CXLYNSRXGXX +" 开始。。。。");
			
			System.out.println(vo.getDoc());
			
			res = Gt3WebServiceUtil.sendWebService(vo.getDoc());
			logger.error("===========请求" + TranIdVo.CXLYNSRXGXX +" 结束。。。。");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DocTool.getDocument(res);
	}
	
	/**
	 * 生成xml
	 * @return
	 */
	public static String getXml(String djxh , String N) {
		
		String xml = "<taxML xsi:type=\"HXZGFP05051Request\" bbh=\"String\" xmlbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/TaxMLBw_HXZG_FP_05051_Request_V1.0.xsd\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><djxh>"+djxh+"</djxh><tgbz>"+N+"</tgbz></taxML>";
		return xml;
	}
	
}
