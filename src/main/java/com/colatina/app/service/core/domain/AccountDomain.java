package com.colatina.app.service.core.domain;

import com.colatina.app.service.core.domain.enumeration.AccountStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AccountDomain {

    private Integer id;

    private String nome;

    private String lastName;

    private String document;

    private AccountStatus status;

    private LocalDate birthDate;
}
