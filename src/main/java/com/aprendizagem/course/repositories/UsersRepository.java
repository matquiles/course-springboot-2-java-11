package com.aprendizagem.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendizagem.course.entities.Users;


public interface UsersRepository extends JpaRepository<Users, Long>{
	

}
