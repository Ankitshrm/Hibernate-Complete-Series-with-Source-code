package com.myhibernate.relations.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PersonDetails {
	
	@Id
	@GeneratedValue
	@Column(name="deatilsId_PK")
	private int personDetailsId;
	private String zipcode;
	private String job;
	private int income;
	
	public int getPersonDetailsId() {
		return personDetailsId;
	}
	public void setPersonDetailsId(int personDetailsId) {
		this.personDetailsId = personDetailsId;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	
	public PersonDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "PersonDetails [personDetailsId=" + personDetailsId + ", zipcode=" + zipcode + ", job=" + job
				+ ", income=" + income + "]";
	}
	
	public PersonDetails(int personDetailsId, String zipcode, String job, int income) {
		super();
		this.personDetailsId = personDetailsId;
		this.zipcode = zipcode;
		this.job = job;
		this.income = income;
	}
	

}
