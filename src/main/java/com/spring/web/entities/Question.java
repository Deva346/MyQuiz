package com.spring.web.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String ques;
	
	private String optionA;
	
	private String optionB;
	
	private String optionC;
	
	private String optionD;
	
	private String ans;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int id, String question, String optionA, String optionB, String optionC, String optionD,
			String ans) {
		super();
		this.id = id;
		this.ques = question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.ans = ans;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return ques;
	}

	public void setQuestion(String question) {
		this.ques = question;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}
}