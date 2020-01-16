package com.sit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sit.entity.YearsListEntity;

public interface YearsListRepo extends JpaRepository<YearsListEntity, Integer> {

}
