package com.sit.entity;

import java.sql.Date;

import javax.annotation.Generated;
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
@Table(name = "PERSON_DTLS_MASTER")
public class PersonDetailsEntity {

	@Id
	@GeneratedValue
	@Column(name = "PERSON_ID", length = 10)
	private Integer pid;

	@Column(name = "FNAME", length = 15)
	private String fName;

	@Column(name = "LNAME", length = 15)
	private String lName;

	@Column(name = "EMAIL", length = 30)
	private String email;

	@Column(name = "DOB")
	private Date dob;

	@Column(name = "GENDER")
	private String gender;

	@CreationTimestamp
	@Column(name = "CREATED_DT")
	private Date created_dt;

	@UpdateTimestamp
	@Column(name = "UPDATED_DT")
	private Date updated_dt;
}
