package com.BackAPIRest.constants;

public final class UrlConstants {

	public static final String GENERIC_URL = "/";

	// GET
	public static final String GET_STATUS = "status";
	public static final String GET_MY_ACCOUNT = "/accounts/{account-id}";
	public static final String GET_ALL_ACCOUNT = "/allAccounts";

	// POST
	public static final String POST_ACCOUNT = "/accounts";
	public static final String POST_ACCOUNT_DEPOSIT = "/accounts/{account-id}/deposit";
	public static final String POST_ACCOUNT_WITHDRAWAL = "/accounts/{account-id}/withdrawal";
	public static final String POST_ACCOUNT_BALANCE = "/accounts/{account-id}/balance";
	public static final String POST_ACCOUNT_TRANSACTIONS = "/accounts/{account-id}/transactions";

}
