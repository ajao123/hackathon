package com.allissonjardel.hackathon.entities;

import java.io.Serializable;

public class Location{

	private String address;
	private String city;
	private String country;
	private String state;
	
	public Location() {
		// TODO Auto-generated constructor stub
	}

	public Location(String address, String city, String country, String state) {
		super();
		this.address = address;
		this.city = city;
		this.country = country;
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
