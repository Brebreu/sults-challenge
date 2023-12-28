package com.sultschallenge.springbootbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sultschallenge.springbootbackend.model.Account;
import com.sultschallenge.springbootbackend.repository.AccountRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	private AccountRepository accountRepository;

	@Autowired
    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

	@Override
	public void run(String... args) throws Exception {
		//Testes da API
		Account account1 = Account.builder()
						.name("Breno")
						.empresa("Empresa Teste")
						.email("breno@fgshfasf")
						.celular("(34)3214215")
						.build();

		Account account2 = Account.builder()
						.name("Ele mesmo")
						.empresa("Empresa Teste2")
						.email("breninho@fgshfasf")
						.celular("(34)9999999")
						.build();
		
		accountRepository.save(account1);
		accountRepository.save(account2);
	}

}
