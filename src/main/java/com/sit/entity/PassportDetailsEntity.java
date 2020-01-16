package com.sit.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "PASSPORT_DTLS")
public class PassportDetailsEntity {

	@Id
	@Column(name = "APPLICATION_ID")
	@GeneratedValue
	private Integer passportId;

	@Column(name = "PERSON_ID")
	private Integer pid;
	
	@Column(name ="PASSPORT_NO" ,length = 6)
	private String passportNo;
	
	@Column(name = "CREATED_DATE")
	@CreationTimestamp
	private Date createdDate;

}
