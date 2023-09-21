package com.colatina.app.service.core.usecase;

import com.colatina.app.service.dataprovider.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.NumberFormat;
import java.util.Locale;

@Service
@RequiredArgsConstructor
public class GetAccountBalanceUseCase {

    private final WalletRepository walletRepository;

    public String getAccountBalance(final Integer accountId) {
        return NumberFormat.getInstance(new Locale("pt", "BR"))
            .format(walletRepository.findBalanceByAccountId(accountId));
    }

}
