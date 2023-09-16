package com.colatina.app.service.core.gateway;

import com.colatina.app.service.core.domain.AccountDomain;

public interface AccountGateway {

    AccountDomain create(AccountDomain account);
}
