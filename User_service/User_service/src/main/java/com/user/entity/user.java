package com.user.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;

public class user {
	private Long userId;
	private String name;
	private String phone;
	//private Long userId;
	
	List<Contact> contacts = new ArrayList<>();

	/**
	 * @param userId
	 * @param name
	 * @param phone
	 * @param contacts
	 */
	public user(Long userId, String name, String phone, List<Contact> contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}

	public user(Long userId, String name, String phone) {
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}

	public user() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	@SuppressWarnings("unchecked")
	public void setContacts(List<Contact> contactList) {
		this.contacts = (List<Contact>) contactList;
	}
	
}
