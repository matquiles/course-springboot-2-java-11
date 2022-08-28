package com.aprendizagem.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendizagem.course.entities.Category;
import com.aprendizagem.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
