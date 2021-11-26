package com.BackAPIRest.rest.services.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.BackAPIRest.rest.entitis.EAccounts;

public interface IAccountRepository extends JpaRepository<EAccounts, Integer> {

	@Query(value = "SELECT * FROM ACCOUNTS WHERE ID = ?1", nativeQuery = true)
	public static Optional<EAccounts> getAccount(Integer accountId) {
		// TODO Auto-generated method stub
		return null;
	}
}
