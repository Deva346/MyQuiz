package com.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.web.dao.QuestionRepository;
import com.spring.web.entities.Question;

@Component
public class QuestionService 
{
	@Autowired
	private QuestionRepository qrepo;
	
	// get All Questions
	
	public List<Question> getTenQuestions()
	{
		List<Question> quesList = (List<Question>) this.qrepo.getTenQustion();
		return quesList;
	}
}
