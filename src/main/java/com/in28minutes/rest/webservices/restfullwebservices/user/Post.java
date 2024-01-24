package com.in28minutes.rest.webservices.restfullwebservices.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;

@Entity
public class Post {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min = 10)
	private String descrition;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private User user;

	public Integer getId() {
		return id;
	}

	public String getDescrition() {
		return descrition;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", descrition=" + descrition + "]";
	}
	
	

}
