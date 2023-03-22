package com.api.controller;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface UserProfileRepo extends CrudRepository<UserProfile, Integer>, QueryByExampleExecutor<UserProfile> {
	
	

}
