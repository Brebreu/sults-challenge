package com.sultschallenge.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sultschallenge.springbootbackend.model.Account;

public interface AccountRepository extends JpaRepository<Account,Long>{
    
}
