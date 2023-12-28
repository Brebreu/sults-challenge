package com.sultschallenge.springbootbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sultschallenge.springbootbackend.dto.AccountDTO;
import com.sultschallenge.springbootbackend.model.Account;
import com.sultschallenge.springbootbackend.repository.AccountRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class CreateAccountController {

    @Autowired
    private AccountRepository accountRepository;

    // @GetMapping("/accounts")
    // public List<Account> fetchAccount() {
    //     return accountRepository.findAll();
    // }
    
    @PostMapping("/createaccount")
    public void getMethodName(@RequestBody AccountDTO accountDto) {
        System.out.println(accountDto);
    }
    
}
