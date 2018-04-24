package net.easyunion.biz.fpfs;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import net.easyunion.biz.BizMsgCodeConst;
import net.easyunion.biz.IBiz;
import net.easyunion.biz.fpfs.ctais.FpfsCtaisService;
import net.easyunion.biz.fpfs.jssq.FpfsJssqService;
import net.easyunion.biz.fpfs.vo.GpxxVo;
import net.easyunion.common.model.ResponseVo;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.vo.Const;

public class BizGetNsrGpxx implements IBiz {
	
private final static Logger logger = LoggerFactory.getLogger(BizGetNsrGpxx.class);
	
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
			String fpkfDm =  DocTool.getChildValue(doc, 0, "fpkfDm");
			String lrrDm = DocTool.getChildValue(doc, 0, "lrrDm");
			String swjgDm = DocTool.getChildValue(doc, 0, "swjgDm");
			String djxh = DocTool.getChildValue(doc, 0, "djxh");
			String fpdm = DocTool.getChildValue(doc, 0, "fpdm");
			
			List<GpxxVo> gpxxVo = new ArrayList<GpxxVo>();
			
			String str = "fpzlDm:"+fpzlDm+",fpkfDm:"+fpkfDm+",lrrDm:"+lrrDm+",swjgDm:"+swjgDm+",fpdm:"+fpdm;
			
			logger.error("查询纳税人购票信息，请求参数："+str);
			
			if(Const.CTAIS.equals(channel)){
				gpxxVo = fpfsCtaisService.getNsrGpxx(nsrsbh, fpzlDm, fpkfDm, lrrDm, swjgDm, djxh, fpdm);
			}else if(Const.JSSQ_HXZG.equals(channel)){
				gpxxVo = fpfsJssqService.getNsrGpxx(nsrsbh, fpzlDm, fpkfDm, lrrDm, swjgDm, djxh, fpdm);
			}
			
			vo.setResult(getResult(gpxxVo));
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
	
	private String getResult(List<GpxxVo> nsrxxVo){
		//下面报文返回格式自己定义
		StringBuffer result = new StringBuffer();
		
		if(nsrxxVo!=null && nsrxxVo.size()>0){
			for(GpxxVo vo:nsrxxVo){
				result.append("<gpxx>");
				
				result.append("<fpDm>").append(vo.getFpDm()).append("</fpDm>");
				result.append("<kgsl>").append(vo.getKgsl()).append("</kgsl>");
				result.append("<kfsl>").append(vo.getKfsl()).append("</kfsl>");
				result.append("<fpQh>").append(vo.getFpQh()).append("</fpQh>");
				result.append("<jyxx>").append(vo.getJyxx()).append("</jyxx>");
				result.append("<lysl>").append(vo.getLySl()).append("</lysl>");
				result.append("<ykgSl>").append(vo.getYkgSl()).append("</ykgSl>");
				result.append("<jcSl>").append(vo.getJcSl()).append("</jcSl>");
				result.append("</gpxx>");
			}
		}
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		IFpfsServie fpfs = new FpfsJssqService();
		fpfs.getNsrGpxx("13090332027908X", "000008101200", "4E1C3CA8D56F1043DDD66BC6F0FCB76C", "11309000397", "11302020000", "10111309000126611897", "00234666");
	}

}
