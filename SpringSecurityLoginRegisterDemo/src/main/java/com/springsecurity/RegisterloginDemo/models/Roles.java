package com.springsecurity.RegisterloginDemo.models;

import org.hibernate.annotations.Cache;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Roles {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
@Column(name = "role")
  private String name;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

public Roles() {
	super();
}

public Roles(Integer id, String name) {
	super();
	this.id = id;
	this.name = name;
}
  
  
}
