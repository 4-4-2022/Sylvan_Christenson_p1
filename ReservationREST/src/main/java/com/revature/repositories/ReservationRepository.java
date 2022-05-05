package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Reservation;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
