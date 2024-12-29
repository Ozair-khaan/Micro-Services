package com.contact.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.ContactService;

@RestController
@RequestMapping("/Contact")
class contactcontroller {
	
	@Autowired
    private ContactService contactser;
	
	@GetMapping("/user/{userId}")
	public List<Contact> getContact(@PathVariable("userId") Long userId){
		
		List<Contact> contactList=new ArrayList<>();
		contactList=contactser.getontactOfUser(userId);
		return contactList;
		
	}

}
