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

import com.allissonjardel.hackathon.entities.Lectures;
import com.allissonjardel.hackathon.entities.dto.LecturesDTO;
import com.allissonjardel.hackathon.services.EventService;
import com.allissonjardel.hackathon.services.FileService;
import com.allissonjardel.hackathon.services.LectureService;
import com.allissonjardel.hackathon.services.SpeakerService;

@RestController
@RequestMapping("/lectures")
public class LectureController {
	
	@Autowired
	private LectureService service;
	@Autowired
	private EventService serviceEvent;
	@Autowired
	private SpeakerService serviceSpeaker;
	@Autowired
	private FileService serviceFile;
	
	
	@GetMapping
	public ResponseEntity<List<LecturesDTO>> findAll(){
		List<Lectures> list = service.findAll();
		List<LecturesDTO> listDTO = list.stream().map(x -> new LecturesDTO(x)).collect(Collectors.toList());
		for(LecturesDTO lecture : listDTO) {
			
			if(lecture.getSpeaker() != null) {
				if(serviceEvent.findById(lecture.getEvent_id()) != null) {
					lecture.setEvent(serviceEvent.findById(lecture.getEvent_id()));
				}
			}
			
			if(lecture.getSpeaker_id() != null) {
				if(serviceSpeaker.findById(lecture.getSpeaker_id()) != null) {
					lecture.setSpeaker(serviceSpeaker.findById(lecture.getSpeaker_id()));		
				}
			}
			
			if(lecture.getFile_id() != null) {
				if(serviceFile.findById(lecture.getFile_id()) != null) {
					lecture.setFile(serviceFile.findById(lecture.getFile_id()));
				}
			}
		}
		return ResponseEntity.ok().body(listDTO);
		
	}
	
	@GetMapping("/event/{event_id}")
	public ResponseEntity<List<Lectures>> findLecturesEventById(@PathVariable String event_id){
		List<Lectures> list = service.findLecturesEventById(event_id);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Lectures> findById(@PathVariable String id){
		return ResponseEntity.ok().body(service.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody Lectures lecture){
		service.insert(lecture);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> put(@RequestBody Lectures lecture, @PathVariable String id){
		service.update(lecture, id);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
