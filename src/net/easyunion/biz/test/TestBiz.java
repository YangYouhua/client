package net.easyunion.biz.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import net.easyunion.biz.BizMsgCodeConst;
import net.easyunion.biz.IBiz;
import net.easyunion.common.model.ResponseVo;
import net.easyunion.common.service.BaseService;
import net.easyunion.common.util.DocTool;

public class TestBiz extends BaseService implements IBiz {

	private final static Logger logger = LoggerFactory.getLogger(TestBiz.class);
	
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
			
			
			
			vo.setResult("true");
			vo.setResCode(BizMsgCodeConst.ResCode.success.toString());
			vo.setResMsg("成功");
		} catch (Exception e) {
			logger.error("ERR["+tran_id+"]============测试：解析报文xml或查询发生错误！" + e.toString());
			vo.setResCode(BizMsgCodeConst.ResCode.parseXmlErr.toString());
			vo.setResMsg("解析报文xml或查询发生错误！");
			e.printStackTrace();
		} 
		return vo.getDoc();
	}

}