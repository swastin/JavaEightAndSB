package com.springsecurity.RegisterloginDemo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springsecurity.RegisterloginDemo.Repositories.UserRepositroy;
import com.springsecurity.RegisterloginDemo.models.Users;

public class UserService {
	 @Autowired
	  private UserRepositroy userRepository;
	  public List<Users> getAllUsers() {
		    return (List<Users>) userRepository.findAll();
		  }

		  public Users getUserById(Integer id) {
		    return userRepository.findById(id).orElse(null);
		  }

		  public Users addUser(Users user) {
		    return userRepository.save(user);
		  }

		  public void deleteUser(Integer id) {
		    userRepository.deleteById(id);
		  }

}
