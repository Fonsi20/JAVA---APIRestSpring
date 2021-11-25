package com.BackAPIRest.rest.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.BackAPIRest.constants.ServiceConstants;
import com.BackAPIRest.constants.UrlConstants;
import com.BackAPIRest.rest.entitys.Account;
import com.BackAPIRest.rest.entitys.Balance;
import com.BackAPIRest.rest.entitys.Deposit;
import com.BackAPIRest.rest.entitys.Transaction;
import com.BackAPIRest.rest.entitys.Withdrawal;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UrlConstants.GENERIC_URL)
public class GenericWS {

	// GET
	@GetMapping(value = UrlConstants.GET_STATUS)
	public String statusRest() {
		return ServiceConstants.MSG_STATUS;
	}

	@GetMapping(value = UrlConstants.GET_MY_ACCOUNT)
	public Account getMyAccount(@PathVariable Integer accountId) {
		Account resp = new Account();
		resp.setId(1);
		resp.setName("Messi");
		resp.setLimit(500F);
		resp.setCreatedAt("La hora");
		return resp;
	}

	@GetMapping(value = UrlConstants.GET_ALL_ACCOUNT)
	public ResponseEntity<List<Account>> getAllAccount() {
		return null;
	}

	// POST
	@PostMapping(value = UrlConstants.POST_ACCOUNT)
	public ResponseEntity<Account> postAccount(@PathVariable Integer accountId, @RequestBody Account param)
			throws ClassNotFoundException, NoSuchMethodException {

		return ResponseEntity.ok(BankAccountsServices.createAccount(param));
	}

	@PostMapping(value = UrlConstants.POST_ACCOUNT_DEPOSIT)
	public ResponseEntity<Balance> postAccountDesposit(@PathVariable Integer accountId, @RequestBody Deposit param)
			throws ClassNotFoundException, NoSuchMethodException {

		return ResponseEntity.ok(BankAccountsServices.depositAccounteAccount(param));
	}

	@PostMapping(value = UrlConstants.POST_ACCOUNT_WITHDRAWAL)
	public ResponseEntity<Balance> getAccountWithdrawal(@PathVariable Integer accountId, @RequestBody Withdrawal param)
			throws ClassNotFoundException, NoSuchMethodException {

		return ResponseEntity.ok(BankAccountsServices.withdrawalAccount(param));
	}

	@PostMapping(value = UrlConstants.POST_ACCOUNT_BALANCE)
	public ResponseEntity<Balance> getAccountBalance(@PathVariable Integer accountId, @RequestBody Balance param)
			throws ClassNotFoundException, NoSuchMethodException {

		return ResponseEntity.ok(BankAccountsServices.balanceAccount(param));
	}

	@PostMapping(value = UrlConstants.POST_ACCOUNT_TRANSACTIONS)
	public ResponseEntity<Transaction> getAccountTransactions(@PathVariable Integer accountId)
			throws ClassNotFoundException, NoSuchMethodException {

		return ResponseEntity.ok(BankAccountsServices.transactionAccount(accountId));
	}

}
