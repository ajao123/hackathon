package com.allissonjardel.hackathon.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allissonjardel.hackathon.entities.Event;
import com.allissonjardel.hackathon.repositories.EventRepository;


@Service
public class EventService {

	@Autowired
	private EventRepository repository;
	
	public List<Event> findAll() {
		return repository.findAll();
	}
	
	public Event findById(String id) {
		Optional<Event> obj = repository.findById(id);  
		return obj.get();
	}
	
	public Event insert(Event obj) {
		return repository.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public Event update(Event obj, String id) {
		Event newObj = repository.findById(id).get();
		BeanUtils.copyProperties(newObj, obj, "id");
		return repository.save(newObj);
	}
	
}
