package com.pe.apps.ws;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.pe.apps.entity.Employee;
import com.pe.apps.schema.EmployeeRequest;
import com.pe.apps.schema.EmployeeResponse;
import com.pe.apps.schema.ObjectFactory;
import com.pe.apps.service.EmployeeService;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
@WebService(name = "EmployeePT", serviceName = "EmployeeServices", targetNamespace = "http://com.pe.apps/ws",
            portName = "EmployeePort")
public class EmployeePTImpl extends SpringBeanAutowiringSupport{
    
	@Resource
	WebServiceContext wsctx;
	
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
    	
    	if (isAuthentication()){
			    	if (action.equals("a")){
			    		Employee employee = new Employee();
			    		employee.setEmpalias(employeeRequest.getEmpalias());
			    		employee.setEmpdni(employeeRequest.getEmpdni());
			    		employee.setEmpemail(employeeRequest.getEmpemail());
			    		employee.setEmpname(employeeRequest.getEmpname());
			    		employee.setEmppassword(employeeRequest.getEmppassword());
			    		
			    		boolean result = employeeServiceImpl.addEmployee(employee);
			    		
			    		String status = result==true?"OKA":"NO";
			    		
			    		employeeResponse.setEmpstatusnewemployee(status);
			    		
			    	}else if(action.equals("l")){
			    		
			    		List<Employee> listEmployee = new ArrayList<Employee>();
			    		
			    		listEmployee = employeeServiceImpl.getListEmployee();
			    		
			    		for(Employee emp :listEmployee){
			    			com.pe.apps.schema.Employee employeeSchema = new com.pe.apps.schema.Employee();
			    			employeeSchema.setEmpalias(emp.getEmpalias());
			    			employeeSchema.setEmpdni(emp.getEmpdni());
			    			employeeSchema.setEmpemail(emp.getEmpemail());
			    			employeeSchema.setEmpname(emp.getEmpname());
			    			employeeSchema.setEmppassword(emp.getEmppassword());
			    			
			    			employeeResponse.getEmployees().add(employeeSchema);
			    			
			    		}
			    		
			    	
			    	}else if(action.equals("b")){
			    		List<Employee> listEmployee = new ArrayList<Employee>();
			    		
			    		listEmployee = employeeServiceImpl.getListEmployeeXname(employeeRequest.getEmpname());
			    		
			    		for(Employee emp :listEmployee){
			    			com.pe.apps.schema.Employee employeeSchema = new com.pe.apps.schema.Employee();
			    			employeeSchema.setEmpalias(emp.getEmpalias());
			    			employeeSchema.setEmpdni(emp.getEmpdni());
			    			employeeSchema.setEmpemail(emp.getEmpemail());
			    			employeeSchema.setEmpname(emp.getEmpname());
			    			employeeSchema.setEmppassword(emp.getEmppassword());
			    			
			    			employeeResponse.getEmployees().add(employeeSchema);
			    			
			    		}
			    	}
    	}
    	
        return employeeResponse;
    }
    
    public boolean isAuthentication(){
    	MessageContext mctx = wsctx.getMessageContext();
    	Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
    	List userList=(List)http_headers.get("Username");
    	List passList=(List)http_headers.get("Password");
    	
    	String username="";
    	String password="";
    	if(userList!=null){
    		username=userList.get(0).toString();
    	}
    	
    	if(passList!=null){
    		password=passList.get(0).toString();
    	}
    	
    	if(username.equals("alexis")&&password.equals("54321")){
    		return true;
    	}else{
    		return false;
    	}
    	
    	
    }
    
    
  
    
}
