package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="match")
@Getter
@Setter
public class Match {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="match_id")
	private long matchId;
	
	@Column(name="teama_id")
	private long teamA_Id;
	
	@Column(name="teamb_id")
	private long teamB_Id;
	
	@Column(name="stadiumid")
	private long stadiumId;
	
	@Column(name="date")
	private String date;
	
	@Column(name="user_id")
	private long user_Id;
	
	@ManyToOne
	@JoinColumn
	private Team team;
	private Stadium stadium;
}
