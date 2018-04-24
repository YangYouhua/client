package net.easyunion.biz.fpfs;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import net.easyunion.biz.BizMsgCodeConst;
import net.easyunion.biz.IBiz;
import net.easyunion.biz.fpfs.ctais.FpfsCtaisService;
import net.easyunion.biz.fpfs.jssq.FpfsJssqService;
import net.easyunion.common.model.ResponseVo;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.vo.Const;

public class BizGetFxnsr implements IBiz{
	private final static Logger logger = LoggerFactory.getLogger(BizGetNsrzt.class);
	
	@Resource
	private FpfsCtaisService fpfsCtaisService;
	
	@Resource
	private FpfsJssqService fpfsJssqService;
	
	@Override
	public String doWrok(Document doc) {
		ResponseVo vo = new ResponseVo();
		String tran_id = "";
		String tran_seq = "";
		String tran_time = "";
		String channel = "";
		try {
			
			tran_id = DocTool.getChildValue(doc, 0, "tran_id");
			tran_seq = DocTool.getChildValue(doc, 0, "tran_seq");
			tran_time = DocTool.getChildValue(doc, 0, "tran_time");
			channel = DocTool.getChildValue(doc, 0, "channel");
			vo.setTran_id(tran_id);
			vo.setTran_seq(tran_seq);
			vo.setTran_time(tran_time);
			vo.setChannel(channel);
			
			String nsrsbh = DocTool.getChildValue(doc, 0, "nsrsbh");
			
			List<Map<String, Object>> list = null;
			if(Const.CTAIS.equals(channel)){
				list = fpfsCtaisService.getFxnsr(nsrsbh);
			}else if(Const.JSSQ_HXZG.equals(channel)){
				list = fpfsJssqService.getFxnsr(nsrsbh);
			}
			vo.setResult(getResult(list));
			vo.setResCode(BizMsgCodeConst.ResCode.success.toString());
			vo.setResMsg("成功");
		} catch (Exception e) {
			logger.error("ERR["+tran_id+"]============解析报文xml或查询发生错误！" + e.toString());
			vo.setResCode(BizMsgCodeConst.ResCode.parseXmlErr.toString());
			vo.setResMsg("解析报文xml或查询发生错误！");
			e.printStackTrace();
		} 
		return vo.getDoc();
	}

	private String getResult(List<Map<String, Object>> list){
		//下面报文返回格式自己定义
		StringBuffer result = new StringBuffer();
		if(list != null && list.size() > 0){
			for(Map<String, Object> map:list){
				result.append("<getFxnsr>");
				result.append("<fxnsrbz>").append(map.get("fxnsrbz")).append("</fxnsrbz>");
				result.append("</getFxnsr>");
			}
		}else {
			result.append("<getFxnsr><fxnsrbz>0</fxnsrbz></getFxnsr>");
		}
		
		return result.toString();
	}

}
