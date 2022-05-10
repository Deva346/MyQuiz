package com.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.web.dao.UserRepository;
import com.spring.web.entities.User;

@Component
public class UserService 
{
	@Autowired
	private UserRepository userRepo; 
	
	//Get All Users
	
	public List<User> getAllUsers()
	{
		List<User> userList = (List<User>) this.userRepo.findAll();
		return userList;
	}
	
	public User addUser(User us)
	{
		User user = userRepo.save(us);
		return user;
	}

}
