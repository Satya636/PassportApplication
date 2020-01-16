package com.sit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sit.entity.PersonDetailsEntity;
import com.sit.model.PersonDetailsInfo;

@Repository
public interface PersonRegistrationRepo extends JpaRepository<PersonDetailsEntity, Integer>  {

	

	
}
