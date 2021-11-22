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
@Table(name="stadium")
@Getter
@Setter
public class Stadium {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stadium_id")
	private long stadiumId;
	
	@Column(name="stadium_code")
	private long stadiumCode;
	
	@Column(name="stadium_name")
	private String stadiumName;
	
	@Column(name="city")
	private String city;
	
	@Column(name="user_id")
	private long userId;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn
	private List<Match> match;
}
