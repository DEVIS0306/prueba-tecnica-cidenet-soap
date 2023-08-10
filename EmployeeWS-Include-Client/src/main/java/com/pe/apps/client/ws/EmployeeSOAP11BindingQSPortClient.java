package com.pe.apps.client.ws;

import com.pe.apps.client.schema.Employee;
import com.pe.apps.client.schema.EmployeeRequest;
import com.pe.apps.client.schema.EmployeeResponse;

// Este archivo fuente es generado por las herramientas de Oracle.
// Los contenidos pueden estar sujetos a cambios.
// Para reportar problemas, use lo siguiente:
// Generado por Oracle JDeveloper 12c Development Build 12.2.1.1.0.2047
public class EmployeeSOAP11BindingQSPortClient {
    public static void main(String[] args) {
    	try {
    		 
        EmployeeSOAP11BindingQSService employeeSOAP11BindingQSService = new EmployeeSOAP11BindingQSService();
        EmployeePT employeePT = employeeSOAP11BindingQSService.getEmployeeSOAP11BindingQSPort();
       
        EmployeeRequest employeeRequest = new EmployeeRequest();
        
        employeeRequest.setAction("a"); 
        employeeRequest.setEmpalias("teddyone");
        employeeRequest.setEmpdni("33333");
        employeeRequest.setEmpemail("tedy@tat.com");
        employeeRequest.setEmpname("Tedy trejos");
        employeeRequest.setEmppassword("12345");
        
       
		EmployeeResponse empResponse = employeePT.employee(employeeRequest);
		String rptaInsertEmployee = empResponse.getEmpstatusnewemployee();
		System.out.println("Insert Employee : "+rptaInsertEmployee);
		
	
		
		employeeRequest.setAction("l");
		
		empResponse = employeePT.employee(employeeRequest);
		
		for(com.pe.apps.client.schema.Employee emp : empResponse.getEmployees()){
			System.out.println("name : "+emp.getEmpname()+" alias : "+emp.getEmpalias() +" doc identity : "+emp.getEmpdni());
		}
		
		} catch (EmployeeExceptionMessage e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
        
        


    }
}
