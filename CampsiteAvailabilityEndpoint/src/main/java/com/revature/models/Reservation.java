package com.revature.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Reservation {
	
	private long reservationId;
	private long accountId;
	private long campsiteId;
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
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(long reservationId, long accountId, long campsiteId) {
		super();
		this.reservationId = reservationId;
		this.accountId = accountId;
		this.campsiteId = campsiteId;
	}
	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", accountId=" + accountId + ", campsiteId=" + campsiteId
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountId, campsiteId, reservationId);
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
		return accountId == other.accountId && campsiteId == other.campsiteId && reservationId == other.reservationId;
	}
}
