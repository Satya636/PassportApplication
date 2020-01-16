package com.sit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "YEARS_MASTER")
public class YearsListEntity {

	@Id
	@Column(name = "YEAR_ID")
	private Integer yrId;
	
	@Column(name = "YEAR")
	private Integer year;
	
}
