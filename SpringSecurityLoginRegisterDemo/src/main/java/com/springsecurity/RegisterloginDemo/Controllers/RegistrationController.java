package com.springsecurity.RegisterloginDemo.Controllers;

import java.time.Instant;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.RegisterloginDemo.Services.UserService;
import com.springsecurity.RegisterloginDemo.models.Roles;
import com.springsecurity.RegisterloginDemo.models.Users;

/*
 * 
 * This controller could handle requests related to user registration,
 *  such as creating new user accounts and verifying email addresses
 * 
 * */
@RestController
public class RegistrationController {
	@Autowired
	UserService userService;
	@PostMapping
	public void Register(@Validated @RequestBody Users user)
	{
		Roles role=new Roles();
		user.setVerified(false);
		user.setLoginAttempts(0);
		user.setRole(role);
		user.setCreatedAt(Instant.now());
		
	}

}
