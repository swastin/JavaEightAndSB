package com.springsecurity.RegisterloginDemo.models;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
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

  @ManyToMany(cascade= {CascadeType.ALL} ,fetch =FetchType.LAZY)
//  @JoinColumn(name = "role_id", nullable = false,@ )
  @JoinTable(name = "user_roles",
  joinColumns = @JoinColumn(name = "user_id"),
  inverseJoinColumns = @JoinColumn(name = "role_id"))
  private List<Roles> roles;

  @Column(name = "verified", nullable = false)
  private Boolean verified;

  @Column(name = "login_attempts", nullable = false)
  private Integer loginAttempts;

  @Column(name = "created_at", updatable = false)
  @CreationTimestamp
  private Instant createdAt;
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

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }


public List<Roles> getRoles() {
	return roles;
}

public void setRoles(List<Roles> roles) {
	this.roles = roles;
}

public Users(String username, String email, String passwordHash, List<Roles> roles, Boolean verified,
		Integer loginAttempts, Instant createdAt) {
	super();
	this.username = username;
	this.email = email;
	this.passwordHash = passwordHash;
	this.roles = roles;
	this.verified = verified;
	this.loginAttempts = loginAttempts;
	this.createdAt = createdAt;
}

public Users() {
	super();
}
 public void addRole(Roles role) {
	 this.roles.add(role);
	 
 } 
}
