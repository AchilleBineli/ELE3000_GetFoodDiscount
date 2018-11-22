package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

/*
 * Class name:	UserService
 * Description:	class that performs operations on users 
 */
@Service
@Transactional
public class UserService {
	
	private static volatile UserService instance = null;
	public ArrayList<User> users;
	
	/**
	 * 
	 */
	@Autowired
	private UserRepo user_repo;
	
	/**
	 * Constructor
	 * @param repo
	 * 
	 */
	protected UserService() {
	}
	
	/**
	 * 
	 * @param repo
	 * @return instance of the singleton class UserService
	 */
	public static UserService getInstance() {
		if(UserService.instance == null) {
			synchronized(UserService.class) {
				if(UserService.instance == null) {
					UserService.instance = new UserService();
				}
			}
		}
		return UserService.instance;
	}
	
	
	/**
	 * Add a user to the UserService
	 * @param user
	 */
	public void addUser(User user) {
		user_repo.save(user);
	}


	/**
	 * 
	 * @param username
	 * @param password
	 * @return true if user already exists or false if not
	 */
	public boolean userExists (String username, String password) {
		List<User> users = getAllUsers();
		for(User user : users) {
			if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param username
	 * @return
	 */
	public User getUserByUsername(String username){
		Optional<User> user = user_repo.findById(username);
		return user.get();
	}

	
	/**
	 * 
	 * @return
	 */
	public List<User> getAllUsers() {
		return user_repo.findAll();
	}
	
	
	/**
	 * 
	 */
	public List<User> getUserByPassword(String password) {
		List<User> users = user_repo.findByPassword(password);
		return users;
	}
	
	
	
}
