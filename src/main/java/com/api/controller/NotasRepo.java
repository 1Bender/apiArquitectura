package com.api.controller;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface NotasRepo extends CrudRepository<Notas, Integer>, QueryByExampleExecutor<Notas> {
	
	List<Notas> findById(String id);

}
