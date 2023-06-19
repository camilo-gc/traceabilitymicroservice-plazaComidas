package com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.handlers;


import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto.request.TraceabilityRequestDto;

public interface ITraceabilityHandler {

    void saveTraceability(TraceabilityRequestDto traceabilityRequestDto);

}