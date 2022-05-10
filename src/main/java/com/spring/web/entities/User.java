package com.spring.web.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private int score;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", score=" + score + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
