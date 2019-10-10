package com.allissonjardel.hackathon.entities.dto;

import java.util.Date;

import com.allissonjardel.hackathon.entities.Lectures;
import com.allissonjardel.hackathon.entities.Transcriptions;

public class TranscriptionsDTO {

	private String id;
	private String lecture_id;
	private String status;
	private String title;
	private String body;
	private Date createdAt;
	private Lectures lecture;
	
	public TranscriptionsDTO() {
		// TODO Auto-generated constructor stub
	}

	public TranscriptionsDTO(Transcriptions transcription) {
		super();
		this.id = transcription.getId();
		this.lecture_id = transcription.getLecture_id();
		this.status = transcription.getStatus();
		this.title = transcription.getTitle();
		this.body = transcription.getBody();
		this.createdAt = transcription.getCreatedAt();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLecture_id() {
		return lecture_id;
	}

	public void setLecture_id(String lecture_id) {
		this.lecture_id = lecture_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Lectures getLecture() {
		return lecture;
	}

	public void setLecture(Lectures lecture) {
		this.lecture = lecture;
	}
	
}
