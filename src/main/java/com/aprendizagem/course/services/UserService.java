package com.aprendizagem.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendizagem.course.entities.User;
import com.aprendizagem.course.repositories.UsersRepository;

@Service
public class UserService {
	
	@Autowired
	private UsersRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional <User> user = repository.findById(id);
		return user.get();
	}

}
