package com.aprendizagem.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aprendizagem.course.entities.Order;
import com.aprendizagem.course.services.OrderService;


@RestController
@RequestMapping(value="/orders")
public class OrderResource {
	
	//"CONTROLLER"
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> listOrders = service.findAll();
		return ResponseEntity.ok().body(listOrders);
	}

	//requisição que recebe um ID na URL
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order Order = service.findById(id);
		return ResponseEntity.ok().body(Order);
		
	}
	
}
