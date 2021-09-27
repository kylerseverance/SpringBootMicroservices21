package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;


@Component
public class SpecimenServiceStub implements iSpecimenService {
	
	@Override
	public SpecimenDTO fetchBy(int id) {
		
		SpecimenDTO specimenDTO = new SpecimenDTO(); 
		specimenDTO.setSpecimenId(43);
		specimenDTO.setLatitude("40.75");
		specimenDTO.setLongitude("-75.60 ");
		specimenDTO.setDescription("A Beautiful Eastern Redbud");
		return specimenDTO;
	}

	
	@Override
	public void save(SpecimenDTO specimenDTO) {
		
	}
}
