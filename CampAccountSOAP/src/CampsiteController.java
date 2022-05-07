package com.revature.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@GetMapping("/campsites/all")
	public Campsite[] getAll() {
		ResponseEntity<Campsite[]> response = restTemplate.getForEntity("http://localhost:8080/campsites/all",
				Campsite[].class);
		Campsite[] employees = response.getBody();
		return employees;
	}
	@PostMapping("/campsites/save")
	public String save(@RequestBody Campsite campsite) {
		ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8080/campsites/save", campsite, String.class);
		return response.getBody();
	}
	@PostMapping("/campsites/update")
	public String update(@PathParam(value = "id")long id, @RequestBody Campsite campsite) {
		ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8080/campsites/update/" + id, campsite, String.class);
		return response.getBody();
	}
	@PostMapping("/campsites/delete")
	public String delete(@PathParam(value = "id")long id) {
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/campsites/delete/" + id, String.class);
		return response.getBody();
	}

}
