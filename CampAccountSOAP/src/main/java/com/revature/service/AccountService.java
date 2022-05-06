package com.revature.service;

import java.util.List;
import java.util.Optional;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.models.Account;
import com.revature.repository.AccountRepository;

@WebService
public class AccountService {
	@Autowired
	AccountRepository accountRepo;

	@WebMethod
	public Optional<Account> findAccountById(Long id) {

		return this.accountRepo.findById(id);
	}

	@WebMethod
	public List<Account> findAllAccounts() {
		return this.accountRepo.findAll();
	}

	@WebMethod
	public Account saveAccount(Account account) {
		return this.accountRepo.save(account);
	}

	@WebMethod
	public void deleteAccount(Long id) {
		this.accountRepo.deleteById(id);

	}

	@WebMethod
	public Account updateAccount(Account account) {
		if (accountRepo.existsById(account.getId())) {
			accountRepo.deleteById(account.getId());
			return accountRepo.save(account);

		} else {
			return null;
		}

	}

}
