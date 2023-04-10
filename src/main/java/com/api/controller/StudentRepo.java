package com.api.controller;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface StudentRepo extends CrudRepository<Student, Integer>, QueryByExampleExecutor<Student> {
	
	List<Student> findById(String id);

}
