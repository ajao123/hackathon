package com.allissonjardel.hackathon.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allissonjardel.hackathon.entities.Speaker;
import com.allissonjardel.hackathon.repositories.SpeakerRepository;


@Service
public class SpeakerService {

	@Autowired
	private SpeakerRepository repository;
	
	public List<Speaker> findAll() {
		return repository.findAll();
	}
	
	public Speaker findById(String id) {
		Optional<Speaker> obj = repository.findById(id);  
		return obj.get();
	}
	
	public Speaker insert(Speaker obj) {
		return repository.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public Speaker update(Speaker obj, String id) {
		Speaker newObj = repository.findById(id).get();
		BeanUtils.copyProperties(newObj, obj, "id");
		return repository.save(newObj);
	}
	
}
