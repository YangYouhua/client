package net.easyunion.biz.fpfs;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import net.easyunion.biz.BizMsgCodeConst;
import net.easyunion.biz.IBiz;
import net.easyunion.biz.fpfs.ctais.FpfsCtaisService;
import net.easyunion.biz.fpfs.jssq.FpfsJssqService;
import net.easyunion.biz.fpfs.vo.NsrxxVo;
import net.easyunion.common.model.ResponseVo;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.vo.Const;

public class BizGetNsrxxByNsrsbh implements IBiz {
	
	private final static Logger logger = LoggerFactory.getLogger(BizGetNsrxxByNsrsbh.class);
	
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
			
			List<NsrxxVo> nsrxxVo = new ArrayList<NsrxxVo>();
			
			logger.error("========查询纳税人识别号为：" +nsrsbh+ "=======请求通道为：" + channel);
			
			if(Const.CTAIS.equals(channel)){
				nsrxxVo = fpfsCtaisService.getNsrxxByNsrsbh(nsrsbh);
			}else if(Const.JSSQ_HXZG.equals(channel)){
				nsrxxVo = fpfsJssqService.getNsrxxByNsrsbh(nsrsbh);
			}
			
			vo.setResult(getResult(nsrxxVo));
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
	
	private String getResult(List<NsrxxVo> list){
		//下面报文返回格式自己定义
		StringBuffer result = new StringBuffer();
		logger.error("拼装报文list ：" +list.size()+ "====================");
		if(list!=null && list.size()>0){
			for(NsrxxVo vo : list){
				result.append("<nsrxx>");
				
				result.append("<nsrsbh>").append(vo.getNsrsbh()).append("</nsrsbh>");
				result.append("<nsrmc>").append(vo.getNsrmc()).append("</nsrmc>");
				result.append("<gprIdCard>").append(vo.getGprIdCard()).append("</gprIdCard>");
				result.append("<gprmc>").append(vo.getGprmc()).append("</gprmc>");
				result.append("<nsrlx>").append(vo.getNsrlx()).append("</nsrlx>");
				result.append("<fddbrIdCard>").append(vo.getFddbrIdCard()).append("</fddbrIdCard>");
				result.append("<cwfzrIdCard>").append(vo.getCwfzrIdCard()).append("</cwfzrIdCard>");
				if(StringUtils.isNotEmpty(vo.getDjxh())){
					result.append("<djxh>").append(vo.getDjxh()).append("</djxh>");
					result.append("<swjgdm>").append(vo.getSwjgDm()).append("</swjgdm>");
				}
				
				result.append("</nsrxx>");
			}
		}
		
		return result.toString();
	}
	
//	public static void main(String[] args) {
//		IFpfsServie fpfs = new FpfsJssqService();
//		fpfs.getNsrxxByNsrsbh("13090332027908X");
//	}

}
