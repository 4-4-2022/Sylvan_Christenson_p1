package com.revature.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.models.Reservation;

@RestController
public class AvailabilityController {
	
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	CampsiteController campsiteController;
	@Autowired
	ReservationController reservationController;
	
	
	@GetMapping("/availability")
	public StringBuilder isAvailableByCampsiteID(@PathParam(value = "id") long id) {
		StringBuilder s = new StringBuilder();
		
		for (Reservation reservation : reservationController.campsiteAvail(id)) {
			String campsiteName = campsiteController.getCampsiteName(id);
			Long arrivalDate = reservation.getArrivalDate();
			Long derpartureDate = reservation.getDepartureDate();
			String returnStatement = campsiteName + " " + "is unavailable from" + " " + arrivalDate + " " + "to" + " " + derpartureDate + "\n";
			s.append(returnStatement);
		}
		return s;
		
	
		
		
	
	}
	
	
	
	

}
