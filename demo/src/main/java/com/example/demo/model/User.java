package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Class name: 	User
 * Description: A user is a client of the application
 */
@Entity
@Table(name="users")
public class User {

	@Id
	private int id;
	private String username;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	
	/*
	 * Method name:	Constructor
	 * Description: Create a user with all the parameters for each
	 */
	public User(String username, String firstName, String lastName, String password, String email) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}
	
	/*
	 * Method name:	getId
	 * Description:	Retrieve the id of the user
	 */
	public int getId() {
		return id;
	}
	
	/*
	 * Method name:	setId
	 * Description:	modify the id of the user
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/*
	 * Method name:	getUsername
	 * Description:	Retrieve the firstName of the user
	 */
	public String getUsername() {
		return username;
	}

	
	/*
	 * Method name:	setUsername
	 * Description:	Retrieve the firstName of the user
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/*
	 * Method name:	getFirstName
	 * Description:	modify the firstName of the user
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/*
	 * Method name:	setFirstName
	 * Description:	modify the firstName of the user
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/*
	 * Method name:	getLastName
	 * Description:	Retrieve the lastName of the user
	 */
	public String getLastName() {
		return lastName;
	}
	
	/*
	 * Method name:	setlastName
	 * Description:	modify the lastName of the user
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/*
	 * Method name:	getPassword
	 * Description:	Retrieve the password of the user
	 */
	public String getPassword() {
		return password;
	}
	
	/*
	 * Method name:	setPassword
	 * Description:	modify the lastName of the user
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	
	/*
	 * Method name:	getEmail
	 * Description:	Retrieve the email of the user
	 */
	public String getEmail() {
		return email;
	}

	
	/*
	 * Method name:	setEmail
	 * Description:	modify the email of the user
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	/*
	 * Method name:	toString
	 * Description:	print the User with all its parameters
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", email=" + email + "]";
	}

	
}
