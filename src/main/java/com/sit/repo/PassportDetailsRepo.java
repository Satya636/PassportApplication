package com.sit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sit.entity.PassportDetailsEntity;

public interface PassportDetailsRepo extends JpaRepository<PassportDetailsEntity, Integer> {

	
}
