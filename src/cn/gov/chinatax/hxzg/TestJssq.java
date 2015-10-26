package cn.gov.chinatax.hxzg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;

import net.easyunion.common.util.JaxbUtil;
import cn.gov.chinatax.hxzg.fp.HXZGFP00050Request;
import cn.gov.chinatax.hxzg.fp.ObjectFactory;
import cn.gov.chinatax.hxzg.spec.Gt3AipWebService;
import cn.gov.chinatax.hxzg.spec.Gt3AipWebService_Service;

public class TestJssq {

	public static void main(String[] args) throws IOException {
//		Gt3AipWebService_Service service = new Gt3AipWebService_Service();
//		ObjectFactory objectFactory = new ObjectFactory();
////		service.get
//		
//		
//		Gt3AipWebService target = service.getGt3AipWebServicePort();
////		Gt3AipWebService target = (Gt3AipWebService) service.create(new QName("http://www.chinatax.gov.cn/spec/", "service"));
//		
////		HXZGFP00050Request request = objectFactory.createHXZGFP00050Request();
////		request.setBbh("String");
////		request.setXmlbh("String");
////		request.setXmlmc("String");
////		request.setDjxh("13090332027908X");
//		//File file = new File("D:\\xml\\request.xml");
//		File file = new File("D:\\fpfs\\xml\\根据登记序号等信息查询纳税人发票发售记录\\Test_FP_00276_Request_CXFPFSXXLB_V1.0.xml");
//		String request = FileUtils.readFileToString(file);
//		
//		request = new String(request.getBytes(),"utf-8");
//		
////		String requestStr = JaxbUtil.convertToXml(request);
//		
//		System.out.println(request);
//		
//		String rtn = target.sendBaseXMLEsbWebService(request);		
//
//		
//		System.out.println(rtn);
		System.out.println(UUID.randomUUID());
	}

}
