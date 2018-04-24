package net.easyunion.biz.fpfs.jssq.send;

import java.util.Date;

import net.easyunion.biz.fpfs.vo.BsxxVo;
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
 * 保存发票验旧
 * @author Administrator
 *
 */
public class SaveFpyj {
	
	private final static Logger logger = LoggerFactory.getLogger(SaveFpyj.class);

	/**
	 * 请求webservice
	 * @return
	 */
	public static Document send(BsxxVo bsxxVo) throws Exception{
		Gt3WebServiceVo vo = new Gt3WebServiceVo();
		vo.setResult(getXml(bsxxVo));
		vo.setTranId(TranIdVo.BCFPYJJXX );
		vo.setSjjg(bsxxVo.getSwjgDm());
		vo.setSjry(bsxxVo.getLrrDm());
		String res = "";
		try {
			logger.error("===========请求" + TranIdVo.BCFPYJJXX  +" 开始。。。。");
			res = Gt3WebServiceUtil.sendWebService(vo.getDoc());
			logger.error("===========请求" + TranIdVo.BCFPYJJXX  +" 结束。。。。");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DocTool.getDocument(res);
	}
	
	/**
	 * 生成xml
	 * @return
	 */
	public static String getXml(BsxxVo bsxxVo) {
		String fpcyuuid = UUIDUtil.getUUID();
		String xml = "<taxML xsi:type=\"HXZGFP00057Request\" bbh=\"String\" xmlbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/TaxMLBw_HXZG_FP_00057_Request_V1.0.xsd\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
				+"<fpYjjcyqkVO>"
				+"	<sjgsdq>"+bsxxVo.getSwjgDm()+"</sjgsdq>"
				+"	<djxh>"+bsxxVo.getDjxh()+"</djxh>"
				+"	<cyrDm>"+bsxxVo.getLrrDm()+"</cyrDm>"
				+"	<yjjsjlyDm>02</yjjsjlyDm>"//验旧数据来源代码 -------防伪税控验旧
				+"	<cyswjgDm>"+bsxxVo.getSwjgDm()+"</cyswjgDm>"
				+"	<cyrq>"+DateUtils.formatDateToString(new Date())+"</cyrq>"
				+"	<fpwzjl></fpwzjl>"
				+"	<lrrDm>"+bsxxVo.getLrrDm()+"</lrrDm>"
				+"	<fpcyuuid>"+fpcyuuid+"</fpcyuuid>"
				+"	<xgrDm></xgrDm>"
				+"</fpYjjcyqkVO>"
				+"<fpyjjcyqkMxVOList>"
				+"	<fpyjjcyqkMxVOListlb>"
				+"		<fpkjqkDm>"+bsxxVo.getFptkzt()+"</fpkjqkDm>"//发票开具情况结果
				+"		<sjgsdq>"+bsxxVo.getSwjgDm()+"</sjgsdq>"
				+"		<fpzlDm>"+bsxxVo.getFpzlDm()+"</fpzlDm>"
				+"		<kpje>"+bsxxVo.getJe()+"</kpje>"
				+"		<se>"+bsxxVo.getSe()+"</se>"
				+"		<fpzzhm>"+bsxxVo.getFpZh()+"</fpzzhm>"
				+"		<fpyjjgDm>"+getFpyjjgDm(bsxxVo.getFptkzt())+"</fpyjjgDm>"
				+"		<ywuuid>"+UUIDUtil.getUUID()+"</ywuuid>"
				+"		<fpqshm>"+bsxxVo.getFpQh()+"</fpqshm>"
				+"		<fs>"+bsxxVo.getFs()+"</fs>"
				+"		<fpDm>"+bsxxVo.getFpDm()+"</fpDm>"
				+"		<fpcyuuid>"+fpcyuuid+"</fpcyuuid>"
				+"		<lrrDm>"+bsxxVo.getLrrDm()+"</lrrDm>"
				+"		<kpqsrq>"+bsxxVo.getKprqQ()+"</kpqsrq>"
				+"		<cyfpmxuuid>"+UUIDUtil.getUUID()+"</cyfpmxuuid>"
				+"		<xgrDm></xgrDm>"
				+"		<zfbz1>N</zfbz1>"
				+"		<kpjzrq>"+bsxxVo.getKprqZ()+"</kpjzrq>"
				+"	</fpyjjcyqkMxVOListlb>"
				+"</fpyjjcyqkMxVOList>"
				+"<saveType>01</saveType>"
				+"<wfwzdj>false</wfwzdj>"
				+"</taxML>";
		return xml;
	}
	
	public static String getFpyjjgDm(String fpkjqkDm){
		if("10".equals(fpkjqkDm)){
			return "1";
		}else if("20".equals(fpkjqkDm)){
			return "2";
		}else if("90".equals(fpkjqkDm)){
			return "9";
		}else{
			return "";
		}
	}

}
