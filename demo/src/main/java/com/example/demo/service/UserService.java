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
	
	
	private final UserRepo user_repo;
	
	public UserService(UserRepo repo) {
		this.user_repo = repo;
	}
	
	public void addUser(User user) {
		user_repo.save(user);
	}

}
