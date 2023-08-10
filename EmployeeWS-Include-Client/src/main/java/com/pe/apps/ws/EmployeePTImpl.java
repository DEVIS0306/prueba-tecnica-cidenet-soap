package com.pe.apps.ws;

import java.util.ArrayList;
import java.util.List;

import com.pe.apps.entity.Employee;
import com.pe.apps.schema.EmployeeRequest;
import com.pe.apps.schema.EmployeeResponse;
import com.pe.apps.schema.ObjectFactory;
import com.pe.apps.service.EmployeeService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

@WebService(name = "EmployeePT", targetNamespace = "http://com.pe.apps/ws", serviceName = "EmployeeServices",
            portName = "EmployeePort", wsdlLocation = "/WEB-INF/wsdl/EmployeeServices.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public class EmployeePTImpl extends SpringBeanAutowiringSupport{
	
	Logger logger = Logger.getLogger(EmployeePTImpl.class);
	@Autowired
	@Qualifier("employeeService")
	EmployeeService employeeServiceImpl;
	
    public EmployeePTImpl() {
    }

    @WebResult(name = "employeeResponseElement", partName = "employeeResponse",
               targetNamespace = "http://com.pe.apps/schema")
    @WebMethod(action = "http://com.pe.apps/ws/employee")
    public EmployeeResponse employee(@WebParam(name = "employeeRequestElement", partName = "employeeRequest",
                                               targetNamespace = "http://com.pe.apps/schema")
                                     EmployeeRequest employeeRequest) throws EmployeeExceptionMessage {
    	
    	EmployeeResponse employeeResponse = new EmployeeResponse();
    	String action = employeeRequest.getAction();
    	if(action.equals("a")){
    		Employee employee = new Employee();
    		employee.setEmpalias(employeeRequest.getEmpalias());
    		employee.setEmpdni(employeeRequest.getEmpdni());
    		employee.setEmpemail(employeeRequest.getEmpemail());
    		employee.setEmpname(employeeRequest.getEmpname());
    		employee.setEmppassword(employeeRequest.getEmppassword());
    		
    		boolean rsptaAddEmployee = employeeServiceImpl.addEmployee(employee);
    		
    		String statusAddEmployee = rsptaAddEmployee==true?"OKA":"NO";
    		
    		employeeResponse.setEmpstatusnewemployee(statusAddEmployee);
    		
    	}else if(action.equals("l")){
    		
    		List<Employee> listEmployee = new ArrayList<Employee>();
    		listEmployee = employeeServiceImpl.getListEmployee();
    		for(Employee emp : listEmployee){
    			com.pe.apps.schema.Employee employeeSchema = new com.pe.apps.schema.Employee();
    			employeeSchema.setEmpalias(emp.getEmpalias());
    			employeeSchema.setEmpdni(emp.getEmpdni());
    			employeeSchema.setEmpemail(emp.getEmpemail());
    			employeeSchema.setEmpname(emp.getEmpname());
    			employeeSchema.setEmppassword(emp.getEmppassword());
    			employeeResponse.getEmployees().add(employeeSchema);
    			
    		}
    	
    	}
    	
        return employeeResponse;
    }
}
