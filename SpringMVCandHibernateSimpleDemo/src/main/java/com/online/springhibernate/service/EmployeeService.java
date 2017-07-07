package com.online.springhibernate.service;

import java.util.List;

import com.online.springhibernate.entities.Employee;

public interface EmployeeService {

	public void addEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(int id);

	public Employee getEmplopeeById(int id);

	public List<Employee> listEmployees();

}
