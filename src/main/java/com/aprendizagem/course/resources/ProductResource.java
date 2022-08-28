package com.aprendizagem.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aprendizagem.course.entities.Product;
import com.aprendizagem.course.services.ProductService;


@RestController
@RequestMapping(value="/products")
public class ProductResource {
	
	//"CONTROLLER"
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> listProducts = service.findAll();
		return ResponseEntity.ok().body(listProducts);
	}

	//requisição que recebe um ID na URL
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product user = service.findById(id);
		return ResponseEntity.ok().body(user);
		
	}
	
}
