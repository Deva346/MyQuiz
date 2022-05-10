package com.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController 
{
	@RequestMapping("/")
	public String home()
	{
		System.out.println("This is home page");
		return "home";
	}
	
	@RequestMapping("/quiz")
	public String quiz()
	{
		System.out.println("This is quiz page");
		return "quiz";
	}
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model)
	{
		System.out.println("Inside about handler");
		model.addAttribute("name", "Devasheesh");
		return "about";
	}
	

}
