package com.pragma.powerup.traceabilitymicroservice.domain.api;


import com.pragma.powerup.traceabilitymicroservice.domain.model.Traceability;

public interface ITraceabilityServicePort {

    void saveTraceability(Traceability traceability);

}