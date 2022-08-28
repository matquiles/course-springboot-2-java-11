package com.aprendizagem.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aprendizagem.course.entities.Users;
import com.aprendizagem.course.services.UserService;


@RestController
@RequestMapping(value="/users")
public class UsersResource {
	
	//"CONTROLLER"
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<Users>> findAll(){
		List<Users> listUsers = service.findAll();
		return ResponseEntity.ok().body(listUsers);
	}

	//requisição que recebe um ID na URL
	@GetMapping(value = "/{id}")
	public ResponseEntity<Users> findById(@PathVariable Long id){
		Users user = service.findById(id);
		return ResponseEntity.ok().body(user);
		
	}
	
}
