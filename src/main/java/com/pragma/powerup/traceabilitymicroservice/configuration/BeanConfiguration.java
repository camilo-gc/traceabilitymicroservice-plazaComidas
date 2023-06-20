package com.pragma.powerup.traceabilitymicroservice.configuration;

import com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongodb.adapter.TraceabilityAdapter;
import com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongodb.mappers.ITraceabilityEntityMapper;
import com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongodb.repositories.ITraceabilityRepository;
import com.pragma.powerup.traceabilitymicroservice.domain.api.ITraceabilityServicePort;
import com.pragma.powerup.traceabilitymicroservice.domain.spi.ITraceabilityPersistencePort;
import com.pragma.powerup.traceabilitymicroservice.domain.usecase.TraceabilityUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final ITraceabilityRepository traceabilityRepository;
    private final ITraceabilityEntityMapper traceabilityEntityMapper;

    @Bean
    public ITraceabilityServicePort traceabilityServicePort() {
        return new TraceabilityUseCase(traceabilityPersistencePort());
    }

    @Bean
    public ITraceabilityPersistencePort traceabilityPersistencePort() {
        return new TraceabilityAdapter(traceabilityRepository, traceabilityEntityMapper);
    }

}