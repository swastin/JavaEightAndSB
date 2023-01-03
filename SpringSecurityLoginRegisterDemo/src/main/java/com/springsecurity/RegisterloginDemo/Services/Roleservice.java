package com.springsecurity.RegisterloginDemo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsecurity.RegisterloginDemo.Repositories.RoleRepository;
import com.springsecurity.RegisterloginDemo.models.Roles;
import com.springsecurity.RegisterloginDemo.models.Users;
@Service
public class Roleservice {
	@Autowired
	private RoleRepository roleRepository;
	
	public List<Roles>getAllRoles(){
		
		return (List<Roles>) roleRepository.findAll();
	}
	public Roles getRolesById(Integer id) {
		return roleRepository.findById(id).orElse(null);
		
	}
	  public Roles addRole(Roles role) {
		    return roleRepository.save(role);
		  }

		  public void deleteRole(Integer id) {
		    roleRepository.deleteById(id);
		  }
}
