package com.BackAPIRest.rest.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BackAPIRest.API;
import com.BackAPIRest.constants.ServiceConstants;
import com.BackAPIRest.constants.UrlConstants;
import com.BackAPIRest.rest.pojos.Account;
import com.BackAPIRest.rest.pojos.Balance;
import com.BackAPIRest.rest.pojos.Deposit;
import com.BackAPIRest.rest.pojos.Transaction;
import com.BackAPIRest.rest.pojos.Withdrawal;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UrlConstants.GENERIC_URL)
public class GenericWS implements API {

	// GET
	public String statusRest() {
		return ServiceConstants.MSG_STATUS;
	}

	public ResponseEntity<Account> getMyAccount(Integer accountId) {
		return ResponseEntity.ok(BankAccountsServices.getAccount(accountId));
	}

	public ResponseEntity<List<Account>> getAllAccount() {
		return null;
	}

	// POST
	public ResponseEntity<Account> postAccount(Account param) {
		return ResponseEntity.ok(BankAccountsServices.createAccount(param));
	}

	public ResponseEntity<Balance> postAccountDesposit(Integer accountId, Deposit param) {
		return ResponseEntity.ok(BankAccountsServices.depositAccounteAccount(param));
	}

	public ResponseEntity<Balance> getAccountWithdrawal(Integer accountId, Withdrawal param) {
		return ResponseEntity.ok(BankAccountsServices.withdrawalAccount(param));
	}

	public ResponseEntity<Balance> getAccountBalance(Integer accountId, Balance param) {
		return ResponseEntity.ok(BankAccountsServices.balanceAccount(param));
	}

	public ResponseEntity<Transaction> getAccountTransactions(Integer accountId) {
		return ResponseEntity.ok(BankAccountsServices.transactionAccount(accountId));
	}

}
