package com.springsecurity.RegisterloginDemo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@GetMapping(value="/Roles")
	public List<Roles>getAllRoles(){
		return roleService.getAllRoles();		
	}
	@GetMapping(value="/Roles/{id}")
	public ResponseEntity<Roles>getRoleById(@PathVariable(value="id") Integer id){
		Roles roles = roleService.getRolesById(id);
		if(roles==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(roles);
				
	}
	
	 @PutMapping("Roles/{id}")
	  public ResponseEntity<Roles> updateRole(@PathVariable(value = "id") Integer roleId,
	                                         @Validated @RequestBody Roles roleDetails) {
		 Roles updateRole = roleService.updateRole(roleId, roleDetails);
		 if(updateRole ==null) {
				return ResponseEntity.notFound().build();
			}
			return ResponseEntity.ok(updateRole);
	  }
	 @DeleteMapping("Roles/{id}")
	 public ResponseEntity<Roles> deleteRole(@PathVariable(value = "id") Integer roleId) {
		 Roles role=roleService.getRolesById(roleId);
		 if(role==null) {
			 return ResponseEntity.notFound().build(); 
		 }
		 else {
			 roleService.deleteRole(roleId);
			 return ResponseEntity.ok().build();
		 }
				 
	 }
}
