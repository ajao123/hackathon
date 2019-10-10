package com.allissonjardel.hackathon.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allissonjardel.hackathon.entities.Transcriptions;
import com.allissonjardel.hackathon.repositories.TranscriptionRepository;


@Service
public class TranscriptionService {

	@Autowired
	private TranscriptionRepository repository;
	
	
	public List<Transcriptions> findAll() {
		return repository.findAll();
	}
	
	
	public Transcriptions findById(String id) {
		Optional<Transcriptions> obj = repository.findById(id);  
		return obj.orElseThrow(() ->null); 
	}
	
	public Transcriptions insert(Transcriptions obj) {
		return repository.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public Transcriptions update(Transcriptions obj, String id) {
		Transcriptions newObj = repository.findById(id).get();
		BeanUtils.copyProperties(newObj, obj, "id");
		return repository.save(newObj);
	}
	
}
