package com.api.controller;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "notas")
public class Notas {
	
	private List<Float> matematicas;
	
	private List<Float> social;
	
	private List<Float> lengua;
	
	private List<Float> dibujo;
	
	@Id
	String id;

	public Notas() {
	
	}

	public List<Float> getMatematicas() {
		return matematicas;
	}

	public void setMatematicas(Float nuevaNota) {
		
		this.matematicas.add(nuevaNota);
	}

	public List<Float> getSocial() {
		return social;
	}

	public void setSocial(Float nuevaNota) {
		
		this.social.add(nuevaNota);
	}

	public List<Float> getLengua() {
		return lengua;
	}

	public void setLengua(Float nuevaNota) {
		
		this.lengua.add(nuevaNota);
	}

	public List<Float> getDibujo() {
		return dibujo;
	}

	public void setDibujo(Float nuevaNota) {
		
		this.dibujo.add(nuevaNota);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
	

}
