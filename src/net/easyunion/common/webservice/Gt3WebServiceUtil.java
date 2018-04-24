package net.easyunion.common.webservice;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import net.easyunion.biz.fpfs.jssq.send.GetNsrxx;
import net.easyunion.common.model.Gt3WebServiceVo;
import net.easyunion.common.util.DocTool;
import net.easyunion.common.util.PropertiesUtil;

import org.apache.commons.io.FileUtils;
import org.w3c.dom.Document;

import cn.com.servyou.bonde.gate.entrance.EntranceWebserviceService;
import cn.com.servyou.bonde.gate.entrance.IEntranceWebservice;
import cn.gov.chinatax.hxzg.spec.Gt3AipWebService;
import cn.gov.chinatax.hxzg.spec.Gt3AipWebService_Service;
import cn.net.easyunion.ws.TsmmsWebService;
import cn.net.easyunion.ws.TsmmsWebServicePortType;

public class Gt3WebServiceUtil {
	
	private static final QName SERVICE_NAME = new QName("http://entrance.gate.bonde.servyou.com.cn/", "EntranceWebserviceService");
	
	/**
	 * 璇锋眰webservice
	 * @param xml 鍙傛暟鎶ユ枃
	 * @throws Exception 
	 */
	public static String sendWebService(String xml) throws Exception{
		
		String channelType = PropertiesUtil.getInstance().getProperties("channel.sy");
		if("true".equals(channelType)){
			String httpUrl = PropertiesUtil.getInstance().getProperties("http.url");
			System.out.println(httpUrl);
			URL wsdlURL = EntranceWebserviceService.WSDL_LOCATION;
			wsdlURL = new URL(httpUrl);
	        EntranceWebserviceService ss = new EntranceWebserviceService(wsdlURL, SERVICE_NAME);
	        IEntranceWebservice port = ss.getEntranceWebservicePort();  
	        String _requestService__return = port.requestService("XML-NF", xml);
			return _requestService__return;
		}else{
			Gt3AipWebService_Service service = new Gt3AipWebService_Service();
			Gt3AipWebService target = service.getGt3AipWebServicePort();
			String request = new String(xml.getBytes(),"utf-8");
			String rtn = target.sendBaseXMLEsbWebService(request);	
			return rtn;
		}
	}
	
	/**
	 * 浪潮通道
	 * @param xml
	 * @return
	 */
	public static String sendLc(String xml){
		TsmmsWebService tws = new TsmmsWebService();
		TsmmsWebServicePortType twspt = tws.getTsmmsWebServiceSOAP11PortHttp();
		String str = twspt.doService(xml);
		return str;
	}
	
	/**
	 * 璇锋眰绋庡弸webservice
	 * @return
	 * @throws Exception 
	 */
	public static String sendWebserviceSY(String xml) throws Exception{
		URL wsdlURL = new URL("http://75.16.40.30:6667/cxfservices/BondeService?wsdl");
		EntranceWebserviceService ss = new EntranceWebserviceService(wsdlURL, new QName("http://entrance.gate.bonde.servyou.com.cn/", "EntranceWebserviceService"));
        IEntranceWebservice port = ss.getEntranceWebservicePort(); 
        String _requestService__return = port.requestService("XML-NF", xml);
        return _requestService__return;
	}

	
	public static void main(String args[]) throws Exception{
		File file = new File("D:\\fpfs\\CX003\\绋庡弸璇锋眰鎶ユ枃.xml");
		String request = FileUtils.readFileToString(file);
//		String res = GetNsrxx.getXml("130903320279081");
//		Gt3WebServiceVo vo = new Gt3WebServiceVo();
//		vo.setResult(res);
//		vo.setTranId("SWZJ.HXZG.DJ.CXNSRXXBYDJXZ");
//		System.out.println(vo.getDoc());
//		System.out.println(sendWebService(vo.getDoc()));
		
//		System.out.println(request);
		
		System.out.println(sendWebService(request));
	}
}
