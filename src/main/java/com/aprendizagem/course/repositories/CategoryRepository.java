package com.aprendizagem.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendizagem.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
