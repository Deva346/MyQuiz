package com.spring.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyQuizApplication.class, args);
		
		/*
		 * UserRepository userRepo = context.getBean(UserRepository.class);
		 * 
		 * User user = new User(); user.setName("Devasheesh"); user.setScore(10); User
		 * user1 = userRepo.save(user); System.out.println(user1);
		 */
	}

}
