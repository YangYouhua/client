package net.easyunion.biz.fpfs.jssq.send;


import net.easyunion.common.model.Gt3WebServiceVo;
import net.easyunion.common.util.AnalyzeXml;
import net.easyunion.common.util.Base64Util;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.vo.ResultXmlVo;
import net.easyunion.common.vo.TranIdVo;
import net.easyunion.common.webservice.Gt3WebServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * 根据税务机关代码查询税务机关库房库存
 * 
 * @author Administrator
 *
 */
public class GetKfxxBySwjgDm {

	// 根据税务机关代码查询税务机关库房库存
	private final static Logger logger = LoggerFactory
			.getLogger(GetFpfsjl.class);

	/**
	 * <djxh>11440600000000000002</djxh><sssqq>2014-08-01</sssqq><sssqz>2014-08-
	 * 31</sssqz> 请求webservice
	 * 
	 * @return 
	 *         <djxh>10111309000126611897</djxh><zppzDm>0</zppzDm><tdzsbmbz>N</tdzsbmbz
	 *         >
	 */
	public static Document send(String swjgDm) throws Exception {
		Gt3WebServiceVo vo = new Gt3WebServiceVo();
		vo.setResult(getXml(swjgDm));
		vo.setTranId(TranIdVo.CXSWJGKFKC);
		String res = "";
		try {
			logger.error("===========请求" + TranIdVo.CXFPFSXXLB + " 开始。。。。");
			System.out.println(vo.getDoc());
			res = Gt3WebServiceUtil.sendWebService(vo.getDoc());
			logger.error("===========请求" + TranIdVo.CXFPFSXXLB + " 结束。。。。");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DocTool.getDocument(res);
	}

	/**
	 * 生成xml
	 * 
	 * @return
	 */
	public static String getXml(String swjgDm) {
		String xml = "<taxML xsi:type=\"HXZGFP00275Request\" bbh=\"String\" xmlbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/ TaxMLBw_HXZG_FP_00275_Request_V1.0.xsd\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
				+ "<swjgDm>"+swjgDm+"</swjgDm></taxML>";
		return xml;
	}
	
	public static void main(String[] args) throws Exception {
		ResultXmlVo str = AnalyzeXml.analyzeJsDoc(send("11309030200"));
		System.out.println(str.getDoc());
	}

}