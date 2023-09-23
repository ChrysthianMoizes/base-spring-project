package com.colatina.app.service.dataprovider.adapter;

import com.colatina.app.service.core.gateway.NegativeCpfGateway;
import com.colatina.app.service.dataprovider.client.negativecpfvalidator.NegativeCpfValidatorClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NegativeCpfAdapter implements NegativeCpfGateway {

    private final NegativeCpfValidatorClient negativeCpfValidatorClient;

    @Override
    public boolean isNegativeCpf(final String cpf) {
        return negativeCpfValidatorClient.isNegativeCpf(cpf);
    }

}
