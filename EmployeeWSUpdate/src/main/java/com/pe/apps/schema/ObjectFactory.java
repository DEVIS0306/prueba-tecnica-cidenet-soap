
package com.pe.apps.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
  * Este objeto contiene métodos de fábrica para cada
  * Interfaz de contenido Java e interfaz de elementos Java
  * generado en el paquete com.pe.apps.schema.
  * <p>Una ObjectFactory le permite programáticamente
  * construir nuevas instancias de la representación de Java
  * para contenido XML. La representación Java de XML
  * el contenido puede consistir en interfaces derivadas de esquemas
  * y clases que representan el enlace del esquema
  * definiciones de tipo, declaraciones de elementos y modelo
  * grupos. Los métodos de fábrica para cada uno de estos son
  * proporcionado en esta clase.
  *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmployeeRequestElement_QNAME =
        new QName("http://com.pe.apps/schema", "employeeRequestElement");
    private final static QName _EmployeeResponseElement_QNAME =
        new QName("http://com.pe.apps/schema", "employeeResponseElement");
    private final static QName _EmployeeExceptionElement_QNAME =
        new QName("http://com.pe.apps/schema", "employeeExceptionElement");

 
    public ObjectFactory() {
    }


    public EmployeeRequest createEmployeeRequest() {
        return new EmployeeRequest();
    }

  
    public EmployeeResponse createEmployeeResponse() {
        return new EmployeeResponse();
    }

   
    public EmployeeException createEmployeeException() {
        return new EmployeeException();
    }

   
    public Employee createEmployee() {
        return new Employee();
    }

  
    @XmlElementDecl(namespace = "http://com.pe.apps/schema", name = "employeeRequestElement")
    public JAXBElement<EmployeeRequest> createEmployeeRequestElement(EmployeeRequest value) {
        return new JAXBElement<EmployeeRequest>(_EmployeeRequestElement_QNAME, EmployeeRequest.class, null, value);
    }


    @XmlElementDecl(namespace = "http://com.pe.apps/schema", name = "employeeResponseElement")
    public JAXBElement<EmployeeResponse> createEmployeeResponseElement(EmployeeResponse value) {
        return new JAXBElement<EmployeeResponse>(_EmployeeResponseElement_QNAME, EmployeeResponse.class, null, value);
    }


    @XmlElementDecl(namespace = "http://com.pe.apps/schema", name = "employeeExceptionElement")
    public JAXBElement<EmployeeException> createEmployeeExceptionElement(EmployeeException value) {
        return new JAXBElement<EmployeeException>(_EmployeeExceptionElement_QNAME, EmployeeException.class, null,
                                                  value);
    }

}
