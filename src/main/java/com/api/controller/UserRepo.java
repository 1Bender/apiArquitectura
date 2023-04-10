package com.api.controller;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;



public interface UserRepo extends CrudRepository<User, Integer>, QueryByExampleExecutor<User> {
	
	List<User> findByName(String name);
	List<User> findByNameAndPass(String name, String pass);
	List<User> findById(String id);

}