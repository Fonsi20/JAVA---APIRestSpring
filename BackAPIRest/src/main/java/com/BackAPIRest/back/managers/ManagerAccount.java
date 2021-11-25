package com.BackAPIRest.back.managers;

import com.BackAPIRest.back.managers.dao.AccountDAO;
import java.sql.Timestamp;
import com.BackAPIRest.rest.entitys.Account;

public class ManagerAccount {

	public static Account insertAccount(Account param) {
		boolean result = checkData(param);
		if (result) {
			return AccountDAO.insert(param);
		} else {
			return null;
		}
	}

	private static boolean checkData(Account param) {
		if (param != null && param.getName() != null) {
			if (param.getLimit() == null) {
				param.setLimit(200F);
			}
			param.setCreatedAt(new Timestamp(System.currentTimeMillis()).toString());
			return true;
		}
		return false;
	}

}
