package com.pe.apps.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
		boolean flagComplete=false;
		sessionFactory.getCurrentSession().save(employee);
		flagComplete=true;
		logger.info("Insert new Employee : "+flagComplete);
		return flagComplete;
	}

	@Override
	public List<Employee> getListEmployeeXname(String name) {
		Criteria criteria =sessionFactory.getCurrentSession().createCriteria(Employee.class);
		criteria.add(Restrictions.like("empname", "%"+name+"%"));
		return criteria.list();
	}

	
}
