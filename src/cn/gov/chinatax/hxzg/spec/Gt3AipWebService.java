
package cn.gov.chinatax.hxzg.spec;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Gt3AipWebService", targetNamespace = "http://www.chinatax.gov.cn/spec/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Gt3AipWebService {


    /**
     * 
     * @param request
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "service", targetNamespace = "http://www.chinatax.gov.cn/spec/", partName = "response")
    public String sendBaseXMLEsbWebService(
        @WebParam(name = "service", targetNamespace = "http://www.chinatax.gov.cn/spec/", partName = "request")
        String request);

}
