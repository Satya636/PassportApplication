package com.sit.model;

import java.sql.Date;

import lombok.Data;

@Data
public class PersonDetailsInfo {

	private Integer pid;

	private String fName;

	private String lName;

	private String email;

	private Date dob;

	private String gender;

}
