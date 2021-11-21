package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="SuperAdmin")
@Getter
@Setter
public class User {
 
	@Id
	@Column(name="userid")
	private long userId;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="emailid")
	private String emailId;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="password")
	private String password;
}
