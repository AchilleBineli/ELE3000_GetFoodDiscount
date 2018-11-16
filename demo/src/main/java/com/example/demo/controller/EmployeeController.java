package com.example.demo.controller;

import java.util.Collection;
import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

 
@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService emp_sv;
	
	@RequestMapping("home")
	public String home() {
		System.out.println("Here");
		return "welcome";
	}
	@RequestMapping("homepage")
	public ModelAndView homepage() {
		ModelAndView mav = new ModelAndView("homepage");
		return mav;
	}
	
	@GetMapping("/all")
	public Hashtable<Integer, Employee> getAllEmployees(){
		return emp_sv.getAllEmployees();
	}
	
	
	@RequestMapping("/all/list")
	public Collection<Employee>  getEmployeeList() {
		return emp_sv.getAllEmployeesList(); 
	}
		
	
	@RequestMapping("{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		return emp_sv.getEmployee(id);
	}
	
	
	@RequestMapping("/del/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		emp_sv.deleteEmployee(id);
	}
	

	@RequestMapping("/put/{id}/{name}")
	public void modifyEmployeeName(@PathVariable("id") int id, @PathVariable("name") String name) {
		emp_sv.changeEmployeeName(id, name);
	}
	

	@RequestMapping("put/{previousId}/{newId")
	public void modifyEmployeeName(@PathVariable("previousId") int previousId, @PathVariable("newId") int newId) {
		emp_sv.changeEmployeeId(previousId, newId);
	}
	
	
//	@RequestMapping("put/{id}/{address}")
//	public void modifyEmployeeAddress(@PathVariable("id") int id, @PathVariable("address") String address) {
//		emp_sv.changeEmployeeAddress(id, address);
//	}

	@RequestMapping("add/{id}/{name}/{address}")
	public Employee createEmployee(@PathVariable("id") int id, 
			@PathVariable("name") String name, 
			@PathVariable("address")String address) {
		emp_sv.addEmployee(id, name, address);
		return emp_sv.getEmployee(id);
	}
	
}
