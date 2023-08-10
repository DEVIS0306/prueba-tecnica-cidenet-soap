
package com.pe.apps.client.ws;

import javax.xml.ws.WebFault;

import com.pe.apps.client.schema.EmployeeException;


/**
  * Esta clase fue generada por JAX-WS RI.
  * JAX-WS RI 2.2.11-b150616.1732
  * Versión fuente generada: 2.2
  *
  */
@WebFault(name = "employeeExceptionElement", targetNamespace = "http://com.pe.apps/schema")
public class EmployeeExceptionMessage extends Exception {

    /**
      * Tipo de Java que va como soapenv: elemento de detalle de falla.
      *
      */
    private EmployeeException faultInfo;

    /**
     *
     * @param faultInfo
     * @param message
     */
    public EmployeeExceptionMessage(String message, EmployeeException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @param faultInfo
     * @param cause
     * @param message
     */
    public EmployeeExceptionMessage(String message, EmployeeException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @return
     *     returns fault bean: com.pe.apps.client.schema.EmployeeException
     */
    public EmployeeException getFaultInfo() {
        return faultInfo;
    }

}
