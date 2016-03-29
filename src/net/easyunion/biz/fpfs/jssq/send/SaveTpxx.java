package net.easyunion.biz.fpfs.jssq.send;

import java.util.Date;

import net.easyunion.biz.fpfs.vo.TpxxVo;
import net.easyunion.common.model.Gt3WebServiceVo;
import net.easyunion.common.util.DateUtils;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.util.UUIDUtil;
import net.easyunion.common.vo.TranIdVo;
import net.easyunion.common.webservice.Gt3WebServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * 保存退票信息
 * @author Administrator
 *
 */
public class SaveTpxx {
	
	private final static Logger logger = LoggerFactory.getLogger(SaveTpxx.class);
	
	/**
	 * 请求webservice
	 * @return
	 */
	public static Document send(TpxxVo tpxxVo) throws Exception{
		Gt3WebServiceVo vo = new Gt3WebServiceVo();
		vo.setResult(getXml(tpxxVo));
		vo.setTranId(TranIdVo.BCFPTKCZ );
		vo.setSjjg(tpxxVo.getSwjgDm());
		vo.setSjry(tpxxVo.getLrrDm());
		String res = "";
		try {
			logger.error("===========请求" + TranIdVo.BCFPTKCZ  +" 开始。。。。");
			System.out.println(vo.getDoc());
			res = Gt3WebServiceUtil.sendWebService(vo.getDoc());
			System.out.println(res);
			logger.error("===========请求" + TranIdVo.BCFPTKCZ  +" 结束。。。。");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DocTool.getDocument(res);
	}
	
	/**
	 * 返回退票信息
	 * @param tpxxVo
	 * @return
	 */
	public static String getXml(TpxxVo tpxxVo){
		String fptpUuid = UUIDUtil.getUUID();
		String xml = "<taxML xsi:type=\"HXZGFP00054Request\" bbh=\"String\" xmlbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/TaxMLBw_HXZG_FP_00054_Request_V1.0.xsd\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
					+"<fpTpVO>"
					+"	<sjgsdq>"+tpxxVo.getSwjgDm()+"</sjgsdq>"
					+"	<djxh>"+tpxxVo.getDjxh()+"</djxh>"
					+"	<fpkfDm>"+tpxxVo.getKfdm()+"</fpkfDm>"
					+"	<sqrxm>"+tpxxVo.getSqrXm()+"</sqrxm>"
					+"	<sqrq>"+DateUtils.formatDateToString(new Date())+"</sqrq>"
					+"	<lrrDm>"+tpxxVo.getLrrDm()+"</lrrDm>"
					+"	<sqly></sqly>"
					+"	<xgrDm></xgrDm>"
					+"	<swjgDm>"+tpxxVo.getSwjgDm()+"</swjgDm>"
					+"	<fptpuuid>"+fptpUuid+"</fptpuuid>"
					+"	<slrq>"+DateUtils.formatDateToString(new Date())+"</slrq>"
					+"	<slrDm>"+tpxxVo.getLrrDm()+"</slrDm>"
					+"</fpTpVO>"
					+"<fpTpMxVOList>"
					+"	<fpTpMxVOListlb>"
					+"		<sjgsdq>"+tpxxVo.getSwjgDm()+"</sjgsdq>"
					+"		<fpzlDm>"+tpxxVo.getFpzlDm()+"</fpzlDm>"
					+"		<fpzzhm>"+tpxxVo.getFpzh()+"</fpzzhm>"
					+"		<fpsl>"+tpxxVo.getBs()+"</fpsl>"
					+"		<fpqshm>"+tpxxVo.getFpqh()+"</fpqshm>"
					+"		<fpDm>"+tpxxVo.getFpDm()+"</fpDm>"
					+"		<lrrDm>"+tpxxVo.getLrrDm()+"</lrrDm>"
					+"		<fptpmxuuid>"+UUIDUtil.getUUID()+"</fptpmxuuid>"
					+"		<xgrDm></xgrDm>"
					+"		<fptpuuid>"+fptpUuid+"</fptpuuid>"
					+"		<bs>"+tpxxVo.getBs()+"</bs>"
					+"		<defpbz>N</defpbz>"
					+"		<zppzDm>"+tpxxVo.getZppzDm()+"</zppzDm>"
					+"		<fplbDm>1</fplbDm>"
					+"		<tdhyDm>00</tdhyDm>"
					+"		<skbz>N</skbz>"
					+"		<mbfs>1</mbfs>"
					+"		<fpme>0</fpme>"
					+"		<rq>"+DateUtils.formatDateToString(new Date())+"</rq>"
					+"		<swjgmc></swjgmc>"
					+"		<dylxDm>99</dylxDm>"
					+"		<fpdmmc>"+tpxxVo.getFpdmmc()+"</fpdmmc>"
					+"		<sqrxm>"+tpxxVo.getSqrXm()+"</sqrxm>"
					+"		<slrq>"+DateUtils.formatDateToString(new Date())+"</slrq>"
					+"		<slrDm>"+tpxxVo.getLrrDm()+"</slrDm>"
					+"		<swryxm></swryxm>"
					+"		<jldwDm>0610</jldwDm>"
					+"		<fpzg></fpzg>" //发票字轨
					+"		<uuid>"+UUIDUtil.getUUID()+"</uuid>"
					+"		<djxh>"+tpxxVo.getDjxh()+"</djxh>"
					+"		<phcd>8</phcd>"
					+"		<lgsl>"+tpxxVo.getBs()+"</lgsl>"
					+"	</fpTpMxVOListlb>"
					+"</fpTpMxVOList>"
					+"</taxML>";
		return xml;
	}

}
