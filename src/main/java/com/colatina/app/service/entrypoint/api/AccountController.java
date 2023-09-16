package com.colatina.app.service.entrypoint.api;

import com.colatina.app.service.core.domain.AccountDomain;
import com.colatina.app.service.core.usecase.CreateAccountUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/account")
@RequiredArgsConstructor
public class AccountController {

    private final CreateAccountUseCase createAccountUseCase;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody @Valid AccountDomain data) {
        createAccountUseCase.execute(data);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
