package com.BackAPIRest.rest.services.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.BackAPIRest.rest.entitis.EAccounts;
import com.BackAPIRest.rest.entitis.EMovements;
import com.BackAPIRest.rest.pojos.Account;
import com.BackAPIRest.rest.pojos.Deposit;
import com.BackAPIRest.rest.pojos.Withdrawal;

public interface IAccountRepository extends JpaRepository<EAccounts, Integer> {

	@Query(value = "SELECT * FROM ACCOUNTS WHERE ID = ?1", nativeQuery = true)
	Optional<EAccounts> getAccount(Integer accountId);

	Optional<EAccounts> makeDeposit(Deposit param, Account account);

	Optional<EAccounts> makeWithdrawal(Withdrawal param, Account account);

	Optional<EMovements> getTransactions(Integer accountId);

	Optional<EAccounts> createAccount(Account param);

}
