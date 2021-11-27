package com.BackAPIRest.rest.services.mappers;

import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.Mapping;

import com.BackAPIRest.rest.entitis.EAccounts;
import com.BackAPIRest.rest.entitis.EMovements;
import com.BackAPIRest.rest.pojos.Account;
import com.BackAPIRest.rest.pojos.Transaction;

@Mapper
public interface MovementMapper {

	public Transaction toApiDomainAccount(EMovements accResult);

}
