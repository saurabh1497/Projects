package com.demo.services;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.demo.entities.Account;

@Component
public interface BankService {
	
	public Long transfer(Long fromAccount,Long toAccount,int amount) throws SQLException;
	
	public Long debit(int amount,Long accountNumber) throws SQLException;
	
	public Long credit(int amount,Long accountNumber) throws SQLException;
	public void createNewAccount(Account account) throws SQLException;
	public void deActivateAccount(Long accountNumber)throws SQLException;
	public void activateAccount(Long accountNumber)throws SQLException;	
	public List<Account> getAllAccounts() throws SQLException;

}
