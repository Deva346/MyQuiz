package com.spring.web.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.web.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>
{
	
}
