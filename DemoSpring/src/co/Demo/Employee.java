package co.Demo;

import java.lang.String;


// Bean class or POJO (Plain Old Java Object) 
public class Employee {
	// attributes
	int id_;
	String name_;
	String address_;
	
	//methods
	
	
	public Employee(int id, String name, String address) {
		this.id_ = id;
		this.name_ = name;
		this.address_ = address;
	}

	public Employee() {
	}

	public int getId() {
		return id_;
	}

	public void setId(int id) {
		this.id_ = id;
	}

	public String getName() {
		return name_;
	}

	public void setName(String name) {
		this.name_ = name;
	}

	public String getAddress() {
		return address_;
	}

	public void setAddress(String address) {
		this.address_ = address;
	}

	@Override
	public String toString() {
		return "Employee [id_=" + id_ + ", name_=" + name_ + ", address_=" + address_ + "]";
	}
	


	
}
