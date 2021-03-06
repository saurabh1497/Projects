package com.demo;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.demo.entities.Account;
import com.demo.services.BankService;
import com.demo.services.BankServiceImpl;

//@ComponentScan(basePackages = {"com.demo.repository","com.demo.services","com.demo.entities"})
@SpringBootApplication
public class SpringBootJpaDemoApplication {

	public static void main(String[] args) throws SQLException {
	
	ApplicationContext context =	SpringApplication.run(SpringBootJpaDemoApplication.class, args);
	BankService bankservice = context.getBean(BankService.class);
	
//	Account account = new Account("Saurabh", false, 1000, "email@gmail.com", "Mumbai", "India");
//	bankservice.createNewAccount(account);
//	
//	List<Account> accounts = bankservice.getAllAccounts();
//	
//	for(Account a: accounts) {
//		System.out.println(a.getBalance());
//	}
	
//	bankservice.deActivateAccount(1L);
//	System.out.println("Account has been deactivated..!!!");
	
	
//	bankservice.activateAccount(1L);
//	System.out.println("Account activated");
	
//	bankservice.transfer(1L, 3L, 500);
//	System.out.println("Money transferred..!!!");
	
//	bankservice.credit(100, 1L);
//	System.out.println("Amount Credited...!!!");
	
	bankservice.credit(100, 3L);
	System.out.println("Amount Debited...!!!");
	
	
	}

	
}
