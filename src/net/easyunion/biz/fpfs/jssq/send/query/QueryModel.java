package net.easyunion.biz.fpfs.jssq.send.query;

import net.easyunion.common.util.Base64Util;
import net.easyunion.common.util.PropertiesUtil;

public class QueryModel {
	
	public static String getXml(String cxdm, String djxh){
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"
					+"<tiripPackage xmlns=\"http://www.chinatax.gov.cn/dataspec/\">"
					+"	<identity>"
					+"		<application>"
					+"			<applicationId>"+PropertiesUtil.getInstance().getProperties("sy.channel")+"</applicationId>"
					+"			<supplier></supplier>"
					+"			<version></version>"
					+"			<authenticateType></authenticateType>"
					+"			<password></password>"
					+"			<cert></cert>"
					+"		</application>"
					+"		<customer>"
					+"			<customerId></customerId>"
					+"			<authenticateType></authenticateType>"
					+"			<password></password>"
					+"			<cert></cert>"
					+"			<nsrsbh>1234</nsrsbh>"
					+"			<djxh>123</djxh>"
					+"		</customer>"
					+"	</identity>"
					+"	<contentControl>"
					+"		<control>"
					+"			<id>1</id>"
					+"			<type>code</type>"
					+"			<impl>base64</impl>"
					+"		</control>"
					+"	</contentControl>"
					+"	<routerSession>"
					+"		<paramList>"
					+"			<name>sender</name>"
					+"			<value>00000000000</value>"
					+"		</paramList>"
					+"		<paramList>"
					+"			<name>cpid</name>"
					+"			<value>05010100051000</value>"
					+"		</paramList>"
					+"		<paramList>"
					+"			<name>version</name>"
					+"			<value>V5.1.000</value>"
					+"		</paramList>"
					+"	</routerSession>"
					+"	<businessContent>"
					+"		<subPackage>"
					+"			<id>1</id>"
					+"			<content><![CDATA["+getParam(cxdm, djxh)+"]]></content>"
					+"		</subPackage>"
					+"	</businessContent>"
					+"	<sessionId>e4ffa88b230a4c23a0fbfac583426de0</sessionId>"
					+"	<service>"
					+"		<serviceId>JSWB91</serviceId>"
					+"		<clientNo>1</clientNo>"
					+"		<tranSeq>B068684B5DF4438D877800D0D00EF65A</tranSeq>"
					+"	</service>"
					+"</tiripPackage>";
		return xml;
	}
	
	public static String getParam(String cxbm, String djxh){
		String str = "{\"cxbh\":\""+cxbm+"\",\"djxh\":\""+djxh+"\"}";
		return Base64Util.encodeGbk(str);
	}

}
