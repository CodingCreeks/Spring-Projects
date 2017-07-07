package com.online.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.online.springhibernate.entities.Employee;
import com.online.springhibernate.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	@Autowired(required=true)
	@Qualifier(value="employeeService")
	public void setEmpservice(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	/*@RequestMapping("/login.do")
	public String showloginpage() {
		return "login.jsp";
	}*/
	
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public String listEmployees(Model model) {
		model.addAttribute("employeeService", new Employee());
		model.addAttribute("listPersons", this.employeeService.listEmployees());
		return "employeeService";
	}
	
	//For add and update person both
	@RequestMapping(value= "/employee/add", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute("employee") Employee employee){
		
		if(employee.getEmpId() == 0){
			//new person, add it
			this.employeeService.addEmployee(employee);
		}else{
			//existing person, call update
			this.employeeService.updateEmployee(employee);
		}
		
		return "redirect:/employees";
		
	}
	
	@RequestMapping("/remove/{id}")
    public String removeEmployee(@PathVariable("id") int id){
		
        this.employeeService.deleteEmployee(id);
        return "redirect:/employees";
    }
 
    @RequestMapping("/edit/{id}")
    public String editEmployee(@PathVariable("id") int id, Model model){
        model.addAttribute("employee", this.employeeService.getEmplopeeById(id));
        model.addAttribute("listemployees", this.employeeService.listEmployees());
        return "employee";
    }
}
