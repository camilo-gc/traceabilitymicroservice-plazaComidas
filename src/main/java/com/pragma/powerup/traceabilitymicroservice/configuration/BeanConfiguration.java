package com.pragma.powerup.traceabilitymicroservice.configuration;


import com.pragma.powerup.traceabilitymicroservice.adapters.driven.apis.twilio.adapter.TwilioApiAdapter;
import com.pragma.powerup.traceabilitymicroservice.domain.api.ITraceabilityServicePort;
import com.pragma.powerup.traceabilitymicroservice.domain.spi.ITraceabilityPersistencePort;
import com.pragma.powerup.traceabilitymicroservice.domain.usecase.TraceabilityUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    @Bean
    public ITraceabilityServicePort twilioServicePort() {
        return new TraceabilityUseCase(twilioPersistencePort());
    }

    @Bean
    public ITraceabilityPersistencePort twilioPersistencePort() {
        return new TwilioApiAdapter();
    }

}