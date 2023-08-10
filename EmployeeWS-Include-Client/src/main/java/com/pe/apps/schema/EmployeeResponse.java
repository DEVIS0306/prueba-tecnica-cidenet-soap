
package com.pe.apps.schema;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employeeResponse", propOrder = { "empstatusnewemployee", "employees" })
public class EmployeeResponse {

    @XmlElement(required = true)
    protected String empstatusnewemployee;
    protected List<Employee> employees;

    /**
     * Gets the value of the empstatusnewemployee property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmpstatusnewemployee() {
        return empstatusnewemployee;
    }

    /**
     * Sets the value of the empstatusnewemployee property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmpstatusnewemployee(String value) {
        this.empstatusnewemployee = value;
    }

  /**
      * Obtiene el valor de la propiedad de los empleados.
      *
      *
      * Este método de acceso devuelve una referencia a la lista en vivo,
      * no es una instantánea. Por lo tanto, cualquier modificación que realice en el
      * la lista devuelta estará presente dentro del objeto JAXB.
      * Es por eso que no hay un método <CODE>set</CODE> para la propiedad de los empleados.
      *
      *
      * Por ejemplo, para agregar un nuevo elemento, haga lo siguiente:
      * <antes>
      * getEmployees().add(newItem);
      * </pre>
      *
      *
      *
      * Los objetos de los siguientes tipos están permitidos en la lista
      * {@link Empleado }
      *
      *
      */
    public List<Employee> getEmployees() {
        if (employees == null) {
            employees = new ArrayList<Employee>();
        }
        return this.employees;
    }

}
