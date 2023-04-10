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
	 /*
	 @PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNewUser (@RequestParam String name
	      , @RequestParam Integer id) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    Student n = new Student();
	    n.setName(name);
	    notasRepo.save(n);
	    return "Saved";
	  }*/
	  

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
