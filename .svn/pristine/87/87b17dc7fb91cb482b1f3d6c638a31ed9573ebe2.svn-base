package net.easyunion.biz.fpfs;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import net.easyunion.biz.BizMsgCodeConst;
import net.easyunion.biz.IBiz;
import net.easyunion.biz.fpfs.ctais.FpfsCtaisService;
import net.easyunion.biz.fpfs.jssq.FpfsJssqService;
import net.easyunion.biz.fpfs.vo.GpxxVo;
import net.easyunion.biz.fpfs.vo.TpResultVo;
import net.easyunion.biz.fpfs.vo.TpxxVo;
import net.easyunion.common.model.ResponseVo;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.vo.Const;

public class BizSaveTpxx implements IBiz {
	
private final static Logger logger = LoggerFactory.getLogger(BizSaveTpxx.class);
	
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
			String kfdm =  DocTool.getChildValue(doc, 0, "kfdm");
			String lrrDm =  DocTool.getChildValue(doc, 0, "lrrDm");
			String fpDm =  DocTool.getChildValue(doc, 0, "fpDm");
			String fpqh =  DocTool.getChildValue(doc, 0, "fpqh");
			String fpzh =  DocTool.getChildValue(doc, 0, "fpzh");
			String bs =  DocTool.getChildValue(doc, 0, "bs");
			String djxh = DocTool.getChildValue(doc, 0, "djxh");
			String swjgDm = DocTool.getChildValue(doc, 0, "swjgDm");
			String sqrXm = DocTool.getChildValue(doc, 0, "sqrXm");
			String fpzlDm = DocTool.getChildValue(doc, 0, "fpzlDm");
			String zppzDm = DocTool.getChildValue(doc, 0, "zppzDm");
			String fpdmmc = DocTool.getChildValue(doc, 0, "fpdmmc");
			
			TpxxVo tpxxVo = new TpxxVo();
			
			
			tpxxVo.setBs(Integer.parseInt(bs));
			tpxxVo.setDj(0.0);
			tpxxVo.setFpDm(fpDm);
			tpxxVo.setFpqh(fpqh);
			tpxxVo.setFpzh(fpzh);
			tpxxVo.setJe(0.0);
			tpxxVo.setKfdm(kfdm);
			tpxxVo.setLrrDm(lrrDm);
			tpxxVo.setNsrsbh(nsrsbh);
			tpxxVo.setYssphm("0000000000");
			
			//******金三所需要的参数
			tpxxVo.setDjxh(djxh);
			tpxxVo.setSwjgDm(swjgDm);
			tpxxVo.setSqrXm(sqrXm);
			tpxxVo.setFpzlDm(fpzlDm);
			tpxxVo.setZppzDm(zppzDm);
			tpxxVo.setFpdmmc(fpdmmc);
			
			
			
			TpResultVo resVo = new TpResultVo();
			
			logger.error("========查询纳税人识别号为：" +nsrsbh+ "=======请求通道为：" + channel);
			
			if(Const.CTAIS.equals(channel)){
				resVo = fpfsCtaisService.saveTpxx(tpxxVo);
			}else if(Const.JSSQ_HXZG.equals(channel)){
				resVo = fpfsJssqService.saveTpxx(tpxxVo);
			}
			
			vo.setResult(getResult(resVo));
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
	
	public static void main(String[] args) {
		TpxxVo tpxxVo = new TpxxVo();
		
		tpxxVo.setDjxh("10111309000126611897");
		tpxxVo.setBs(1);
		tpxxVo.setDj(0.0);
		tpxxVo.setFpDm("1300054620");
		tpxxVo.setFpqh("00234577");
		tpxxVo.setFpzh("00234577");
		tpxxVo.setJe(0.0);
		tpxxVo.setKfdm("4E1C3CA8D56F1043DDD66BC6F0FCB76C");
		tpxxVo.setLrrDm("11309000397");
		tpxxVo.setNsrsbh("13090332027908X");
		tpxxVo.setYssphm("0000000000");
		tpxxVo.setSwjgDm("11309031200");
		tpxxVo.setSqrXm("史清岭");
		tpxxVo.setFpzlDm("000008101200");
		tpxxVo.setZppzDm("3");
		tpxxVo.setFpdmmc("增值税普通发票（二联无金额限制版）");
		IFpfsServie fpfs = new FpfsJssqService();
		fpfs.saveTpxx(tpxxVo);
	}
	
	private String getResult(TpResultVo resVo){
		//下面报文返回格式自己定义
		StringBuffer result = new StringBuffer();
		
		if(resVo!=null){
			result.append("<tpxxRes>");
			
			result.append("<isOk>").append(resVo.isOk()).append("</isOk>");
			result.append("<msg>").append(resVo.getMsg()).append("</msg>");
			
			result.append("</tpxxRes>");
		}
		
		return result.toString();
	}

}
