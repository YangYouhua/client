package net.easyunion.biz.fpfs.jssq.send;

import net.easyunion.common.model.Gt3WebServiceVo;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.vo.TranIdVo;
import net.easyunion.common.webservice.Gt3WebServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

public class QueryDyxx {
	//查询发票领购簿待打印信息
		private final static Logger logger = LoggerFactory.getLogger(QueryDyxx.class);

		/**
		 * <djxh>10111309000126611897</djxh>
		 * 请求webservice
		 * @return
		 */
		public static Document send(String djxh ,String type ,String ssqq ,String ssqz ) throws Exception{
			Gt3WebServiceVo vo = new Gt3WebServiceVo();
			vo.setResult(getXml(djxh ,type ,ssqq ,ssqz));
			vo.setTranId(TranIdVo.CXFPLGBDYXX );
			String res = "";
			try {
				logger.error("===========请求" + TranIdVo.CXFPLGBDYXX  +" 开始。。。。");
				res = Gt3WebServiceUtil.sendWebService(vo.getDoc());
				logger.error("===========请求" + TranIdVo.CXFPLGBDYXX  +" 结束。。。。");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return DocTool.getDocument(res);
		}
		
		/**
		 * 生成xml
		 * @return
		 */
		public static String getXml(String djxh ,String type ,String ssqq ,String ssqz ) {
			String xml = "<taxML xsi:type=\"HXZGFP05138Request\" bbh=\"String\" xmlbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/ TaxMLBw_HXZG_FP_05138_Request_V1.0.xsd\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><djxh>"+djxh+"</djxh><type>4</type><ssqq>"+ssqq+"</ssqq><ssqz>"+ssqz+"</ssqz></taxML>";
			return xml;
		}
}
