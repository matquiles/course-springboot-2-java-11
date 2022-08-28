package com.aprendizagem.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendizagem.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
