package com.revature.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.models.Account;
import com.revature.repository.AccountRepository;

@WebService
@Component
public class AccountService {
	@Autowired
	AccountRepository accountRepo;
	
	
	@WebMethod
	public List<Account> findAll(){
		return this.accountRepo.findAll();
	}
	

}
