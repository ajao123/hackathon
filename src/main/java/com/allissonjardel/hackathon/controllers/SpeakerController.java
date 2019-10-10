package com.allissonjardel.hackathon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allissonjardel.hackathon.entities.Speakers;
import com.allissonjardel.hackathon.services.SpeakerService;

@RestController
@RequestMapping("/speakers")
public class SpeakerController {
	
	@Autowired
	private SpeakerService service;
	
	@GetMapping
	public ResponseEntity<List<Speakers>> findAll(){
		List<Speakers> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Speakers> findById(@PathVariable String id){
		return ResponseEntity.ok().body(service.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody Speakers speaker){
		service.insert(speaker);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> put(@RequestBody Speakers speaker, @PathVariable String id){
		service.update(speaker, id);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
