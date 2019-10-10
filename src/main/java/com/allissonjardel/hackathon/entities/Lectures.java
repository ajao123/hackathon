package com.allissonjardel.hackathon.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Lectures implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String event_id;
	private String speaker_id;
	private String date;
	private String title;
	private String description;
	
	public Lectures() {
		// TODO Auto-generated constructor stub
	}

	public Lectures(String id, String event_id, String speaker_id, String date, String title, String description) {
		super();
		this.id = id;
		this.event_id = event_id;
		this.speaker_id = speaker_id;
		this.date = date;
		this.title = title;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lectures other = (Lectures) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
