package net.easyunion.biz.fpfs.jssq.send;

import net.easyunion.common.model.Gt3WebServiceVo;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.vo.TranIdVo;
import net.easyunion.common.webservice.Gt3WebServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

public class GetNsrfpjc {
	
	//根据登记序列号等条件查询纳税人发票结存
	private final static Logger logger = LoggerFactory.getLogger(GetNsrfpjc.class);

	/**
	 * 请求webservice
	 * @return
	 * <djxh>10111309000126611897</djxh><zppzDm>0</zppzDm><tdzsbmbz>N</tdzsbmbz>
	 */
	public static Document send(String djxh , String zppzDm) throws Exception{
		Gt3WebServiceVo vo = new Gt3WebServiceVo();
		vo.setResult(getXml(djxh , zppzDm));
		vo.setTranId(TranIdVo.CXNSRFPJC );
		String res = "";
		try {
			logger.error("===========请求" + TranIdVo.CXNSRFPJC  +" 开始。。。。");
			res = Gt3WebServiceUtil.sendWebService(vo.getDoc());
			logger.error("===========请求" + TranIdVo.CXNSRFPJC  +" 结束。。。。");
			System.out.println(res);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DocTool.getDocument(res);
	}
	
	/**
	 * 生成xml
	 * @return
	 */
	public static String getXml(String djxh , String zppzDm) {
		String xml = "<taxML xsi:type=\"HXZGFP00279Request\" bbh=\"String\" xmlbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/TaxMLBw_HXZG_FP_00279_Request_V1.0.xsd\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><djxh>"+djxh+"</djxh><zppzDm>"+zppzDm+"</zppzDm><tdzsbmbz>N</tdzsbmbz></taxML>";
		return xml;
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(send("10111309000126611897",""));
	}


}
