package com.BackAPIRest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BackAPIRest.constants.UrlConstants;
import com.BackAPIRest.rest.pojos.Account;
import com.BackAPIRest.rest.pojos.Balance;
import com.BackAPIRest.rest.pojos.Deposit;
import com.BackAPIRest.rest.pojos.Transaction;
import com.BackAPIRest.rest.pojos.Withdrawal;

import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping(UrlConstants.GENERIC_URL)
public interface API {

	// GET
	@GetMapping(value = UrlConstants.GET_STATUS, produces = { "application/json" })
	public String statusRest();

	@GetMapping(value = UrlConstants.GET_MY_ACCOUNT, produces = { "application/json" })
	public ResponseEntity<Account> getMyAccount(@PathVariable(value = "account-id") Integer accountId);

	@GetMapping(value = UrlConstants.GET_ALL_ACCOUNT, produces = { "application/json" })
	public ResponseEntity<List<Account>> getAllAccount();

	// POST
	@PostMapping(value = UrlConstants.POST_ACCOUNT, produces = { "application/json" })
	public ResponseEntity<Account> postAccount(@RequestBody Account param);

	@PostMapping(value = UrlConstants.POST_ACCOUNT_DEPOSIT, produces = { "application/json" })
	public ResponseEntity<Balance> postAccountDesposit(@PathVariable(value = "account-id") Integer accountId,
			@RequestBody Deposit param);

	@PostMapping(value = UrlConstants.POST_ACCOUNT_WITHDRAWAL, produces = { "application/json" })
	public ResponseEntity<Balance> getAccountWithdrawal(@PathVariable(value = "account-id") Integer accountId,
			@RequestBody Withdrawal param);

	@PostMapping(value = UrlConstants.POST_ACCOUNT_BALANCE, produces = { "application/json" })
	public ResponseEntity<Balance> getAccountBalance(@PathVariable(value = "account-id") Integer accountId,
			@RequestBody Balance param);

	@PostMapping(value = UrlConstants.POST_ACCOUNT_TRANSACTIONS, produces = { "application/json" })
	public ResponseEntity<Transaction> getAccountTransactions(@PathVariable(value = "account-id") Integer accountId);

}
