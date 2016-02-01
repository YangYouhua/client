package net.easyunion.common.model;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import net.easyunion.common.util.Base64Util;
import net.easyunion.common.util.DateUtils;
import net.easyunion.common.util.PropertiesUtil;
import net.easyunion.common.util.UUIDUtil;
import net.easyunion.common.vo.TranIdVo;

public class Gt3WebServiceVo {
	
	private final static Logger logger = LoggerFactory.getLogger(Gt3WebServiceVo.class);
	
	private String channelId, tranId, tranSeq, tranDate, tranTime, identityType, sjry, sjjg, result;

	
	public String getTranId() {
		return tranId;
	}

	public void setTranId(String tranId) {
		this.tranId = tranId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getTranSeq() {
		return tranSeq;
	}

	public void setTranSeq(String tranSeq) {
		this.tranSeq = tranSeq;
	}

	public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public String getTranTime() {
		return tranTime;
	}

	public void setTranTime(String tranTime) {
		this.tranTime = tranTime;
	}

	public String getIdentityType() {
		return identityType;
	}

	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getSjry() {
		return sjry;
	}

	public void setSjry(String sjry) {
		this.sjry = sjry;
	}

	public String getSjjg() {
		return sjjg;
	}

	public void setSjjg(String sjjg) {
		this.sjjg = sjjg;
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public String getDoc(){
		
		String channelId = PropertiesUtil.getInstance().getProperties("jssq.channelId");
		String sjry = PropertiesUtil.getInstance().getProperties("jssq.sjry");
		
		String strXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
				+"<service xmlns=\"http://www.chinatax.gov.cn/spec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
				+"	<head>"
				+"		<tran_id>"+this.getTranId()+"</tran_id>"
				+"		<channel_id>"+channelId+"</channel_id>"
				+"		<tran_seq>"+UUIDUtil.getUUID()+"</tran_seq>"
				+"		<tran_date>"+DateUtils.formatDateToString(new Date(), "yyyyMMdd")+"</tran_date>"
				+"		<tran_time>"+DateUtils.formatDateToString(new Date(), "hhmmsssss")+"</tran_time>"
				+"		<expand>"
				+"			<name>identityType</name>"
				+"			<value>"+channelId+"</value>"
				+"		</expand>"
				+"		<expand>"
				+"			<name>sjry</name>"
				+"			<value>"+sjry+"</value>"
				+"		</expand>"
				+"		<expand>"
				+"			<name>sjjg</name>"
				+"			<value>11301022300</value>"
				+"		</expand>"
				+"	</head>"
				+"	<body><![CDATA["+ this.getResult() +"]]></body>"
				+"</service>";
		
		//===============验证是否走税友通道，如果走税友通道，需要在金三报文外在包一层并且金三报文加密=====================
		String channelType = PropertiesUtil.getInstance().getProperties("channel.sy");
		logger.error("金三请求"+this.getTranId()+"报文：" +strXml);
		if("true".equals(channelType)){
			strXml = getSyDoc(strXml);
		}
		
		return strXml;
	}
	
	public String getSyDoc(String jsscDoc){
		String res = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"
				+"<tiripPackage xmlns=\"http://www.chinatax.gov.cn/dataspec/\">"
				+"		<identity>"
				+"	<application>"
				+"		<applicationId>"+PropertiesUtil.getInstance().getProperties("sy.channel")+"</applicationId>"
				+"		<supplier/>"
				+"		<version/>"
				+"		<authenticateType/>"
				+"		<password/>"
				+"		<cert/>"
				+"	</application>"
				+"	<customer>"
				+"		<customerId/>"
				+"		<authenticateType/>"
				+"		<password/>"
				+"		<cert/>"
				+"		<nsrsbh>1234</nsrsbh>"
				+"		<djxh>123</djxh>"
				+"	</customer>"
				+"</identity>"
				+"<contentControl>"
				+"	<control>"
				+"		<id>1</id>"
				+"		<type>code</type>"
				+"		<impl>base64</impl>"
				+"	</control>"
				+"</contentControl>"
				+"<routerSession>"
				+"	<paramList>"
				+"		<name>sender</name>"
				+"		<value>00000000000</value>"
				+"	</paramList>"
				+"	<paramList>"
				+"		<name>cpid</name>"
				+"		<value>05010100051000</value>"
				+"	</paramList>"
				+"	<paramList>"
				+"		<name>version</name>"
				+"		<value>V5.1.000</value>"
				+"	</paramList>"
				+"</routerSession>"
				+"<businessContent>"
				+"	<subPackage>"
				+"		<id>1</id>"
				+"<content><![CDATA["+Base64Util.encodeGbk(jsscDoc)+"]]></content>"
				+"	</subPackage>"
				+"	</businessContent>"
				+"	<returnState>"
				+"		<returnCode></returnCode>"
				+"		<returnMessage></returnMessage>"
				+"	</returnState>"
				+"	<sessionId>"+UUIDUtil.getUUID()+"</sessionId>"
				+"	<service>"
				+"		<serviceId>"+TranIdVo.syServiceMap.get(this.getTranId())+"</serviceId>"
				+"		<clientNo>1</clientNo>"
				+"		<tranSeq>"+UUIDUtil.getUUIDToCase()+"</tranSeq>"
				+"		<repeatFlag></repeatFlag>"
				+"		<tranReqDate></tranReqDate>"
				+"		<unique></unique>"
				+"	</service>"
				+"</tiripPackage>";
		return res;
	}

}
