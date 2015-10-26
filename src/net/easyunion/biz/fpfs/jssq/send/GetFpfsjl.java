package net.easyunion.biz.fpfs.jssq.send;

import java.util.Date;

import net.easyunion.common.model.Gt3WebServiceVo;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.vo.TranIdVo;
import net.easyunion.common.webservice.Gt3WebServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

public class GetFpfsjl {
	
	//根据登记序列号等条件查询纳税人发票结存
	private final static Logger logger = LoggerFactory.getLogger(GetFpfsjl.class);

	/**
	 * <djxh>11440600000000000002</djxh><sssqq>2014-08-01</sssqq><sssqz>2014-08-31</sssqz>
	 * 请求webservice
	 * @return
	 * <djxh>10111309000126611897</djxh><zppzDm>0</zppzDm><tdzsbmbz>N</tdzsbmbz>
	 */
	public static Document send(String djxh , String sssqq , String sssqz) throws Exception{
		Gt3WebServiceVo vo = new Gt3WebServiceVo();
		vo.setResult(getXml(djxh , sssqq , sssqz));
		vo.setTranId(TranIdVo.CXFPFSXXLB );
		String res = "";
		try {
			logger.error("===========请求" + TranIdVo.CXFPFSXXLB  +" 开始。。。。");
			res = Gt3WebServiceUtil.sendWebService(vo.getDoc());
			logger.error("===========请求" + TranIdVo.CXFPFSXXLB  +" 结束。。。。");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DocTool.getDocument(res);
	}
	
	/**
	 * 生成xml
	 * @return
	 */
	public static String getXml(String djxh , String sssqq , String sssqz) {
		String xml = "<taxML xsi:type=\"HXZGFP00276Request\" bbh=\"String\" xmlbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/TaxMLBw_HXZG_FP_00276_Request_V1.0.xsd\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><djxh>"+djxh+"</djxh><sssqq>"+sssqq+"</sssqq><sssqz>"+sssqz+"</sssqz></taxML>";
		return xml;
	}
}
