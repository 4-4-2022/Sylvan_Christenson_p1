package com.revature.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.Reservation;
import com.revature.service.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
	@Autowired
	private ReservationService reservationService;

	@GetMapping("/all")
	public List<Reservation> getCampsites() {

		return reservationService.findAll();

	}

	@GetMapping("/{id}")
	public Optional<Reservation> findByReservationID(@PathVariable long id) {
		return reservationService.findByReservationID(id);

	}

	@PostMapping("/save")
	public Reservation saveReservation(@RequestBody Reservation newReservation) {
		return reservationService.saveReservation(newReservation);

	}

	@PostMapping("/update/{id}")
	public Reservation updateReservation(@PathVariable Long id, @RequestBody Reservation newReservation) {
		return reservationService.updateReservation(newReservation);

	}

	@RequestMapping(value = "/delete/{id}")
	public void deleteReservation(@PathVariable Long id) {
		reservationService.deleteReservation(id);

	}
}