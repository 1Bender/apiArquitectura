package com.api.controller;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sesion")
public class UserProfile {
	
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Integer id;

	  private String name;
	  
	  

	public UserProfile() {
		super();
	}

	public UserProfile(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	  
	  

}
