package com.BackAPIRest.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.BackAPIRest.BankUtils;
import com.BackAPIRest.back.managers.ManagerAccount;
import com.BackAPIRest.rest.entitis.EAccounts;
import com.BackAPIRest.rest.entitis.EMovements;
import com.BackAPIRest.rest.pojos.Account;
import com.BackAPIRest.rest.pojos.Balance;
import com.BackAPIRest.rest.pojos.Deposit;
import com.BackAPIRest.rest.pojos.Transaction;
import com.BackAPIRest.rest.pojos.Withdrawal;
import com.BackAPIRest.rest.services.mappers.AccountMapper;
import com.BackAPIRest.rest.services.repository.AccountRepository;
import com.BackAPIRest.rest.services.repository.IAccountRepository;

@Service
@Transactional
@Validated
public class BankAccountsServices {

	@Autowired
	private static IAccountRepository IAccountRepository;

	// Get account
	public static Account getAccount(Integer accountId) {
		if (!BankUtils.isNotNull(accountId)) {
			return null;
		}

		Optional<EAccounts> result;
		result = IAccountRepository.getAccount(accountId);
		if (!result.isEmpty()) {
			EAccounts accResult = result.get();
			try {
				return AccountMapper.toApiDomainAccount(accResult);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	// Create account
	public static Account createAccount(Account param) {
		if (!BankUtils.isNotNull(param)) {
			return null;
		}

		Account account = getAccount(param.getId());
		if (account == null) {
			Optional<EAccounts> result;
			result = IAccountRepository.createAccount(param);
			if (!result.isEmpty()) {
				EAccounts accResult = result.get();
				return new Account();
				// return AccountMapper.toApiDomainAccount(accResult);
			}
		}
		return null;

//		Account resp = null;
//		resp = ManagerAccount.insertAccount(param);
//		return resp;
	}

	// Deposit
	public static Balance depositAccounteAccount(Deposit param) {
		if (!BankUtils.isNotNull(param)) {
			return null;
		}

		Account account = getAccount(param.getId());
		if (account != null) {
			Optional<EAccounts> result;
			result = IAccountRepository.makeDeposit(param, account);
			if (!result.isEmpty()) {
				EAccounts accResult = result.get();
				return new Balance();
				// return BalanceMapper.toApiDomainBalance(accResult);
			}
		}
		return null;
	}

	// Withdrawal
	public static Balance withdrawalAccount(Withdrawal param) {
		if (!BankUtils.isNotNull(param)) {
			return null;
		}

		Account account = getAccount(param.getId());
		if (!BankUtils.isNotNull(account) && BankUtils.checkBalance(account.getBalance(), param.getAmount())) {
			Optional<EAccounts> result;
			result = IAccountRepository.makeWithdrawal(param, account);
			if (!result.isEmpty()) {
				EAccounts accResult = result.get();
				return new Balance();
				// return BalanceMapper.toApiDomainBalance(accResult);
			}
		}
		return null;

	}

	// Obtein balance
	public static Balance balanceAccount(Integer accountId) {
		if (!BankUtils.isNotNull(accountId)) {
			return null;
		}

		Account account = getAccount(accountId);
		if (!BankUtils.isNotNull(account)) {
			Optional<EAccounts> result;
			result = IAccountRepository.getAccount(accountId);
			if (!result.isEmpty()) {
				EAccounts accResult = result.get();
				return new Balance();
				// return BalanceMapper.toApiDomainBalance(accResult);
			}
		}
		return null;
	}

	// Look the transactions
	public static Transaction transactionAccount(Integer accountId) {
		if (!BankUtils.isNotNull(accountId)) {
			return null;
		}

		Account account = getAccount(accountId);
		if (!BankUtils.isNotNull(account)) {
			Optional<EMovements> result;
			result = IAccountRepository.getTransactions(accountId);
			if (!result.isEmpty()) {
				EMovements accResult = result.get();
				return new Transaction();
//				return MovementMapper.toApiDomainMovements(accResult);
			}
		}
		return null;
	}

}