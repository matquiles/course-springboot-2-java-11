package com.aprendizagem.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendizagem.course.entities.User;


public interface UsersRepository extends JpaRepository<User, Long>{
	

}
