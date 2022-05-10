package com.spring.web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.spring.web.entities.Question;

public interface QuestionRepository extends CrudRepository<Question, Integer>
{
	@Query(value = "SELECT * FROM question ORDER BY RAND() LIMIT 3", nativeQuery = true)
	public List<Question> getTenQustion();
}
