package com.colatina.app.service.dataprovider.client.negativecpfvalidator;

import com.colatina.app.service.dataprovider.client.negativecpfvalidator.config.NegativeCpfValidatorClientConfig;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "negative-cpf-client", configuration = {NegativeCpfValidatorClientConfig.class})
@Headers({
    "Content-Type: application/json; charset=utf-8",
    "Accept: application/json; charset=utf-8"
})
public interface NegativeCpfValidatorClient {

    @Headers({"cpf: {cpf}"})
    @RequestLine("GET /api/cpf-validator/negative-cpf")
    boolean isNegativeCpf(@Param("cpf") String cpf);

}
