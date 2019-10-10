package com.allissonjardel.hackathon.entities.dto;

import com.allissonjardel.hackathon.entities.Files;
import com.allissonjardel.hackathon.entities.Speakers;

public class SpeakersDTO {

	private String id;
	private String file_id;
	private String trascription_id;
	private String abstract_id;
	private String name;
	private String profession;
	private String additional_info;
	private String phone;
	private String email;
	private Files file;
	
	public SpeakersDTO() {
		// TODO Auto-generated constructor stub
	}

	public SpeakersDTO(Speakers speaker) {
		super();
		this.id = speaker.getId();
		this.file_id = speaker.getFile_id();
		this.trascription_id = speaker.getTrascription_id();
		this.abstract_id = speaker.getAbstract_id();
		this.name = speaker.getName();
		this.profession = speaker.getProfession();
		this.additional_info = speaker.getAdditional_info();
		this.phone = speaker.getPhone();
		this.email = speaker.getEmail();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFile_id() {
		return file_id;
	}

	public void setFile_id(String file_id) {
		this.file_id = file_id;
	}

	public String getTrascription_id() {
		return trascription_id;
	}

	public void setTrascription_id(String trascription_id) {
		this.trascription_id = trascription_id;
	}

	public String getAbstract_id() {
		return abstract_id;
	}

	public void setAbstract_id(String abstract_id) {
		this.abstract_id = abstract_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getAdditional_info() {
		return additional_info;
	}

	public void setAdditional_info(String additional_info) {
		this.additional_info = additional_info;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Files getFile() {
		return file;
	}

	public void setFile(Files file) {
		this.file = file;
	}
	
}
