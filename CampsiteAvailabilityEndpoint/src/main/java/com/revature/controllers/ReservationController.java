package com.revature.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.models.Reservation;

@RestController
public class ReservationController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/reservations")
	public Reservation getUnit(@PathParam(value = "id") long id) {

		ResponseEntity<Reservation> reservation = restTemplate.getForEntity("http://localhost:5050/reservations/" + id,
				Reservation.class);
		return reservation.getBody();

	}

	@GetMapping("/reservations/all")
	public Reservation[] getAll() {
		ResponseEntity<Reservation[]> response = restTemplate.getForEntity("http://localhost:5050/reservations/all",
				Reservation[].class);
		Reservation[] employees = response.getBody();
		return employees;
	}
	@PostMapping("/reservations/save")
	public String save(@RequestBody Reservation reservation) {
		ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:5050/reservations/save", reservation, String.class);
		return response.getBody();
	}
	@PostMapping("/reservations/update")
	public String update(@PathParam(value = "id")long id, @RequestBody Reservation reservation) {
		ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:5050/reservations/update/" + id, reservation, String.class);
		return response.getBody();
	}
	@PostMapping("/reservations/delete")
	public String delete(@PathParam(value = "id")long id) {
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:5050/reservations/delete/" + id, String.class);
		return response.getBody();
	}

}
