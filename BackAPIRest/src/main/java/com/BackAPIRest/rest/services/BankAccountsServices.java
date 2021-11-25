package com.BackAPIRest.rest.services;

import com.BackAPIRest.back.managers.ManagerAccount;
import com.BackAPIRest.rest.entitys.Account;
import com.BackAPIRest.rest.entitys.Balance;
import com.BackAPIRest.rest.entitys.Deposit;
import com.BackAPIRest.rest.entitys.Transaction;
import com.BackAPIRest.rest.entitys.Withdrawal;

import antlr.debug.MessageEvent;

public class BankAccountsServices {

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