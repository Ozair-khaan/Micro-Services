package com.contact.entity;

public class Contact {

	private Long Cid;
	private String email;
	private String contactName;
	private Long userId;
	/**
	 * @param cid
	 * @param email
	 * @param contactName
	 * @param userId
	 */
	public Contact(Long cid, String email, String contactName, Long userId) {
		super();
		Cid = cid;
		this.email = email;
		this.contactName = contactName;
		this.userId = userId;
	}
	/**
	 * 
	 */
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCid() {
		return Cid;
	}
	public void setCid(Long cid) {
		Cid = cid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
