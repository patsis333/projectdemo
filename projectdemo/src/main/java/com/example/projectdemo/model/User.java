package com.example.projectdemo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class User {
	@Id
	private int id;
	private String firstname;
	private String lastname;
	@Column(name = "created_at")
    @CreationTimestamp
	private Date applydate;
	
	public User() {}
	
	public User(int id, String firstname, String lastname, Date applydate) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.applydate = applydate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getapplydate() {
		return applydate;
	}
	public void setapplydate(Date applydate) {
		this.applydate = applydate;
	}
	
	
}
