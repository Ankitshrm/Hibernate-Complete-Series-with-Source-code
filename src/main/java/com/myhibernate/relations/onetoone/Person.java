package com.myhibernate.relations.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue
	private int persionId;
	private String personName;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="pDetails_FK")
	private PersonDetails pDetails;
	
	public int getPersionId() {
		return persionId;
	}
	public void setPersionId(int persionId) {
		this.persionId = persionId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public PersonDetails getpDetails() {
		return pDetails;
	}
	public void setpDetails(PersonDetails pDetails) {
		this.pDetails = pDetails;
	}
	
	@Override
	public String toString() {
		return "Person [persionId=" + persionId + ", personName=" + personName + ", pDetails=" + pDetails + "]";
	}
	
	public Person(int persionId, String personName, PersonDetails pDetails) {
		super();
		this.persionId = persionId;
		this.personName = personName;
		this.pDetails = pDetails;
	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
