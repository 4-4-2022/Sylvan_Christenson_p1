package com.revature.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.models.Campsite;

@RestController
public class CampsiteController {

	@Autowired
	private RestTemplate restTemplate;
	
	
	

	@GetMapping("/campsites")
	public Campsite getUnit(@PathParam(value = "id") long id) {

		ResponseEntity<Campsite> campsite = restTemplate.getForEntity("http://localhost:8080/campsites/" + id,
				Campsite.class);
		return campsite.getBody();
		
	}

	
	

}





