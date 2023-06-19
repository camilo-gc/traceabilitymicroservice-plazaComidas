package com.pragma.powerup.traceabilitymicroservice.domain.spi;

import com.pragma.powerup.traceabilitymicroservice.domain.model.Traceability;

public interface ITraceabilityPersistencePort {

    void saveTraceability(Traceability traceability);

}