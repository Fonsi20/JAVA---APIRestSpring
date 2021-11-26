package com.BackAPIRest.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.BackAPIRest.back.managers.ManagerAccount;
import com.BackAPIRest.rest.entitis.EAccounts;
import com.BackAPIRest.rest.pojos.Account;
import com.BackAPIRest.rest.pojos.Balance;
import com.BackAPIRest.rest.pojos.Deposit;
import com.BackAPIRest.rest.pojos.Transaction;
import com.BackAPIRest.rest.pojos.Withdrawal;
import com.BackAPIRest.rest.services.mappers.AccountMapper;
import com.BackAPIRest.rest.services.repository.IAccountRepository;

@Service
@Transactional
@Validated
public class BankAccountsServices {

	@Autowired
	private static IAccountRepository repository;

	public static Account getAccount(Integer accountId) {
		//query sobre la tabla ACCOUNT con keyValue account-id
		Optional<EAccounts> result = IAccountRepository.getAccount(accountId);
		EAccounts accResult = result.get();
		return AccountMapper.toApiDomainAccount(accResult);
	}

	public static Account createAccount(Account param) {
		Account resp = null;
		try {
			resp = ManagerAccount.insertAccount(param);
		} catch (Exception e) {
			System.out.println(e);
		}
		return resp;
	}

	public static Balance depositAccounteAccount(Deposit param) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Balance withdrawalAccount(Withdrawal param) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Balance balanceAccount(Balance param) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Transaction transactionAccount(Integer accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}