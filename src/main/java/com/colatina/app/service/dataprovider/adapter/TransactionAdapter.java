package com.colatina.app.service.dataprovider.adapter;

import com.colatina.app.service.configuration.mapper.TransactionMapper;
import com.colatina.app.service.core.domain.TransactionDomain;
import com.colatina.app.service.core.gateway.TransactionGateway;
import com.colatina.app.service.dataprovider.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TransactionAdapter implements TransactionGateway {

    private final TransactionRepository transactionRepository;
    private final TransactionMapper transactionMapper;

    @Override
    public List<TransactionDomain> getAccountStatement(final Integer accountId, final LocalDateTime startDate, final LocalDateTime endDate) {
        return transactionMapper.toDto(transactionRepository.findAllByAccountOriginIdAndCreatedAtBetween(accountId, startDate, endDate));
    }

}
