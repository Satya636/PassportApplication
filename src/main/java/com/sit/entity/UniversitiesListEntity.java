package com.sit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "UNIVSERSITY_MASTER")
public class UniversitiesListEntity {

	@Id
	@Column(name = "UNIV_ID")
	private Integer uid;

	@Column(name = "UNIV_NAME")
	private String unvsrtyName;
}
