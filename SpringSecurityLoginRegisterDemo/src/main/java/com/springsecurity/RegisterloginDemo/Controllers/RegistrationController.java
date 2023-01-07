package com.springsecurity.RegisterloginDemo.Controllers;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
		
		Roles role= roleService.getRolesByName("USER");
		
		List<Roles> listOfRoles=new  ArrayList<Roles>();
		listOfRoles.add(role);
		
		user.setVerified(false);
		user.setLoginAttempts(0);
		user.setRoles(listOfRoles);
		user.setCreatedAt(Instant.now());
		userService.addUser(user);
		
	}
@GetMapping("/Register/checkemail")
public boolean emailExists(@RequestParam String email) {
    return userService.emailExists(email);
  }

}
