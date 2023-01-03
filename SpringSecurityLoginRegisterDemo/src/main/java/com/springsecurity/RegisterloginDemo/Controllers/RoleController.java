package com.springsecurity.RegisterloginDemo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.RegisterloginDemo.Services.Roleservice;
import com.springsecurity.RegisterloginDemo.models.Roles;

@RestController
//@RequestMapping(value="/Roles",produces = "application/json")
public class RoleController {
	@Autowired
	Roleservice roleService;
	@PostMapping(value="/Roles")
	public Roles addRole(@RequestBody Roles role) {
	    return roleService.addRole(role);
	  }

}
