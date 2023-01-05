package com.springsecurity.RegisterloginDemo.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springsecurity.RegisterloginDemo.models.Roles;
@Repository
public interface RoleRepository extends CrudRepository<Roles, Integer> {
//@Query("select r from Roles r where name =:name")
//	Optional<Roles> findByName(@Param(value = "name") String name);
	Optional<Roles> findByName(String name);

}
