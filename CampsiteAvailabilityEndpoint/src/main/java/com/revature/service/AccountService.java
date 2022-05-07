package com.revature.service;

import java.util.List;
import java.util.Optional;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.revature.models.Account;

@WebService(serviceName = "account-service", targetNamespace = "http://service.revature.com/")
@Component
public interface AccountService {
	
	@WebMethod
	public Account findAccountById(Long id);
	@WebMethod
	public List<Account> findAllAccounts();
	@WebMethod
	public Account saveAccount(Account account);
	@WebMethod
	public void deleteAccount(Long id);
	@WebMethod
	public Account updateAccount(Account account);
}