package com.aprendizagem.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aprendizagem.course.entities.Category;
import com.aprendizagem.course.services.CategoryService;


@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
	
	//"CONTROLLER"
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> listCategories = service.findAll();
		return ResponseEntity.ok().body(listCategories);
	}

	//requisição que recebe um ID na URL
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category category = service.findById(id);
		return ResponseEntity.ok().body(category);
		
	}
	
}
