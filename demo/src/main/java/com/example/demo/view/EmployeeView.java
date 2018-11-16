package com.example.demo.view;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@Controller
@RequestMapping("/employeeView")
public class EmployeeView {
	
	@Autowired
	private EmployeeService employee_service;

	
	@RequestMapping("/all")
	public ModelAndView printEmployees(Model model) {
		Collection<Employee> employees = employee_service.getAllEmployeesList();
		System.out.println(employees);
		model.addAttribute("employees", employees);
		ModelAndView page = new ModelAndView("employeeView");
		return page;
	}

}
