package com.allissonjardel.hackathon.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allissonjardel.hackathon.entities.Lecture;
import com.allissonjardel.hackathon.repositories.LectureRepository;


@Service
public class LectureService {

	@Autowired
	private LectureRepository repository;
	
	public List<Lecture> findAll() {
		return repository.findAll();
	}
	
	public Lecture findById(String id) {
		Optional<Lecture> obj = repository.findById(id);  
		return obj.get();
	}
	
	public Lecture insert(Lecture obj) {
		return repository.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public Lecture update(Lecture obj, String id) {
		Lecture newObj = repository.findById(id).get();
		BeanUtils.copyProperties(newObj, obj, "id");
		return repository.save(newObj);
	}
	
}
