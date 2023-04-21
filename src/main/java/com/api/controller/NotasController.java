package com.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/notas")
public class NotasController {
	
	
	 @Autowired 
	  private NotasRepo notasRepo;
	 
	 @PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNotes (@RequestParam String id, @RequestParam Double notaMat, @RequestParam Double notaLeng, @RequestParam Double notaDib, @RequestParam Double notaSoci) {

		List<Notas> notas = notasRepo.findById(id);
		if(notaDib!=-100) {
		notas.get(0).setDibujo(notaDib);
		}
		if(notaLeng!=-100) {
		notas.get(0).setLengua(notaLeng);
		}
		if(notaMat!=-100) {
	    notas.get(0).setMatematicas(notaMat);
		}
		if(notaSoci!=-100) {
	    notas.get(0).setSocial(notaSoci);
		}
	    notasRepo.save(notas.get(0));
	    return "saved";
	  }
	  

	  @GetMapping(path="/allStudent")
	  public @ResponseBody Iterable<Notas> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return notasRepo.findAll();
	  }
	  
	  @GetMapping(path="/student")
	  public List<Notas> getUser(@RequestParam String id) {
		  
		  return notasRepo.findById(id);
		  
	    
	 }

}
