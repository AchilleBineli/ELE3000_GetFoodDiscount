package co.Demo;

import java.lang.String;


// Bean class or POJO (Plain Old Java Object) 
public class Employee {
	// attributes
	int id;
	String name;
	String address;
	
	//methods
	
	
	public Employee(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Employee() {
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id_=" + this.id + ", name_=" + this.name + ", address_=" + this.address + "]";
	}
	
	public void myInit(){
		System.out.println("Object initiliazed");
	}
	
	public void myDestroy(){
		System.out.println("Object destroyed");
	}


	
}
