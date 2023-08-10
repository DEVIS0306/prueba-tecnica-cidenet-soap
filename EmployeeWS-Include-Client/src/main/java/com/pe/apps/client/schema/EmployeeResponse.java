
package com.pe.apps.client.schema;

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


    public String getEmpstatusnewemployee() {
        return empstatusnewemployee;
    }


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
