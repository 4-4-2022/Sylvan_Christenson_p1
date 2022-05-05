package com.revature.dto;

import java.util.Objects;

import javax.persistence.Id;

import com.revature.models.Account;

public class AccountDTO {

	private long id;
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + "]";
	}

	public AccountDTO(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public AccountDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
}
