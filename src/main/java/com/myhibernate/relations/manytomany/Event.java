package com.myhibernate.relations.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Event {
	
	@Id
	@GeneratedValue
	private int eventId;
	private String eventName;
	@ManyToMany
	@JoinTable(name="join_event_delegate",joinColumns = {@JoinColumn(name="eventId")},inverseJoinColumns = {@JoinColumn(name="delegateId")})
	private List<Delegate> delegates =new ArrayList<Delegate>();
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public List<Delegate> getDelegates() {
		return delegates;
	}
	public void setDelegates(List<Delegate> delegates) {
		this.delegates = delegates;
	}
	public Event(int eventId, String eventName, List<Delegate> delegates) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.delegates = delegates;
	}
	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventName=" + eventName + ", delegates=" + delegates + "]";
	}
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

}
