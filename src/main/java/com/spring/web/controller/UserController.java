package com.spring.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.web.entities.User;
import com.spring.web.service.UserService;

@RestController
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getusers()
	{
		return this.userService.getAllUsers();
	}
	
	@PostMapping("/create")
	public User addUser(@RequestBody User user)
	{
		User u = this.userService.addUser(user);
		return u;
	}
	
}
