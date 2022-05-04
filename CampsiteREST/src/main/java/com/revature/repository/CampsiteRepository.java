package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Campsite;
@Repository
public interface CampsiteRepository extends JpaRepository<Campsite, Long> {
	
	

}
