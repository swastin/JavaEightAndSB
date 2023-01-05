package com.springsecurity.RegisterloginDemo.Controllers;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.RegisterloginDemo.Services.Roleservice;
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
	@Autowired
	Roleservice roleService;
	@PostMapping("/Register")
	public void Register(@Validated @RequestBody Users user)
	{
		//Roles role=roleService.getRolesById(3);
		Roles role= roleService.getRolesByName("USER");
		//Roles user_role=new Roles(null, "ADMIN");
		List<Roles> listOfRoles=new  ArrayList<Roles>();
		listOfRoles.add(role);
		
		user.setVerified(false);
		user.setLoginAttempts(0);
		user.setRoles(listOfRoles);
		user.setCreatedAt(Instant.now());
		userService.addUser(user);
		
	}

}
