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

import com.allissonjardel.hackathon.entities.Transcriptions;
import com.allissonjardel.hackathon.entities.dto.LecturesDTO;
import com.allissonjardel.hackathon.entities.dto.TranscriptionsDTO;
import com.allissonjardel.hackathon.services.LectureService;
import com.allissonjardel.hackathon.services.TranscriptionService;


@RestController
@RequestMapping("/transcriptions")
public class TranscriptionController {
	
	@Autowired
	private TranscriptionService service;
	
	@Autowired
	private LectureService serviceLecture;
	
	@GetMapping
	public ResponseEntity<List<TranscriptionsDTO>> findAll(){
		List<Transcriptions> list = service.findAll();
		List<TranscriptionsDTO> listDTO = list.stream().map(x -> new TranscriptionsDTO(x)).collect(Collectors.toList());

		for(TranscriptionsDTO transcription : listDTO) {
			
			if(transcription.getLecture() != null) {
				if(serviceLecture.findById(transcription.getLecture_id()) != null) {
					transcription.setLecture(serviceLecture.findById(transcription.getLecture_id()));
				}
			}
			
		}
		return ResponseEntity.ok().body(listDTO);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Transcriptions> findById(@PathVariable String id){
		return ResponseEntity.ok().body(service.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody Transcriptions user){
		service.insert(user);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> put(@RequestBody Transcriptions user, @PathVariable String id){
		service.update(user, id);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
