package com.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/profile")
public class UserProfileController {
	
	
	 @Autowired 
	  private UserProfileRepo profileRepo;
	 
	 @PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNewUser (@RequestParam String name
	      , @RequestParam Integer id) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    UserProfile n = new UserProfile();
	    n.setName(name);
	    profileRepo.save(n);
	    return "Saved";
	  }
	  

	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<UserProfile> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return profileRepo.findAll();
	  }
	  
	  @GetMapping(path="/user")
	  public Optional<UserProfile> getUser(@RequestParam Integer id) {
		  
		  return profileRepo.findById(id);
		  
	    
	 }

}
