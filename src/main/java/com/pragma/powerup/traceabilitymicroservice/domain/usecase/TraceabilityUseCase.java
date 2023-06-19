package com.pragma.powerup.traceabilitymicroservice.domain.usecase;

import com.pragma.powerup.traceabilitymicroservice.domain.api.ITraceabilityServicePort;
import com.pragma.powerup.traceabilitymicroservice.domain.model.Traceability;
import com.pragma.powerup.traceabilitymicroservice.domain.spi.ITraceabilityPersistencePort;


public class TraceabilityUseCase implements ITraceabilityServicePort {

    private final ITraceabilityPersistencePort traceabilityPersistencePort;
    public TraceabilityUseCase(ITraceabilityPersistencePort traceabilityPersistencePort) {
        this.traceabilityPersistencePort = traceabilityPersistencePort;
    }

    public void saveTraceability(Traceability traceability){
        traceabilityPersistencePort.saveTraceability(traceability);
    }

}