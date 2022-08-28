package com.aprendizagem.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendizagem.course.entities.Users;
import com.aprendizagem.course.repositories.UsersRepository;

@Service
public class UserService {
	
	@Autowired
	private UsersRepository repository;
	
	public List<Users> findAll(){
		return repository.findAll();
	}
	
	public Users findById(Long id) {
		Optional <Users> user = repository.findById(id);
		return user.get();
	}

}
