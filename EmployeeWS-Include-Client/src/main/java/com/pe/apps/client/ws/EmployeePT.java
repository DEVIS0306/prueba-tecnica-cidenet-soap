
package com.pe.apps.client.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import com.pe.apps.client.schema.EmployeeRequest;
import com.pe.apps.client.schema.EmployeeResponse;
import com.pe.apps.client.schema.ObjectFactory;


/**
  * Esta clase fue generada por JAX-WS RI.
  * JAX-WS RI 2.2.11-b150616.1732
  * Versión fuente generada: 2.2
  *
  */
@WebService(name = "EmployeePT", targetNamespace = "http://com.pe.apps/ws")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface EmployeePT {


    /**
     *
     * @param employeeRequest
     * @return
     *     returns com.pe.apps.client.schema.EmployeeResponse
     * @throws EmployeeExceptionMessage
     */
    @WebMethod(action = "http://com.pe.apps/ws/employee")
    @WebResult(name = "employeeResponseElement", targetNamespace = "http://com.pe.apps/schema",
               partName = "employeeResponse")
    public EmployeeResponse employee(@WebParam(name = "employeeRequestElement",
                                               targetNamespace = "http://com.pe.apps/schema",
                                               partName = "employeeRequest")
                                     EmployeeRequest employeeRequest) throws EmployeeExceptionMessage;

}
