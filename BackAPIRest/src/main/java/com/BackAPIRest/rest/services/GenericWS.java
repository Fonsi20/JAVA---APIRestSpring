package com.BackAPIRest.rest.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.BackAPIRest.constants.ServiceConstants;
import com.BackAPIRest.constants.UrlConstants;
import com.BackAPIRest.rest.entitys.Account;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UrlConstants.GENERIC_URL)
public class GenericWS {

	// GET

	@RequestMapping(value = UrlConstants.GET_STATUS, method = RequestMethod.GET)
	public String statusRest() {
		return ServiceConstants.MSG_STATUS;
	}

	@RequestMapping(value = UrlConstants.GET_ACCOUNT, method = RequestMethod.GET)
	public ResponseEntity<Account> getAccount() {
		Account myAccount = new Account();
		myAccount.setId(1);
		myAccount.setName("Cristiano");
		return ResponseEntity.ok(myAccount);
	}

	@RequestMapping(value = UrlConstants.GET_ALL_ACCOUNT, method = RequestMethod.GET)
	public ResponseEntity<List<Account>> getAllAccount() {
		return null;
	}

	// POST

}
