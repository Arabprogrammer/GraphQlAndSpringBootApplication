package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "subscriber_counter")
	private Integer subscriberCounter;

	public User() {

	}
	public User(String name) {
		this.name = name;
	}

	public User(String name, Integer subscriberCounter) {
		this.name = name;
		this.subscriberCounter = subscriberCounter;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSubscriberCounter() {
		return subscriberCounter;
	}

	public void setSubscriberCounter(Integer subscriberCounter) {
		this.subscriberCounter = subscriberCounter;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", subscriberCounter=" + subscriberCounter + "]";
	}

}
