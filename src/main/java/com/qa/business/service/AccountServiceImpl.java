package com.qa.business.service;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.persistence.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {

	private static final Logger LOGGER = Logger.getLogger(AccountService.class);

	@Inject
	private AccountRepository repo;

	public String getAllAccounts() {
		LOGGER.info("In AccountServiceImpl getAllAccounts ");
		return repo.getAllAccounts();
	}

	public String addAccount(String account) {
		return repo.createAccount(account);
	}

	public String updateAccount(Long id, String account) {
		return repo.updateAccount(id, account);
	}

	public String deleteAccount(Long id) {
		return repo.deleteAccount(id);

	}

	public void setRepo(AccountRepository repo) {
		this.repo = repo;
	}
}