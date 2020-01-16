package com.sit.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name = "EDU_DTLS")
public class EducationDetailsEntity {

	@Id
	@GeneratedValue
	@Column(name = "EDU_ID")
	private Integer eid;
	
	@Column(name = "PEROSN_ID")
	private Integer pid;

	@Column(name = "HIGHEST_DEGREE")
	private String highest_degree;

	@Column(name = "UNIVERSITY", length = 15)
	private String university;

	@Column(name = "PASSED_YEAR")
	private Integer passout_year;

	@CreationTimestamp
	@Column(name = "CREATED_DT")
	private Date created_id;

	@UpdateTimestamp
	@Column(name = "UPDATED_DT")
	private Date updated_id;
}
