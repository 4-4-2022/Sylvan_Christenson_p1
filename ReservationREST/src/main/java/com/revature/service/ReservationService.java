package com.revature.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.Reservation;
import com.revature.repositories.ReservationRepository;

@Service
public class ReservationService {
	@Autowired
	ReservationRepository reservationRepo;

	public List<Reservation> findAll() {

		return reservationRepo.findAll();
	}

	public Optional<Reservation> findByReservationID(long reservationId) {

		return reservationRepo.findById(reservationId);

	}

	public Reservation saveReservation(Reservation newReservation) {

		return reservationRepo.save(newReservation);

	}

	public Reservation updateReservation(Reservation updatedCampsite) {
		if (reservationRepo.existsById(updatedCampsite.getReservationId())) {
			reservationRepo.deleteById(updatedCampsite.getReservationId());
			return reservationRepo.save(updatedCampsite);

		} else {
			return null;
		}

	}

	public void deleteReservation(long reservationId) {

		reservationRepo.deleteById(reservationId);

	}
}
//