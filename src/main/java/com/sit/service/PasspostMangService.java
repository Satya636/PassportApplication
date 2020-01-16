package com.sit.service;

import java.util.List;

import com.sit.model.EducationDetailsInfo;
import com.sit.model.PassportDetailsInfo;
import com.sit.model.PersonDetailsInfo;

public interface PasspostMangService {

	public Integer savePersonDetails(PersonDetailsInfo pInfo);
	
	public PersonDetailsInfo fetchPersonDtlsById(Integer pid);
	
	public List<String> fetchDegreesList();
	
	public List<String> fetchUniversitiesList();
	
	public List<Integer> fetchYearsList();
	
	public Integer saveEducationDetails(EducationDetailsInfo eduInfo); 
	
	public EducationDetailsInfo fetchEduDtlsById(Integer pid);
	
	public String savePassportDtls(PassportDetailsInfo pInfo);
	
}
