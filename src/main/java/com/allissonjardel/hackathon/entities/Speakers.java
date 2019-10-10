package com.allissonjardel.hackathon.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Speakers implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String file_id;
	private String trascription_id;
	private String abstract_id;
	private String name;
	private String profession;
	private String additional_info;
	private String phone;
	private String email;
	
	public Speakers() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Speakers(String id, String file_id, String trascription_id, String abstract_id, String name,
			String profession, String additional_info, String phone, String email) {
		super();
		this.id = id;
		this.file_id = file_id;
		this.trascription_id = trascription_id;
		this.abstract_id = abstract_id;
		this.name = name;
		this.profession = profession;
		this.additional_info = additional_info;
		this.phone = phone;
		this.email = email;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		Speakers other = (Speakers) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}

