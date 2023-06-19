package com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.handlers.impl;


import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto.request.TraceabilityRequestDto;
import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.handlers.ITraceabilityHandler;
import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.mapper.ITraceabilityRequestMapper;
import com.pragma.powerup.traceabilitymicroservice.domain.api.ITraceabilityServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class TraceabilityHandlerImpl implements ITraceabilityHandler {

    private final ITraceabilityServicePort traceabilityServicePort;
    private final ITraceabilityRequestMapper traceabilityRequestMapper;

    @Override
    public void saveTraceability( TraceabilityRequestDto traceabilityRequestDto) {
        traceabilityServicePort.saveTraceability( traceabilityRequestMapper.toTraceability( traceabilityRequestDto ) );
    }

}