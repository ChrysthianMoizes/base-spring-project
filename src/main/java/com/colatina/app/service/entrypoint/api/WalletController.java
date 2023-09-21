package com.colatina.app.service.entrypoint.api;

import com.colatina.app.service.core.usecase.GetAccountBalanceUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wallet")
@RequiredArgsConstructor
public class WalletController {

    private final GetAccountBalanceUseCase accountBalanceUseCase;

    @GetMapping("/account-balance/{account_id}")
    public ResponseEntity<String> getAccountBalance(@PathVariable("account_id") Integer accountId) {
        return new ResponseEntity<>(accountBalanceUseCase.getAccountBalance(accountId), HttpStatus.OK);
    }

}
