package com.springsecurity.RegisterloginDemo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.RegisterloginDemo.models.Roles;
@Repository
public interface RoleRepository extends CrudRepository<Roles, Integer> {

}
