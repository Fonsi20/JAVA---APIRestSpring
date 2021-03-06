package com.BackAPIRest.rest.services.mappers;

import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.Mapping;

import com.BackAPIRest.rest.entitis.EAccounts;
import com.BackAPIRest.rest.pojos.Account;

@Mapper
public interface AccountMapper {

	public Account toApiDomainAccount(EAccounts accResult);

}
