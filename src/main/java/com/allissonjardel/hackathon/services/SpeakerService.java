package com.allissonjardel.hackathon.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allissonjardel.hackathon.entities.Speakers;
import com.allissonjardel.hackathon.repositories.SpeakerRepository;


@Service
public class SpeakerService {

	@Autowired
	private SpeakerRepository repository;
	
	public List<Speakers> findAll() {
		return repository.findAll();
	}
	
	public Speakers findById(String id) {
		Optional<Speakers> obj = repository.findById(id);  
		return obj.get();
	}
	
	public Speakers insert(Speakers obj) {
		return repository.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public Speakers update(Speakers obj, String id) {
		Speakers newObj = repository.findById(id).get();
		BeanUtils.copyProperties(newObj, obj, "id");
		return repository.save(newObj);
	}
	
}
