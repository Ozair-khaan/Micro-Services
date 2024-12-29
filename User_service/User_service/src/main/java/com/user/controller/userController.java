package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.Services.UserService;
import com.user.entity.Contact;
import com.user.entity.user;

import org.springframework.core.ParameterizedTypeReference;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTem;

    @GetMapping("/{userId}")
    public user getUser(@PathVariable("userId") Long userId) {
        // Get user details from the user service
        user useretails = userService.getUser(userId);

        // Make the HTTP GET request to retrieve contacts associated with this user
		List Contact = this.restTem.getForObject("http://CONTACT.SERVICE/Contact/user/" + useretails.getUserId(),
        		List.class);

        // Extract the list of contacts from the ResponseEntity

        // Set the list of contacts to the user object
        useretails.setContacts(Contact);

        return useretails;
    }
}
