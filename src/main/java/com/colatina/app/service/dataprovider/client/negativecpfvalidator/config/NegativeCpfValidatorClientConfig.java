package com.colatina.app.service.dataprovider.client.negativecpfvalidator.config;


import com.colatina.app.service.dataprovider.client.negativecpfvalidator.NegativeCpfValidatorClient;
import feign.Feign;
import feign.Logger;
import feign.httpclient.ApacheHttpClient;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import lombok.Generated;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Generated
@Setter
@Configuration
@ConfigurationProperties(prefix = "services.negative-cpf")
@RequiredArgsConstructor
public class NegativeCpfValidatorClientConfig {

    private String url;

    public Feign.Builder getDefaultClientBuilder() {
        return Feign.builder()
            .client(new ApacheHttpClient())
            .encoder(new JacksonEncoder())
            .decoder(new JacksonDecoder())
            .logLevel(Logger.Level.FULL);
    }

    @Lazy
    @Bean
    public NegativeCpfValidatorClient negativeCpfValidatorClient() {
        return getDefaultClientBuilder().target(NegativeCpfValidatorClient.class, url);
    }
}
