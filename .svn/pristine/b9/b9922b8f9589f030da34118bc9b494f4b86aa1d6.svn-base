package net.easyunion.biz.fpfs.jssq.send;

import java.util.List;
import java.util.Map;

import net.easyunion.common.model.Gt3WebServiceVo;
import net.easyunion.common.util.AnalyzeXml;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.util.XmlUtil;
import net.easyunion.common.vo.ResultXmlVo;
import net.easyunion.common.vo.TranIdVo;
import net.easyunion.common.webservice.Gt3WebServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

public class QueryGtkcxx {
	//查询柜台库存信息
			private final static Logger logger = LoggerFactory.getLogger(QueryGtkcxx.class);

			/**
			 * <djxh>10111309000126611897</djxh>
			 * 请求webservice
			 * @return
			 */
			public static Document send(String djxh ,String tdzsbmnsr ,String fpkfDm ,String tgbz ) throws Exception{
				Gt3WebServiceVo vo = new Gt3WebServiceVo();
				vo.setResult(getXml(djxh ,tdzsbmnsr ,fpkfDm ,tgbz));
				vo.setTranId(TranIdVo.CXGTCKXX );
				String res = "";
				try {
					logger.error("===========请求" + TranIdVo.CXGTCKXX  +" 开始。。。。");
					res = Gt3WebServiceUtil.sendWebService(vo.getDoc());
					logger.error("===========请求" + TranIdVo.CXGTCKXX  +" 结束。。。。");
				} catch (Exception e) {
					e.printStackTrace();
				}
				return DocTool.getDocument(res);
			}
			
			/**
			 * 生成xml
			 * @return
			 */
			public static String getXml(String djxh ,String tdzsbmnsr ,String fpkfDm ,String tgbz  ) {
				String xml = "<taxML xsi:type=\"HXZGFP05048Request\" bbh=\"String\" xmlbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/ TaxMLBw_HXZG_FP_05048_Request_V1.0.xsd\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><djxh>"+djxh+"</djxh><tdzsbmnsr>N</tdzsbmnsr><fpkfDm>"+fpkfDm+"</fpkfDm><tgbz>N</tgbz></taxML>";
				return xml;
			}
			
			public static void main(String[] args) throws Exception {
				ResultXmlVo str = AnalyzeXml.analyzeJsDoc(send("10111309000126611897","","4E1C3CA8D56F1043DDD66BC6F0FCB76C",""));
				List<Map<String, Object>> kfList = XmlUtil.getListMap(str.getDoc(), "swjgkfkcVOListlb", "2");
				for(Map<String, Object> map:kfList){
					System.out.println("发票起号码：" + map.get("fpqshm") + "，发票止号码：" + map.get("fpzzhm"));
				}
			}

}
