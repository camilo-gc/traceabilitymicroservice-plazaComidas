package com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TraceabilityResponseDto {

    private Long id;
    private String name;
    private String address;
    private String id_owner;
    private String phone;
    private String url_logo;
    private String nit;
}
