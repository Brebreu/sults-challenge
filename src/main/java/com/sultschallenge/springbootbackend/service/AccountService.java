package com.sultschallenge.springbootbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.sultschallenge.springbootbackend.model.Account;
import com.sultschallenge.springbootbackend.repository.AccountRepository;

@Service
public class AccountService {
	private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
	
	@Transactional
	public void salvar(Account conta) {
		accountRepository.save(conta);
	}
}
