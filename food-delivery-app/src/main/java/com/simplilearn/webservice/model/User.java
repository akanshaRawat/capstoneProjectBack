package com.simplilearn.webservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userTable")
public class User {
	
	@Id
	
	
	private int id;
	
	
	private String username;
	
	
	private String password;
	
	
	private String firstname;
	
	
	private String lastname;
	
	
	private String city;
	
	
	private int age;
	
	
	
	public User() {
		super();
	}
	public User(int id,String firstname, String lastname, String city, int age,String username,String password) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.age = age;
		this.username=username;
		this.password=password;
		
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
