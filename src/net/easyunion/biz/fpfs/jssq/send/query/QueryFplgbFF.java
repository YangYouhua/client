package net.easyunion.biz.fpfs.jssq.send.query;

import java.util.List;
import java.util.Map;

import net.easyunion.common.util.AnalyzeXml;
import net.easyunion.common.vo.ResultXmlVo;
import net.easyunion.common.webservice.Gt3WebServiceUtil;

public class QueryFplgbFF {
	
	public static List<Map<String, Object>> send(String djxh) throws Exception{
		String xml = QueryModel.getXml("HD001", djxh);
		String res = Gt3WebServiceUtil.sendWebService(xml);
		ResultXmlVo vo = AnalyzeXml.analyzeXyCx(res);
		if(vo.isResult()){
			return vo.getList();
		}else{
			return null;
		}
	}
	
	//{"LRR_DM":"11-6月 -15","SJGSDQ":"11309031200","XGR_DM":"11309000408",
	//"LCSLID":"1E83EAC51A2D0124E0537F000001504C","SFZJHM":"130903198003081218",
	//"SFZJLX_DM":"201","SLSWJG_DM":"11309031200",
	//"FPLGBHM":"13090332027908X139915023482371",
	//"FPGLYXM":"史清岭","FPLGBUUID":"1E83EAC51A2C0124E0537F000001504C"}
	public static void main(String[] args) throws Exception {
		List<Map<String, Object>> list = send("10111309000126611897");
		if(list!= null && list.size()>0){
			for(Map<String, Object> map:list){
				System.out.println(map.get("FPGLYXM"));
			}
		}
	}

}
