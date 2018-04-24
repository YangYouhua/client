package net.easyunion.biz.fpfs.jssq.send;

import net.easyunion.common.model.Gt3WebServiceVo;
import net.easyunion.common.util.AnalyzeXml;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.vo.TranIdVo;
import net.easyunion.common.webservice.Gt3WebServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

public class Jyfstj {
	
	//校验发售条件及提取基本信息初始化业务
	private final static Logger logger = LoggerFactory.getLogger(Jyfstj.class);

	/**
	 * <djxh>10111309000126611897</djxh>
	 * 请求webservice
	 * @return
	 */
	public static Document send(String djxh ) throws Exception{
		Gt3WebServiceVo vo = new Gt3WebServiceVo();
		vo.setResult(getXml(djxh ));
		vo.setTranId(TranIdVo.CXFPFSXXLB );
		String res = "";
		try {
			logger.error("===========请求" + TranIdVo.CXFPFSXXLB  +" 开始。。。。");
			System.out.println(vo.getDoc());
			res = Gt3WebServiceUtil.sendWebService(vo.getDoc());
			logger.error("===========请求" + TranIdVo.CXFPFSXXLB  +" 结束。。。。");
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
	public static String getXml(String djxh ) {
		String xml = "<taxML xsi:type=\"HXZGFP00050Request\" bbh=\"String\" xmlbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/ TaxMLBw_HXZG_FP_00050_Request_V1.0.xsd\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><djxh>"+djxh+"</djxh></taxML>";
		return xml;
	}

	public static void main(String[] args) throws Exception {
//		System.out.println(AnalyzeXml.analyzeJsDoc(send("10111309000126611897")));
		send("10111309000126611897");
	}
}


