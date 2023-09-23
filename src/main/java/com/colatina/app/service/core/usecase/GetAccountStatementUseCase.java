package com.colatina.app.service.core.usecase;


import com.colatina.app.service.core.domain.TransactionDomain;
import com.colatina.app.service.core.gateway.TransactionGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAccountStatementUseCase {

    private final TransactionGateway transactionGateway;

    public List<TransactionDomain> getAccountStatement(Integer accountId, LocalDateTime startDate, LocalDateTime endDate) {
        return transactionGateway.getAccountStatement(accountId, startDate, endDate);
    }

}
