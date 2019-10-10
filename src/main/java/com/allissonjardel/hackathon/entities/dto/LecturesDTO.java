package com.allissonjardel.hackathon.entities.dto;

import com.allissonjardel.hackathon.entities.Events;
import com.allissonjardel.hackathon.entities.Files;
import com.allissonjardel.hackathon.entities.Lectures;
import com.allissonjardel.hackathon.entities.Speakers;

public class LecturesDTO {
	
	private String event_id;
	private String speaker_id;
	private String file_id;
	private String date;
	private String title;
	private String description;
	private Events event;
	private Speakers speaker;
	private Files file;
	

	public LecturesDTO() {
		// TODO Auto-generated constructor stub
	}

	public LecturesDTO(Lectures lecture) {
		super();
		this.event_id = lecture.getEvent_id();
		this.speaker_id = lecture.getSpeaker_id();
		this.file_id = lecture.getFile_id();
		this.date = lecture.getDate();
		this.title = lecture.getTitle();
		this.description = lecture.getDescription();
	}

	public String getEvent_id() {
		return event_id;
	}

	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}

	public String getSpeaker_id() {
		return speaker_id;
	}

	public void setSpeaker_id(String speaker_id) {
		this.speaker_id = speaker_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Events getEvent() {
		return event;
	}

	public void setEvent(Events event) {
		this.event = event;
	}

	public Speakers getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speakers speaker) {
		this.speaker = speaker;
	}

	public String getFile_id() {
		return file_id;
	}

	public void setFile_id(String file_id) {
		this.file_id = file_id;
	}

	public Files getFile() {
		return file;
	}

	public void setFile(Files file) {
		this.file = file;
	}
	
	
	
}
