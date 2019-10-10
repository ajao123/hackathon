package com.allissonjardel.hackathon.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allissonjardel.hackathon.entities.Files;
import com.allissonjardel.hackathon.repositories.FileRepository;


@Service
public class FileService {

	@Autowired
	private FileRepository repository;
	
	public List<Files> findAll() {
		return repository.findAll();
	}
	
	public Files findById(String id) {
		Optional<Files> obj = repository.findById(id);  
		return obj.orElseThrow(() ->null); 
	}
	
	public Files insert(Files obj) {
		return repository.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public Files update(Files obj, String id) {
		Files newObj = repository.findById(id).get();
		BeanUtils.copyProperties(newObj, obj, "id");
		return repository.save(newObj);
	}
	
}
