package com.sit.model;

import java.sql.Date;

import lombok.Data;

@Data
public class EducationDetailsInfo {

	private Integer eid;

	private Integer pid;

	private String highest_degree;

	private String university;

	private Integer passout_year;

}
