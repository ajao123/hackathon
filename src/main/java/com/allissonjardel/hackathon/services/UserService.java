package com.allissonjardel.hackathon.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allissonjardel.hackathon.entities.Users;
import com.allissonjardel.hackathon.repositories.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<Users> findAll() {
		return repository.findAll();
	}
	
	public Users findById(String id) {
		Optional<Users> obj = repository.findById(id);  
		return obj.get();
	}
	
	public Users insert(Users obj) {
		return repository.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public Users update(Users obj, String id) {
		Users newObj = repository.findById(id).get();
		BeanUtils.copyProperties(newObj, obj, "id");
		return repository.save(newObj);
	}
	
}
