package com.revature.controllers;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.Campsite;
import com.revature.services.CampsiteService;

@RestController
@RequestMapping("/campsites")
public class CampsiteController {
	@Autowired
	private CampsiteService campsiteService;

	@GetMapping("/all")
	public List<Campsite> getCampsites() {

		return campsiteService.getCampsites();
	
	}

	@GetMapping("/{id}")
	public Optional<Campsite> getUnit(@PathVariable long id) {
		return campsiteService.getCampsite(id);

	}

	@PostMapping("/save")
	public Campsite saveCampsite(@RequestBody Campsite newCampsite) {
		return campsiteService.save(newCampsite);

	}

	@RequestMapping(value = "/update/{id}", produces = "application/json", method = RequestMethod.PUT)
	public Campsite updateCampsite(@PathVariable Long id, @RequestBody Campsite newCampsite) {
		newCampsite.setId(id);
		return campsiteService.save(newCampsite);

	}
}
