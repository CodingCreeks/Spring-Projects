package com.online.springhibernate.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.online.springhibernate.dao.EmployeeDao;
import com.online.springhibernate.entities.Employee;

@Repository
public class EmployeeDaoimpl implements EmployeeDao {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeDaoimpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addEmployee(Employee employee) {

		Session session = this.sessionFactory.getCurrentSession();
		session.persist(employee);
		logger.info("Employee saved successfully, Employee Details=" + employee);
	}

	@Override
	public void updateEmployee(Employee employee) {

		Session session = this.sessionFactory.getCurrentSession();
		session.update(employee);
		logger.info("Employee updated successfully, Employee Details=" + employee);

	}

	@Override
	public void deleteEmployee(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.load(Employee.class, new Integer(id));
		if (null != employee) {
			session.delete(employee);
		}
		logger.info("Person deleted successfully, person details=" + employee);
	}

	@Override
	public Employee getEmplopeeById(int id) {

		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.load(Employee.class, new Integer(id));
		logger.info("Employee loaded successfully, Employee details=" + employee);
		return employee;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> listEmployees() {
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("deprecation")
		List<Employee> employeeList = session.createQuery("from Employee").list();
		for (Employee employee : employeeList) {
			logger.info("Person List::" + employee);
		}
		return employeeList;
	}

}
