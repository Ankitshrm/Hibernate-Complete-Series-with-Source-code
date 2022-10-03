package com.myhibernate.basics;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class MyStudent {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	@Column(name="Name")
	
	private String name;
	@Column(name="City")
	
	private String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "MyStudent [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public MyStudent() {
		super();
	}
	
	public MyStudent(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

}
