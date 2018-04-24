package net.easyunion.biz.fpfs.jssq.send.query;

import java.util.List;
import java.util.Map;

import net.easyunion.common.util.AnalyzeXml;
import net.easyunion.common.vo.ResultXmlVo;
import net.easyunion.common.webservice.Gt3WebServiceUtil;

public class QueryFpLgb {
	
	public static List<Map<String, Object>> send(String djxh) throws Exception{
		String xml = QueryModel.getXml("HD003", djxh);
		String res = Gt3WebServiceUtil.sendWebService(xml);
		ResultXmlVo vo = AnalyzeXml.analyzeXyCx(res);
		if(vo.isResult()){
			return vo.getList();
		}else{
			return null;
		}
	}
	
	public static void main(String[] args) throws Exception {
		List<Map<String, Object>> list = send("10111309000126611897");
		if(list!= null && list.size()>0){
			for(Map<String, Object> map:list){
				System.out.println(map.get("FPLGBUUID"));
				System.out.println(map.get("SWZJZL_DM"));
				System.out.println(map.get("SWZJHM"));
				System.out.println(map.get("SWZJGLZT_DM"));
				System.out.println(map.get("FPLGBHM"));
			}
		}
	}
	
	
}
