package com.spring.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.web.entities.Question;
import com.spring.web.service.QuestionService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class QuestionController 
{
	@Autowired
	private QuestionService qService;
	
	@GetMapping("/question")
	public List<Question> question()
	{
		List<Question> ques = this.qService.getTenQuestions();
		return ques;
	}
}
