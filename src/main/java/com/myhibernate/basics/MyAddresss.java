package com.myhibernate.basics;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Table(name="MyAddresss")
@Entity
public class MyAddresss {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int addIds;
	
	@Column(name="Street")
	private String street;
	
	@Column(name="City")
	private String city;
	
	@Column(name="Faltu")
	@Transient
	private int x;
	
	@Column(name="Status")
	private Boolean isOpen;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Date")
	private Date addDate;
	
	@Column(name="Image")
	@Lob
	private byte[] image;

	public int getAddIds() {
		return addIds;
	}

	public void setAddIds(int addIds) {
		this.addIds = addIds;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Boolean getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public MyAddresss(int addIds, String street, String city, int x, Boolean isOpen, Date addDate, byte[] image) {
		super();
		this.addIds = addIds;
		this.street = street;
		this.city = city;
		this.x = x;
		this.isOpen = isOpen;
		this.addDate = addDate;
		this.image = image;
	}

	public MyAddresss() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MyAddresss [addIds=" + addIds + ", street=" + street + ", city=" + city + ", x=" + x + ", isOpen="
				+ isOpen + ", addDate=" + addDate + ", image=" + Arrays.toString(image) + "]";
	}
	

}
