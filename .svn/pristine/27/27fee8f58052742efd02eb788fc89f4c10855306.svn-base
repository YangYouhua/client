package net.easyunion.biz.fpfs;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import net.easyunion.biz.BizMsgCodeConst;
import net.easyunion.biz.IBiz;
import net.easyunion.biz.fpfs.ctais.FpfsCtaisService;
import net.easyunion.biz.fpfs.jssq.FpfsJssqService;
import net.easyunion.biz.fpfs.vo.BsxxVo;
import net.easyunion.biz.fpfs.vo.NsrxxVo;
import net.easyunion.common.model.ResponseVo;
import net.easyunion.common.util.BeanXmlUtil;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.vo.Const;

public class BizGetBsxxByNsrsbh implements IBiz {
	
	private final static Logger logger = LoggerFactory.getLogger(BizGetBsxxByNsrsbh.class);
	
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
			
			String nsrsbh =  DocTool.getChildValue(doc, 0, "nsrsbh"); 
			String fpzlDm =  DocTool.getChildValue(doc, 0, "fpzlDm"); 
			String lrrDm =  DocTool.getChildValue(doc, 0, "lrrDm"); 
			String swjgDm =  DocTool.getChildValue(doc, 0, "swjgDm"); 
			
			List<BsxxVo> list = null;
			
			logger.error("========查询纳税人识别号为：" +nsrsbh+ "=======请求通道为：" + channel);
			
			if(Const.CTAIS.equals(channel)){
				list = fpfsCtaisService.getBsxxByNsrsbh(nsrsbh, fpzlDm, lrrDm, swjgDm);
			}else if(Const.JSSQ_HXZG.equals(channel)){
				list = fpfsJssqService.getBsxxByNsrsbh(nsrsbh, fpzlDm, lrrDm, swjgDm);
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
	
	private String getResult(List<BsxxVo> list){
		
		//下面报文返回格式自己定义
		StringBuffer result = new StringBuffer();
		
		if(list!=null){
			result.append("<bsxxs>");
			for(BsxxVo vo:list){
				result.append("<bsxx>").append(BeanXmlUtil.toXmlString(vo)).append("</bsxx>");
			}
			result.append("</bsxxs>");
		}
		
		return result.toString();
	}

}
