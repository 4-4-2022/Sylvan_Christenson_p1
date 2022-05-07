package com.revature.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Account;
import com.revature.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@GetMapping("/accounts/find")
	public Account findAccountById(@RequestParam long id) {
		return this.accountService.findAccountById(id);
	}

	@GetMapping("/accounts/all")
	public List<Account> getAccounts() {
		
		return this.accountService.findAllAccounts();
	}
	
	@PostMapping("/accounts/save")
	public Account saveAccount(@RequestBody Account newAccount) {
		return this.accountService.saveAccount(newAccount);
	}
	@PostMapping("/accounts/delete")
	public void deleteAccount(@RequestParam long id) {
		this.accountService.deleteAccount(id);
	}
	@PostMapping("/accounts/update")
	public Account updateAccount(@RequestBody Account updatedAccount) {
		return this.accountService.updateAccount(updatedAccount);
	}
}
