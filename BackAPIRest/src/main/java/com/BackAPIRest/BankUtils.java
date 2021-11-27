package com.BackAPIRest;

import java.util.Objects;

public class BankUtils {

	public static boolean isNotNull(Integer accountId) {
		if (accountId == null) {
			return false;
		}
		return true;
	}

	public static boolean isNotNull(Object param) {
		if (Objects.isNull(param)) {
			return false;
		}
		return true;
	}

	public static boolean checkBalance(Double balance, Float amount) {
		if ((balance - amount) < 0) {
			return true;
		}
		return false;
	}

}
