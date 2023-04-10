package com.api.controller;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private String id;

  private String name;

  private String pass;
  
  
  private ArrayList<String> students = new ArrayList<String>();
  
  




public User() {}



  	
 
  public User(ArrayList<String> students) {
	super();
	this.students = students;
}





public User(String id, String name, String pass, ArrayList<String> students) {
	super();
	this.id = id;
	this.name = name;
	this.pass = pass;
	this.students = students;
}





public ArrayList<String> getStudents() {
		return students;
	}

  public void setStudents(ArrayList<String> students) {
		this.students = students;
	}
	
  

  public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }
}