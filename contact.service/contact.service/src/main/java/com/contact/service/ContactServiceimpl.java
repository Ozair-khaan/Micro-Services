package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceimpl implements ContactService {
	
	List<Contact> list=List.of(
			new Contact(1L,"ehtasham1210@gmail.com","Ehtasham",1210L),
			new Contact(2L,"haque10@gmail.com","Haque",1210L),
			new Contact(3L,"kamran010@gmail.com","Kamran",1211L),
			new Contact(3L,"samar09@gmail.com","Samar",1212L)
			
			);
	
	@Override
	public List<Contact> getontactOfUser(Long userId){
		
		
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
		
	}

}
