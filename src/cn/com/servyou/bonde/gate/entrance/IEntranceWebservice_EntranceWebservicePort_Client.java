
package cn.com.servyou.bonde.gate.entrance;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import net.easyunion.common.util.Base64Util;
import net.easyunion.common.util.DocTool;

import org.apache.commons.io.FileUtils;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;

/**
 * This class was generated by Apache CXF 2.7.17
 * 2015-10-14T19:58:58.239+08:00
 * Generated source version: 2.7.17
 * 
 */
public final class IEntranceWebservice_EntranceWebservicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://entrance.gate.bonde.servyou.com.cn/", "EntranceWebserviceService");

    private IEntranceWebservice_EntranceWebservicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = EntranceWebserviceService.WSDL_LOCATION;
//        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
//            File wsdlFile = new File(args[0]);
//            try {
//                if (wsdlFile.exists()) {
//                    wsdlURL = wsdlFile.toURI().toURL();
//                } else {
//                    wsdlURL = new URL(args[0]);
//                }
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//        }
        wsdlURL = new URL("http://75.16.17.190:7001/cxfservices/BondeService?wsdl");
        EntranceWebserviceService ss = new EntranceWebserviceService(wsdlURL, SERVICE_NAME);
        IEntranceWebservice port = ss.getEntranceWebservicePort();  
        
        {
        System.out.println("Invoking requestService...");
        File file = new File("D:\\fpfs\\FY0101.xml");
		String request = FileUtils.readFileToString(file);
        java.lang.String _requestService_arg0 = "XML-NF";
        java.lang.String _requestService_arg1 = request;
        java.lang.String _requestService__return = port.requestService(_requestService_arg0, _requestService_arg1);
        System.out.println("requestService.result=" + _requestService__return);
        
        Document doc = DocTool.getDocument(_requestService__return);
        String content = DocTool.getChildValue(doc, 0, "content");
        System.out.println(content);
        String decode = Base64Util.decode(content);
        System.out.println(new String(decode.getBytes(),"utf-8"));
        doc = DocTool.getDocument(decode);
//        System.out.println(cdata.getData());
        
//        System.out.println(DocTool.getChildValue(DocTool.getDocument(content), 0, "channel_id"));
        


        }

        System.exit(0);
    }

}