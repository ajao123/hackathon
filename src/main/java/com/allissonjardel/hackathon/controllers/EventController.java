package com.allissonjardel.hackathon.controllers;

import java.util.List;
import java.util.stream.Collectors;

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

import com.allissonjardel.hackathon.entities.Events;
import com.allissonjardel.hackathon.entities.dto.EventsDTO;
import com.allissonjardel.hackathon.services.EventService;
import com.allissonjardel.hackathon.services.UserService;

@RestController
@RequestMapping("/events")
public class EventController {
	
	@Autowired
	private EventService service;
	
	@Autowired
	private UserService serviceUser;
	
	@GetMapping
	public ResponseEntity<List<EventsDTO>> findAll(){
		List<Events> list = service.findAll();
		List<EventsDTO> listDTO = list.stream().map(x -> new EventsDTO(x)).collect(Collectors.toList());
		
		for(EventsDTO eventDTO : listDTO) {
			
			if(eventDTO.getUser() != null) {
				if(serviceUser.findById(eventDTO.getUser()) != null) {
					eventDTO.setUsers(serviceUser.findById(eventDTO.getUser()));
				}
			}
		}
		
		return ResponseEntity.ok().body(listDTO);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Events> findById(@PathVariable String id){
		return ResponseEntity.ok().body(service.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody Events event){
		service.insert(event);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> put(@RequestBody Events event, @PathVariable String id){
		service.update(event, id);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
