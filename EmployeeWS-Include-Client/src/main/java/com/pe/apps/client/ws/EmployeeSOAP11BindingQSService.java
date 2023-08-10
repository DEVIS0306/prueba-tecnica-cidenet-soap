
package com.pe.apps.client.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
  * Servicio OSB
  *
  * Esta clase fue generada por JAX-WS RI.
  * JAX-WS RI 2.2.11-b150616.1732
  * Versión fuente generada: 2.2
  *
  */
@WebServiceClient(name = "EmployeeSOAP11BindingQSService", targetNamespace = "http://com.pe.apps/ws",
                  wsdlLocation =
                  "http://192.168.0.145:7101/SBProjectJdevWSEmployee/proxys/PipelineWSEmployeeProxyService?wsdl")
public class EmployeeSOAP11BindingQSService extends Service {

    private final static URL EMPLOYEESOAP11BINDINGQSSERVICE_WSDL_LOCATION;
    private final static WebServiceException EMPLOYEESOAP11BINDINGQSSERVICE_EXCEPTION;
    private final static QName EMPLOYEESOAP11BINDINGQSSERVICE_QNAME =
        new QName("http://com.pe.apps/ws", "EmployeeSOAP11BindingQSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("http://192.168.0.145:7101/SBProjectJdevWSEmployee/proxys/PipelineWSEmployeeProxyService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMPLOYEESOAP11BINDINGQSSERVICE_WSDL_LOCATION = url;
        EMPLOYEESOAP11BINDINGQSSERVICE_EXCEPTION = e;
    }

    public EmployeeSOAP11BindingQSService() {
        super(__getWsdlLocation(), EMPLOYEESOAP11BINDINGQSSERVICE_QNAME);
    }

    public EmployeeSOAP11BindingQSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMPLOYEESOAP11BINDINGQSSERVICE_QNAME, features);
    }

    public EmployeeSOAP11BindingQSService(URL wsdlLocation) {
        super(wsdlLocation, EMPLOYEESOAP11BINDINGQSSERVICE_QNAME);
    }

    public EmployeeSOAP11BindingQSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMPLOYEESOAP11BINDINGQSSERVICE_QNAME, features);
    }

    public EmployeeSOAP11BindingQSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmployeeSOAP11BindingQSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns EmployeePT
     */
    @WebEndpoint(name = "EmployeeSOAP11BindingQSPort")
    public EmployeePT getEmployeeSOAP11BindingQSPort() {
        return super.getPort(new QName("http://com.pe.apps/ws", "EmployeeSOAP11BindingQSPort"), EmployeePT.class);
    }

    /**
      *
      * Características de @param
      * Una lista de {@link javax.xml.ws.WebServiceFeature} para configurar en el proxy. Las funciones admitidas que no están en el parámetro <code>features</code> tendrán sus valores predeterminados.
      * @devolver
      * devuelve EmpleadoPT
      */
    @WebEndpoint(name = "EmployeeSOAP11BindingQSPort")
    public EmployeePT getEmployeeSOAP11BindingQSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://com.pe.apps/ws", "EmployeeSOAP11BindingQSPort"), EmployeePT.class,
                             features);
    }

    private static URL __getWsdlLocation() {
        if (EMPLOYEESOAP11BINDINGQSSERVICE_EXCEPTION != null) {
            throw EMPLOYEESOAP11BINDINGQSSERVICE_EXCEPTION;
        }
        return EMPLOYEESOAP11BINDINGQSSERVICE_WSDL_LOCATION;
    }

}
