package com.allissonjardel.hackathon.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allissonjardel.hackathon.entities.Lectures;
import com.allissonjardel.hackathon.repositories.LectureRepository;


@Service
public class LectureService {

	@Autowired
	private LectureRepository repository;
	
	public List<Lectures> findAll() {
		return repository.findAll();
	}
	
	public List<Lectures> findLecturesEventById(String event_id) {
		return repository.searchLectures(event_id);
	}
	
	public Lectures findById(String id) {
		Optional<Lectures> obj = repository.findById(id);  
		return obj.get();
	}
	
	public Lectures insert(Lectures obj) {
		return repository.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public Lectures update(Lectures obj, String id) {
		Lectures newObj = repository.findById(id).get();
		BeanUtils.copyProperties(newObj, obj, "id");
		return repository.save(newObj);
	}
	
	
}
