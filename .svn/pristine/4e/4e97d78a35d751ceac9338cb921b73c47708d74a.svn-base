package net.easyunion.biz.fpfs.jssq.send;

import java.util.Date;

import net.easyunion.biz.fpfs.vo.SaveGpxxVo;
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
 * 保存发售记录
 * @author Administrator
 *
 */
public class SaveFpfs {
	
	private final static Logger logger = LoggerFactory.getLogger(SaveFpfs.class);
	
	/**
	 * 请求webservice
	 * @return
	 */
	public static Document send(SaveGpxxVo saveGpxxVo) throws Exception{
		Gt3WebServiceVo vo = new Gt3WebServiceVo();
		vo.setResult(getXml(saveGpxxVo));
		vo.setTranId(TranIdVo.BCFSXX );
		vo.setSjjg(saveGpxxVo.getSwjgDm());
		vo.setSjry(saveGpxxVo.getLrrDm());
		String res = "";
		try {
			logger.error("===========请求" + TranIdVo.BCFPYJJXX  +" 开始。。。。");
			System.out.println(vo.getDoc());
			res = Gt3WebServiceUtil.sendWebService(vo.getDoc());
			System.out.println(res);
			logger.error("===========请求" + TranIdVo.BCFPYJJXX  +" 结束。。。。");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DocTool.getDocument(res);
	}
	
	public static String getXml(SaveGpxxVo saveGpxxVo){
		String fplyuuid = UUIDUtil.getUUID();
		String xml = "<taxML xsi:type=\"HXZGFP00051Request\" bbh=\"String\" xmlbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/TaxMLBw_HXZG_FP_00051_Request_V1.0.xsd\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
				+"<lyVO>"
				+"	<sjgsdq>"+saveGpxxVo.getSwjgDm()+"</sjgsdq>"
				+"	<djxh>"+saveGpxxVo.getDjxh()+"</djxh>"
				+"	<fplyuuid>"+fplyuuid+"</fplyuuid>"
				+"	<fpkfDm>"+saveGpxxVo.getFpkfDm()+"</fpkfDm>"
				+"	<sfzjlxDm>100</sfzjlxDm>"
				+"	<gprxm>"+saveGpxxVo.getGprXm()+"</gprxm>"
				+"	<lrrDm>"+saveGpxxVo.getLrrDm()+"</lrrDm>"
				+"	<slswjgDm>"+saveGpxxVo.getSwjgDm()+"</slswjgDm>"
				+"	<xgrDm>"+saveGpxxVo.getLrrDm()+"</xgrDm>"
				+"	<slrq>"+DateUtils.formatDateToString(new Date())+"</slrq>"
				+"	<slrDm>"+saveGpxxVo.getLrrDm()+"</slrDm>"
				+"	<sfzjhm>"+saveGpxxVo.getSfzjhm()+"</sfzjhm>"
				+"</lyVO>"
				+"<mxVOList>"
				+"	<mxVOListlb>"
				+"		<sjgsdq>"+saveGpxxVo.getSwjgDm()+"</sjgsdq>"
				+"		<fpzlDm>"+saveGpxxVo.getFpzlDm()+"</fpzlDm>"
				+"		<fpzzhm>"+saveGpxxVo.getFpZh()+"</fpzzhm>"
				+"		<fpsl>"+saveGpxxVo.getFs()+"</fpsl>"
				+"		<fplymxuuid>"+UUIDUtil.getUUID()+"</fplymxuuid>"
				+"		<wtdkbz>N</wtdkbz>"
				+"		<fpqshm>"+saveGpxxVo.getFpQh()+"</fpqshm>"
				+"		<fpDm>"+saveGpxxVo.getFpDm()+"</fpDm>"
				+"		<fplyuuid>"+fplyuuid+"</fplyuuid>"
				+"		<lrrDm>"+saveGpxxVo.getLrrDm()+"</lrrDm>"
				+"		<xgrDm>"+saveGpxxVo.getLrrDm()+"</xgrDm>"
				+"		<swjgDm>"+saveGpxxVo.getSwjgDm()+"</swjgDm>"
				+"		<defpbz></defpbz>"
				+"		<zppzDm>"+saveGpxxVo.getZppzDm()+"</zppzDm>" //专票票种代码
				+"		<mbfs>1</mbfs>"
				+"		<fpme>0.0</fpme>"   //发票面额
				+"		<zkdklxDm></zkdklxDm>"   //自开代开类型代码
				+"		<fplbDm>1</fplbDm>" //发票类别代码
				+"		<tdhyDm>00</tdhyDm>"//特定行业代码
				+"		<djxh>"+saveGpxxVo.getDjxh()+"</djxh>"
				+"		<phcd>8</phcd>"       //票号长度
				+"		<spryDm>"+saveGpxxVo.getLrrDm()+"</spryDm>"//售票人员代码
				+"		<sprxm></sprxm>"//售票人姓名
				+"		<gprxm>"+saveGpxxVo.getGprXm()+"</gprxm>"
				+"		<sprq>"+DateUtils.formatDateToString(new Date())+"</sprq>"
				+"		<swryxm></swryxm>"
				+"		<jldwDm>0610</jldwDm>"//计量单位代码-----0610  份
				+"		<fpzg></fpzg>"
				+"		<fpdmmc>"+saveGpxxVo.getFpdmmc()+"</fpdmmc>"
				+"		<uuid>"+UUIDUtil.getUUID()+"</uuid>"
				+"		<gptpsysl>0</gptpsysl>"
				+"		<skbz>N</skbz>"   //税控标志
				+"		<rq>"+DateUtils.formatDateToString(new Date())+"</rq>"
				+"		<swjgmc></swjgmc>"
				+"		<dylxDm></dylxDm>"
				+"		<nsrsbh>"+saveGpxxVo.getNsrsbh()+"</nsrsbh>"
				+"		<nsrmc>"+saveGpxxVo.getNsrmc()+"</nsrmc>"
				+"		<bs>"+saveGpxxVo.getFs()+"</bs>"       //本数
				+"		<lgsl>"+saveGpxxVo.getFs()+"</lgsl>"
				+"	</mxVOListlb>"
				+"</mxVOList>"
				+"<tgbz>N</tgbz>"
				+"<gptpsyje>0</gptpsyje>"
				+"</taxML>";
		
		return xml;
	}

}
