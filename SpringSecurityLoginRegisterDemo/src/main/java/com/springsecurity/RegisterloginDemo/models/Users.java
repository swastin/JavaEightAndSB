package com.springsecurity.RegisterloginDemo.models;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "users")
public class Users {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "username", nullable = false)
  private String username;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "password", nullable = false)
  private String passwordHash;

  @ManyToOne
//  @JoinColumn(name = "role_id", nullable = false,@ )
  @JoinTable(name = "user_roles",
  joinColumns = @JoinColumn(name = "user_id"),
  inverseJoinColumns = @JoinColumn(name = "role_id"))
  private Roles role;

  @Column(name = "verified", nullable = false)
  private Boolean verified;

  @Column(name = "login_attempts", nullable = false)
  private Integer loginAttempts;

  @Column(name = "created_at", nullable = false)
  private Date createdAt;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPasswordHash() {
    return passwordHash;
  }

  public void setPasswordHash(String passwordHash) {
    this.passwordHash = passwordHash;
  }

  public Roles getRole() {
    return role;
  }

  public void setRole(Roles role) {
    this.role = role;
  }

  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public Integer getLoginAttempts() {
    return loginAttempts;
  }

  public void setLoginAttempts(Integer loginAttempts) {
    this.loginAttempts = loginAttempts;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

public Users(String username, String email, String passwordHash, Roles role, Boolean verified, Integer loginAttempts,
		Date createdAt) {
	super();
	this.username = username;
	this.email = email;
	this.passwordHash = passwordHash;
	this.role = role;
	this.verified = verified;
	this.loginAttempts = loginAttempts;
	this.createdAt = createdAt;
}

public Users() {
	super();
}
  
}
