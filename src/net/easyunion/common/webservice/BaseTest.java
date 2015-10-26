package net.easyunion.common.webservice;

import java.io.File;
import java.io.IOException;

import javax.xml.rpc.ParameterMode;

import net.easyunion.common.util.HttpUtils;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import org.apache.commons.io.FileUtils;

public class BaseTest {

	public static void main(String[] args) throws Exception {
		getRes();
		File file = new File("D:\\fpfs\\FP10000税友请求.xml");
		String request = FileUtils.readFileToString(file);
//		System.out.println(request);
//		String str = HttpUtils.sendPost("http://75.16.40.30:6667/entranceServlet", request);
//		System.out.println(str);
	}
	
	public static String getRes(){
		try {
			
			File file = new File("D:\\fpfs\\FP10000税友请求.xml");
			String request = FileUtils.readFileToString(file);
			
			String endpoint = "http://75.16.17.190:7001/cxfservices/BondeService?wsdl";  
	        Service service = new Service();  
	        Call call = (Call) service.createCall();  
	        call.setTargetEndpointAddress(endpoint);  
	        call.setOperationName("requestService");//WSDL里面描述的接口名称  
	        call.addParameter("arg0", XMLType.XSD_STRING,ParameterMode.IN);//接口的参数  
	        call.addParameter("arg1", XMLType.XSD_STRING,ParameterMode.IN);//接口的参数  
	        call.setReturnType(XMLType.XSD_STRING);//设置返回类型    
	        String result = (String)call.invoke(new Object[]{"XML-NF", request});  
	        //给方法传递参数，并且调用方法  
	        System.out.println(result); 
	        return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
