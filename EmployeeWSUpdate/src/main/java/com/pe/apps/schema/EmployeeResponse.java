
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

    public List<Employee> getEmployees() {
        if (employees == null) {
            employees = new ArrayList<Employee>();
        }
        return this.employees;
    }

}
