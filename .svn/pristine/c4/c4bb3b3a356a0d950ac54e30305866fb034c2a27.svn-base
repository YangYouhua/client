package net.easyunion.biz.fpfs;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import net.easyunion.biz.BizMsgCodeConst;
import net.easyunion.biz.IBiz;
import net.easyunion.biz.fpfs.ctais.FpfsCtaisService;
import net.easyunion.biz.fpfs.jssq.FpfsJssqService;
import net.easyunion.biz.fpfs.vo.GpResultVo;
import net.easyunion.biz.fpfs.vo.SaveGpxxVo;
import net.easyunion.common.model.ResponseVo;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.vo.Const;

public class BizSaveGpxx implements IBiz {
	
	private final static Logger logger = LoggerFactory.getLogger(BizSaveGpxx.class);
	
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
			String fpkfDm =  DocTool.getChildValue(doc, 0, "fpkfDm"); 
			String lrrDm =  DocTool.getChildValue(doc, 0, "lrrDm"); 
			String fpDm =  DocTool.getChildValue(doc, 0, "fpDm"); 
			String fpQh =  DocTool.getChildValue(doc, 0, "fpQh"); 
			String fpZh =  DocTool.getChildValue(doc, 0, "fpZh"); 
			String fs =  DocTool.getChildValue(doc, 0, "fs"); 
			String fpzlDm =  DocTool.getChildValue(doc, 0, "fpzlDm"); 
			String fpzlDmdz = DocTool.getChildValue(doc, 0, "fpzlDmdz");
			String djxh = DocTool.getChildValue(doc, 0, "djxh");
			String swjgDm = DocTool.getChildValue(doc, 0, "swjgDm");
			String gprXm = DocTool.getChildValue(doc, 0, "gprXm");
			String zppzDm = DocTool.getChildValue(doc, 0, "zppzDm");
			String fpdmmc = DocTool.getChildValue(doc, 0, "fpdmmc");
			String nsrmc = DocTool.getChildValue(doc, 0, "nsrmc");
			String sfzjhm = DocTool.getChildValue(doc, 0, "sfzjhm");
			String fwskSwjgDm = DocTool.getChildValue(doc, 0, "fwskSwjgDm");
			
			SaveGpxxVo gpxxVo = new SaveGpxxVo();
			GpResultVo resultVo = null;
			logger.error("========查询纳税人识别号为：" +nsrsbh+ "=======请求通道为：" + channel);
			
			gpxxVo.setDjxh(djxh);
			gpxxVo.setNsrsbh(nsrsbh);
			gpxxVo.setFpkfDm(fpkfDm);
			gpxxVo.setLrrDm(lrrDm);
			gpxxVo.setFpDm(fpDm);
			gpxxVo.setFpQh(fpQh);
			gpxxVo.setFpZh(fpZh);
			gpxxVo.setFs(Long.parseLong(fs));
			gpxxVo.setFpzlDm(fpzlDm);
			gpxxVo.setFpzlDmdz(fpzlDmdz);
			gpxxVo.setSwjgDm(swjgDm);
			gpxxVo.setGprXm(gprXm);
			gpxxVo.setZppzDm(zppzDm);
			gpxxVo.setFpdmmc(fpdmmc);
			gpxxVo.setSfzjhm(sfzjhm);
			gpxxVo.setNsrmc(nsrmc);
			gpxxVo.setFwskSwjgDm(fwskSwjgDm);
			
			if(Const.CTAIS.equals(channel)){
				resultVo = fpfsCtaisService.saveGpxx(gpxxVo);
			}else if(Const.JSSQ_HXZG.equals(channel)){
				resultVo = fpfsJssqService.saveGpxx(gpxxVo);
			}
			
			vo.setResult(getResult(resultVo));
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
		SaveGpxxVo gpxxVo = new SaveGpxxVo();
		gpxxVo.setDjxh("10111309000126611897");
		gpxxVo.setNsrsbh("13090332027908X");
		gpxxVo.setFpkfDm("4E1C3CA8D56F1043DDD66BC6F0FCB76C");
		gpxxVo.setLrrDm("11309000397");
		gpxxVo.setFpDm("1300054620");
		gpxxVo.setFpQh("00234577");
		gpxxVo.setFpZh("00234577");
		gpxxVo.setFs(1L);
		gpxxVo.setFpzlDm("000008101200");
		gpxxVo.setFpzlDmdz("");
		gpxxVo.setSwjgDm("11309031200");
		gpxxVo.setGprXm("史清岭");
		gpxxVo.setZppzDm("3");
		gpxxVo.setFpdmmc("增值税普通发票（二联无金额限制版）");
		gpxxVo.setSfzjhm("130903198003081218");
		gpxxVo.setNsrmc("沧州昊远科技有限公司");
		IFpfsServie fpfs = new FpfsJssqService();
		fpfs.saveGpxx(gpxxVo);
	}
	
	private String getResult(GpResultVo resultVo){
		//下面报文返回格式自己定义
		StringBuffer result = new StringBuffer();
		
		if(resultVo!=null){
			result.append("<gpxxRes>");
			
			result.append("<isOk>").append(resultVo.isOk()).append("</isOk>");
			result.append("<msg>").append(resultVo.getMsg()).append("</msg>");
			result.append("<lgbhs>").append(resultVo.getLgbhs()).append("</lgbhs>");
			
			result.append("</gpxxRes>");
		}
		
		return result.toString();
	}

}
