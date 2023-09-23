package com.colatina.app.service.entrypoint.api;

import com.colatina.app.service.core.domain.TransactionDomain;
import com.colatina.app.service.core.usecase.GetAccountStatementUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/transaction")
@RequiredArgsConstructor
public class TransactionController {

    private final GetAccountStatementUseCase getAccountStatementUseCase;

    @GetMapping("/account-statement/{account_id}")
    public ResponseEntity<List<TransactionDomain>> getAccountStatement(@PathVariable("account_id") Integer accountId,
                                                                        @RequestHeader("start_date") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") LocalDateTime startDate,
                                                                        @RequestHeader("end_date") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") LocalDateTime endDate) {
        final List<TransactionDomain> accountStatement = getAccountStatementUseCase.getAccountStatement(accountId, startDate, endDate);
        return new ResponseEntity<>(accountStatement, accountStatement.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }

}
