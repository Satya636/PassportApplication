package com.sit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sit.entity.EducationDetailsEntity;

public interface EducationaInfoRepo  extends JpaRepository<EducationDetailsEntity, Integer> {

	@Query("from EducationDetailsEntity where pid=:eid")
	public EducationDetailsEntity findByEid(Integer eid);
}
