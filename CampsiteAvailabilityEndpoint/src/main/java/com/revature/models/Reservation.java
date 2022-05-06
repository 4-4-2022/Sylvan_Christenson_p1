package com.revature.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.revature.entities.Reservation;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Reservation {
	
	private long reservationId;
	private long accountId;
	private long campsiteId;
	private long arrivalDate;
	private long departureDate;
	public long getReservationId() {
		return reservationId;
	}
	public void setReservationId(long reservationId) {
		this.reservationId = reservationId;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public long getCampsiteId() {
		return campsiteId;
	}
	public void setCampsiteId(long campsiteId) {
		this.campsiteId = campsiteId;
	}
	public long getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(long arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public long getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(long departureDate) {
		this.departureDate = departureDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountId, arrivalDate, campsiteId, departureDate, reservationId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		return accountId == other.accountId && arrivalDate == other.arrivalDate && campsiteId == other.campsiteId
				&& departureDate == other.departureDate && reservationId == other.reservationId;
	}
	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", accountId=" + accountId + ", campsiteId=" + campsiteId
				+ ", arrivalDate=" + arrivalDate + ", departureDate=" + departureDate + "]";
	}
	public Reservation(long reservationId, long accountId, long campsiteId, long arrivalDate, long departureDate) {
		super();
		this.reservationId = reservationId;
		this.accountId = accountId;
		this.campsiteId = campsiteId;
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

}
