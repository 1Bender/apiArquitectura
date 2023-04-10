package com.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/acces") // el path y la transformacion de los parametros
public class UserController {
	
  @Autowired 
  private UserRepo userRepository;

  @PostMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String addNewUser (@RequestParam String name
      , @RequestParam String pass) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    User n = new User();
    n.setName(name);
    n.setPass(pass);
    userRepository.save(n);
    return "Saved";
  }
  

  @GetMapping(path="/all")
  public @ResponseBody Iterable<User> getAllUsers() {
    // This returns a JSON or XML with the users
    return userRepository.findAll();
  }
  
  /**
   * Metodo que dara acceso sin mostrar el esquema de datos. Sabemos que en el loggin solo existira un usuario valido.
   * @param name
   * @param pass
   * @return
   */
 @PostMapping(path="/acces")
  public String getAcces(@RequestParam String name, @RequestParam String pass) {
	  
	  String respuesta = "Denegado";
	  String id ="";
	  
	  if(!userRepository.findByNameAndPass(name, pass).isEmpty()) {
		  
		  respuesta = "Concedido";
		  id = String.valueOf(userRepository.findByNameAndPass(name, pass).get(0).getId());
	  }
	  
	  
	  	  
	  return respuesta +" "+ id;
	  
    
 }
 
 /**
  * Metodo, donde una vez el usuario esta validado se usa su id, para extraer la lista de alumnos.
  * @param id
  * @return
  */
@PostMapping(path="/students")
 public @ResponseBody List<User> getAcces(@RequestParam String id) {
	  
	User profe = new User();
	  
	
	
	  return userRepository.findById(id);
	  
   }
	
	
}
