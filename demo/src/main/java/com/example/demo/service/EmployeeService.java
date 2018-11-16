package com.example.demo.service;

import java.util.Collection;
import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;


@Service
public class EmployeeService {
	
	Hashtable<Integer, Employee> employees = new Hashtable<Integer, Employee>();

	public EmployeeService(){
		Employee emp1 = new Employee();
		emp1.setAddress("rue du Bach");
		emp1.setId(10);
		emp1.setName("John");
		employees.put(emp1.getId(), emp1);
		
		Employee emp2 = new Employee();
		emp2.setAddress("Lille");
		emp2.setId(102);
		emp2.setName("Will");
		employees.put(emp2.getId(), emp2);
	}
	
	public Employee getEmployee(int id)
	{
		if(employees.containsKey(id))
		{
			return employees.get(id);
		}
		else
		{
			return null;
		}
	}
	
	public Collection<Employee> getAllEmployeesList(){
		return employees.values();
		
	}
	
	public void addEmployee(int id, String name, String address) {
		Employee emp = new Employee(id, name, address);
		employees.put(emp.getId(), emp);
	}
	
	public void deleteEmployee(int id) {
		if(employees.containsKey(id))
		{
			employees.remove(id);
		}
		else
		{
			System.out.println("employee not existing");
		}
	}
	
	public void changeEmployeeName(int previousId, String name) {
		Employee emp = employees.get(previousId);
		if(emp != null)
		{
			emp.setName(name);
		}
		else
		{
			System.out.println("employee not existing");
		}
	}

	public void changeEmployeeId(int previousId, int newId){
		Employee emp = employees.get(previousId);
		if(emp != null)
		{
			emp.setId(newId);
		}
		else
		{
			System.out.println("Employee doest not exist");
		}
	}
	
	public void changeEmployeeAddress(int id, String address) {
		Employee emp = employees.get(id);
		if(emp != null)
		{
			emp.setAddress(address);
		}
		else
		{
			System.out.println("Employee doest not exist");
		}
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employees == null) ? 0 : employees.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeService other = (EmployeeService) obj;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		return true;
	}

	public Hashtable<Integer, Employee> getAllEmployees()
	{
		return employees;
	}
	
	
}
