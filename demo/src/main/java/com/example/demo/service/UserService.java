package com.example.demo.service;

import javax.transaction.Transactional;

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
	
//	private static volatile UserService instance = null;
	public Iterable<User> users;
	
	/**
	 * 
	 */
	private final UserRepo user_repo;
	
//	/**
//	 * Constructor
//	 * @param repo
//	 * 
//	 */
//	private UserService(UserRepo repo) {
//		this.user_repo = repo;
//	}
//	
//	/**
//	 * 
//	 * @param repo
//	 * @return instance of the singleton class UserService
//	 */
//	public static UserService getInstance(UserRepo repo) {
//		if(UserService.instance == null) {
//			synchronized(UserService.class) {
//				if(UserService.instance == null) {
//					UserService.instance = new UserService(repo);
//				}
//			}
//		}
//		return UserService.instance;
//	}
	
	private UserService(UserRepo repo) {
		this.user_repo = repo;
	}
	
	private static class UserServiceInstanceHolder {
		static UserRepo userRepo;
		private static final UserService THE_UNIQUE_USER_SERVICE = new UserService(userRepo);
	}
	
	public static UserService getInstance() {
		return UserServiceInstanceHolder.THE_UNIQUE_USER_SERVICE;
	}
	
	
	/**
	 * Add a user to the UserService
	 * @param user
	 */
	public void addUser(User user) {
		user_repo.save(user);
	}

	/**
	 * View all users in the database 
	 */
	public void viewAll() {
		this.users = user_repo.findAll();
		
	}
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @return true if user already exists or false if not
	 */
	public boolean userExists (String username, String password) {
		for(User user : users) {
			if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
