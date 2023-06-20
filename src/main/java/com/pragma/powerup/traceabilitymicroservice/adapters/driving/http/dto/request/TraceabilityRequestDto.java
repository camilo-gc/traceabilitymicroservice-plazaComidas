package com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TraceabilityRequestDto {

    @NotBlank
    private String message;

    @NotBlank
    @Pattern(regexp = "\\+[0-9]{12}", message = "invalid phone number")
    private String phone;

}
