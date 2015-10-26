/**
 * EntranceWebserviceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.servyou.bonde.gate.entrance;

public class EntranceWebserviceServiceLocator extends org.apache.axis.client.Service implements cn.com.servyou.bonde.gate.entrance.EntranceWebserviceService {

    public EntranceWebserviceServiceLocator() {
    }


    public EntranceWebserviceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EntranceWebserviceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EntranceWebservicePort
    private java.lang.String EntranceWebservicePort_address = "http://75.16.17.190:7001/cxfservices/BondeService";

    public java.lang.String getEntranceWebservicePortAddress() {
        return EntranceWebservicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EntranceWebservicePortWSDDServiceName = "EntranceWebservicePort";

    public java.lang.String getEntranceWebservicePortWSDDServiceName() {
        return EntranceWebservicePortWSDDServiceName;
    }

    public void setEntranceWebservicePortWSDDServiceName(java.lang.String name) {
        EntranceWebservicePortWSDDServiceName = name;
    }

    public cn.com.servyou.bonde.gate.entrance.IEntranceWebservice getEntranceWebservicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EntranceWebservicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEntranceWebservicePort(endpoint);
    }

    public cn.com.servyou.bonde.gate.entrance.IEntranceWebservice getEntranceWebservicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.com.servyou.bonde.gate.entrance.EntranceWebserviceServiceSoapBindingStub _stub = new cn.com.servyou.bonde.gate.entrance.EntranceWebserviceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getEntranceWebservicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEntranceWebservicePortEndpointAddress(java.lang.String address) {
        EntranceWebservicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.com.servyou.bonde.gate.entrance.IEntranceWebservice.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.com.servyou.bonde.gate.entrance.EntranceWebserviceServiceSoapBindingStub _stub = new cn.com.servyou.bonde.gate.entrance.EntranceWebserviceServiceSoapBindingStub(new java.net.URL(EntranceWebservicePort_address), this);
                _stub.setPortName(getEntranceWebservicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EntranceWebservicePort".equals(inputPortName)) {
            return getEntranceWebservicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://entrance.gate.bonde.servyou.com.cn/", "EntranceWebserviceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://entrance.gate.bonde.servyou.com.cn/", "EntranceWebservicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EntranceWebservicePort".equals(portName)) {
            setEntranceWebservicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
