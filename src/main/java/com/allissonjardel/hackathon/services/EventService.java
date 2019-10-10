package com.allissonjardel.hackathon.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allissonjardel.hackathon.entities.Events;
import com.allissonjardel.hackathon.repositories.EventRepository;


@Service
public class EventService {

	@Autowired
	private EventRepository repository;
	
	public List<Events> findAll() {
		return repository.findAll();
	}
	
	public Events findById(String id) {
		Optional<Events> obj = repository.findById(id);  
		return obj.get();
	}
	
	public Events insert(Events obj) {
		return repository.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public Events update(Events obj, String id) {
		Events newObj = repository.findById(id).get();
		BeanUtils.copyProperties(newObj, obj, "id");
		return repository.save(newObj);
	}
	
}
