package com.springsecurity.RegisterloginDemo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.RegisterloginDemo.models.Users;
@Repository
public interface UserRepositroy extends CrudRepository<Users, Integer>  {

}
