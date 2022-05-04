package com.revature.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.Campsite;
import com.revature.repository.CampsiteRepository;
import com.revature.repository.DummyData;

@Service
public class CampsiteService {

	@Autowired
	private CampsiteRepository campsiteRepo;


	public List<Campsite> getCampsites() {

		return campsiteRepo.findAll();
	}

	public Optional<Campsite> getCampsite(long id) {
	
		return campsiteRepo.findById(id);

	}
	public Campsite save(Campsite newCampsite) {
		
		return campsiteRepo.save(newCampsite);
	}
	
	public Campsite update(Campsite updatedCampsite) {
		
		return campsiteRepo.save(updatedCampsite);
	}

}
