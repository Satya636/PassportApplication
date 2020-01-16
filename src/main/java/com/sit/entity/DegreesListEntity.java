package com.sit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="DEGREES_MASTER")
@Data
public class DegreesListEntity {

	@Id
	@Column(name = "DEGREE_ID")
	private Integer cid;
	
	@Column(name = "DEGREE_NAME")
	private String degree;
	
}
