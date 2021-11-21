package com.example.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Stadium")
@Getter
@Setter
public class Stadium {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stadiumid")
	private long stadiumId;
	
	@Column(name="stadiumcode")
	private long stadiumCode;
	
	@Column(name="stadiumname")
	private String stadiumName;
	
	@Column(name="city")
	private String city;
	
	@Column(name="userid")
	private long userId;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn
	private List<Match> match;
}
