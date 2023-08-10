
package com.pe.apps.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employeeRequest", propOrder = { "action", "empname", "empalias", "emppassword", "empdni", "empemail" })
public class EmployeeRequest {

    protected String action;
    protected String empname;
    protected String empalias;
    protected String emppassword;
    protected String empdni;
    protected String empemail;

    /**
     * Gets the value of the action property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the empname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmpname() {
        return empname;
    }

    /**
     * Sets the value of the empname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmpname(String value) {
        this.empname = value;
    }

    /**
     * Gets the value of the empalias property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmpalias() {
        return empalias;
    }

    /**
     * Sets the value of the empalias property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmpalias(String value) {
        this.empalias = value;
    }

    /**
     * Gets the value of the emppassword property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmppassword() {
        return emppassword;
    }

    /**
     * Sets the value of the emppassword property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmppassword(String value) {
        this.emppassword = value;
    }

    /**
     * Gets the value of the empdni property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmpdni() {
        return empdni;
    }

    /**
     * Sets the value of the empdni property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmpdni(String value) {
        this.empdni = value;
    }

    /**
     * Gets the value of the empemail property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmpemail() {
        return empemail;
    }

    /**
     * Sets the value of the empemail property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmpemail(String value) {
        this.empemail = value;
    }

}
