package com.colatina.app.service.core.gateway;

import com.colatina.app.service.core.domain.TransactionDomain;

import java.time.LocalDateTime;
import java.util.List;

public interface TransactionGateway {

    List<TransactionDomain> getAccountStatement(Integer accountId, LocalDateTime startDate, LocalDateTime endDate);

}
