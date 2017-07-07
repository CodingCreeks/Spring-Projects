package com.online.springhibernate.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.online.springhibernate.dao.EmployeeDao;
import com.online.springhibernate.entities.Employee;
import com.online.springhibernate.service.EmployeeService;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	private EmployeeDao employeedao;

	public void setEmployeedao(EmployeeDao employeedao) {
		this.employeedao = employeedao;
	}

	@Override
	@Transactional
	public void addEmployee(Employee employee) {
		this.employeedao.addEmployee(employee);
	}

	@Override
	@Transactional
	public void updateEmployee(Employee employee) {
		this.employeedao.updateEmployee(employee);
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		this.employeedao.deleteEmployee(id);
	}

	@Override
	@Transactional
	public Employee getEmplopeeById(int id) {
		return this.employeedao.getEmplopeeById(id);
	}

	@Override
	@Transactional
	public List<Employee> listEmployees() {
		return this.employeedao.listEmployees();
	}

}
