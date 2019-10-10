package com.allissonjardel.hackathon.entities.dto;

import com.allissonjardel.hackathon.entities.Events;
import com.allissonjardel.hackathon.entities.Locations;
import com.allissonjardel.hackathon.entities.Users;

public class EventsDTO {

	private String id;
	private String user;
	private Locations location;
	private String name;
	private String description;
	private Users users;
	
	public EventsDTO() {
		// TODO Auto-generated constructor stub
	}

	public EventsDTO(Events event) {
		super();
		this.id = event.getId();
		this.location = event.getLocation();
		this.name = event.getName();
		this.description = event.getDescription();
		this.user = event.getUser();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Locations getLocation() {
		return location;
	}

	public void setLocation(Locations location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	
}
