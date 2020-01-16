package com.sit.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sit.entity.DegreesListEntity;
import com.sit.entity.EducationDetailsEntity;
import com.sit.entity.PassportDetailsEntity;
import com.sit.entity.PersonDetailsEntity;
import com.sit.entity.UniversitiesListEntity;
import com.sit.entity.YearsListEntity;
import com.sit.model.EducationDetailsInfo;
import com.sit.model.PassportDetailsInfo;
import com.sit.model.PersonDetailsInfo;
import com.sit.repo.DegreesListRepo;
import com.sit.repo.EducationaInfoRepo;
import com.sit.repo.PassportDetailsRepo;
import com.sit.repo.PersonRegistrationRepo;
import com.sit.repo.UniversitiesListRepo;
import com.sit.repo.YearsListRepo;

@Service
public class PassportMangServiceImpl implements PasspostMangService {

	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	@Autowired
	private PersonRegistrationRepo prsnRegRepo;

	@Autowired
	private DegreesListRepo degreeListRepo;

	@Autowired
	private UniversitiesListRepo unvrstyListRepo;

	@Autowired
	private YearsListRepo yrsListRepo;

	@Autowired
	private EducationaInfoRepo eduInfoRepo;

	@Autowired
	private PassportDetailsRepo psprtDtlsRepo;

	@Override
	public Integer savePersonDetails(PersonDetailsInfo pInfo) {
		PersonDetailsEntity prsnEntity = new PersonDetailsEntity();
		BeanUtils.copyProperties(pInfo, prsnEntity);
		PersonDetailsEntity savedEntity = prsnRegRepo.save(prsnEntity);
		Integer pid = savedEntity.getPid();
		return pid;
	}

	@Override
	public List<String> fetchDegreesList() {
		List<DegreesListEntity> savedDegreeEntity = degreeListRepo.findAll();
		List<String> degrees = savedDegreeEntity.stream().map(DegreesListEntity::getDegree)
				.collect(Collectors.toList());
		return degrees;
	}

	@Override
	public List<String> fetchUniversitiesList() {
		List<UniversitiesListEntity> savedUnvrstyEntity = unvrstyListRepo.findAll();
		List<String> universities = savedUnvrstyEntity.stream().map(UniversitiesListEntity::getUnvsrtyName)
				.collect(Collectors.toList());
		return universities;
	}

	@Override
	public List<Integer> fetchYearsList() {
		List<YearsListEntity> savedYrEntity = yrsListRepo.findAll();
		List<Integer> years = savedYrEntity.stream().map(YearsListEntity::getYear).collect(Collectors.toList());
		return years;
	}

	@Override
	public PersonDetailsInfo fetchPersonDtlsById(Integer pid) {
		Optional<PersonDetailsEntity> savedEntity = prsnRegRepo.findById(pid);
		PersonDetailsInfo prsnInfo = new PersonDetailsInfo();
		if (savedEntity != null) {
			PersonDetailsEntity prsnDtlssEntity = savedEntity.get();
			BeanUtils.copyProperties(prsnDtlssEntity, prsnInfo);
		}
		return prsnInfo;
	}

	@Override
	public Integer saveEducationDetails(EducationDetailsInfo eduInfo) {
		EducationDetailsEntity eduEntity = new EducationDetailsEntity();
		BeanUtils.copyProperties(eduInfo, eduEntity);
		EducationDetailsEntity savedEntity = eduInfoRepo.save(eduEntity);
		return savedEntity.getPid();
	}

	@Override
	public EducationDetailsInfo fetchEduDtlsById(Integer pid) {
		EducationDetailsEntity eduDtlsEntity = eduInfoRepo.findByEid(pid);
		EducationDetailsInfo eduDtlsInfo = new EducationDetailsInfo();
		if (eduDtlsEntity != null) {
			BeanUtils.copyProperties(eduDtlsEntity, eduDtlsInfo);

		}
		return eduDtlsInfo;
	}

	@Override
	public String savePassportDtls(PassportDetailsInfo pInfo) {
        String passPortNo = randomAlphaNumeric(6);
        PassportDetailsEntity pEntity = new PassportDetailsEntity();
        BeanUtils.copyProperties(pInfo, pEntity);
        pEntity.setPassportNo(passPortNo);
		PassportDetailsEntity savedEntity = psprtDtlsRepo.save(pEntity);
		return savedEntity.getPassportNo();
	}

	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}

}
