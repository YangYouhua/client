package net.easyunion.common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



import net.easyunion.common.vo.ResultXmlVo;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

public class AnalyzeXml {
	
	private final static Logger logger = LoggerFactory.getLogger(AnalyzeXml.class);
	
	/**
	 * 判断返回报文是金三还是税友报文，解析头部文件，获取返回xml
	 * @param doc
	 * @return
	 * @throws Exception
	 */
	public static ResultXmlVo analyzeJsDoc(Document doc) throws Exception{
		String channelType = PropertiesUtil.getInstance().getProperties("channel.sy");
		ResultXmlVo vo = new ResultXmlVo();
		if("true".equals(channelType)){
			String code = DocTool.getChildValue(doc, 0, "returnCode");
			String message = DocTool.getChildValue(doc, 0, "returnMessage");
			if("0000".equals(code)){
				//税友报文需解密base64
				String res = DocTool.getChildValue(doc, 0, "content");
				res = Base64Util.decodeGbk(res);
				logger.error("税友通道----------金三返回报文："+res);
				Document d = DocTool.getDocument(res);
				code = DocTool.getChildValue(d, 0, "rtn_code");
				message = DocTool.getChildValue(d, 0, "Reason");
				if("0".equals(code)){
					String s = DocTool.getChildValue(d, 0, "body");
					vo.setResult(true);
					if(StringUtils.isNotEmpty(s)){
						vo.setDoc(DocTool.getDocument(s));
					}else{
						vo.setDoc(null);
					}
				}else{
					vo.setResult(false);
					vo.setMessage(message);
				}
			}else{
				vo.setResult(false);
				vo.setMessage(message);
			}
		}else{
			String code = DocTool.getChildValue(doc, 0, "rtn_code");
			String message = DocTool.getChildValue(doc, 0, "Reason");
			if("0".equals(code)){
				String res = DocTool.getChildValue(doc, 0, "body");
				logger.error("金三返回报文："+res);
				vo.setResult(true);
				if(StringUtils.isNotEmpty(res)){
					vo.setDoc(DocTool.getDocument(res));
				}else{
					vo.setDoc(null);
				}
			}else{
				vo.setResult(false);
				vo.setMessage(message);
			}
		}
		
		return vo;
	}
	
	/**
	 * 税友查询接口返回值解析
	 * @param xml
	 * @return
	 * @throws Exception
	 */
	public static ResultXmlVo analyzeXyCx(String xml) throws Exception{
		Document doc = DocTool.getDocument(xml);
		String code = DocTool.getChildValue(doc, 0, "returnCode");
		String message = DocTool.getChildValue(doc, 0, "returnMessage");
		ResultXmlVo resVo = new ResultXmlVo();
		if("0000".equals(code)){
			String content = DocTool.getChildValue(doc, 0, "content");
			content = Base64Util.decodeGbk(content);
			System.out.println(content);
			JSONArray json = JSONArray.fromObject(content);
			List<Map<String, Object>> resList = new ArrayList<Map<String, Object>>();
			Iterator<JSONObject> it = json.iterator();
			while(it.hasNext()){
				JSONObject json2 = it.next();
				resList.add(json2Map(json2.toString()));
			}
			resVo.setResult(true);
			resVo.setList(resList);
		}else{
			resVo.setResult(false);
			resVo.setMessage(message);
		}
		return resVo;
		
	}
	
	public static Map<String, Object> json2Map(String jsonStr){
		Map<String, Object> map = new HashMap<String, Object>();
		JSONObject json = JSONObject.fromObject(jsonStr);
		for(Object k:json.keySet()){
			Object v = json.get(k);
			map.put(k.toString(), v);
		}
		return map;
	}

}
