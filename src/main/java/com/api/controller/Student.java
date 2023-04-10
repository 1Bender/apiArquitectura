package com.api.controller;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
	private String name;
	
	private String special;
	
	@Id
	@Column(name = "id_boletin")
	private String id;
	
	private String city;
	
	private int phone;
	
	@Column(name = "parents_name")
	private String padres;
	



	public Student() {
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSpecial() {
		return special;
	}



	public void setSpecial(String special) {
		this.special = special;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public int getPhone() {
		return phone;
	}



	public void setPhone(int phone) {
		this.phone = phone;
	}



	public String getPadres() {
		return padres;
	}



	public void setPadres(String padres) {
		this.padres = padres;
	}

		
	
	
	
	  
	  

}
