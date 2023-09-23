package com.colatina.app.service.core.domain;

import com.colatina.app.service.core.domain.enumeration.TransactionStatus;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class TransactionDomain {

    private Integer id;
    private AccountInfoDomain accountOrigin;
    private AccountInfoDomain accountDestination;
    private BigDecimal value;
    private LocalDateTime createdAt;
    private TransactionStatus status;
    private String type;

}
