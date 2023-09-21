package com.colatina.app.service.dataprovider.repository;

import com.colatina.app.service.dataprovider.entity.WalletEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface WalletRepository extends JpaRepository<WalletEntity, Integer> {

    @Query("SELECT wallet.balance FROM WalletEntity wallet WHERE wallet.account.id = :accountId")
    BigDecimal findBalanceByAccountId(@Param("accountId") Integer accountId);

}
