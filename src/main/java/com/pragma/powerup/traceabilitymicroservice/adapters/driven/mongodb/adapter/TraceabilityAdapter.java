package com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongodb.adapter;

import com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongodb.mappers.ITraceabilityEntityMapper;
import com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongodb.repositories.ITraceabilityRepository;
import com.pragma.powerup.traceabilitymicroservice.domain.model.Traceability;
import com.pragma.powerup.traceabilitymicroservice.domain.spi.ITraceabilityPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class TraceabilityAdapter implements ITraceabilityPersistencePort {

    private final ITraceabilityRepository traceabilityRepository;
    private final ITraceabilityEntityMapper traceabilityEntityMapper;

    @Override
    public void saveTraceability(Traceability traceability) {
        traceabilityRepository.save( traceabilityEntityMapper.toEntity(traceability) );
    }

}