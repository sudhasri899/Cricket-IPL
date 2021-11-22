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
@Table(name="team")
@Getter
@Setter
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="team_id")
	private long teamId;
	
	@Column(name="team_code")
	private long teamCode;
	
	@Column(name="team_name")
	private String teamName;
	
	@Column(name="user_id")
	private long userId;
	
	@OneToMany(fetch =FetchType.LAZY)
	@JoinColumn
	private List<Match> match;
}
