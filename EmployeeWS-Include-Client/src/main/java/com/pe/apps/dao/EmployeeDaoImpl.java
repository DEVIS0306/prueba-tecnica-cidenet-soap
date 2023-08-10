package com.pe.apps.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pe.apps.entity.Employee;

@Repository("employeeDao")
@Transactional
public class EmployeeDaoImpl implements EmployeeDao{

	Logger logger = Logger.getLogger(EmployeeDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Employee> getListEmployee() {
		return (List<Employee>)sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
	}

	public boolean addEmployee(Employee employee) {
		boolean flagcomplete=false;
		sessionFactory.getCurrentSession().save(employee);
		flagcomplete=true;
		logger.info("Insert new Employee : "+flagcomplete);
		return flagcomplete;
	}

}
