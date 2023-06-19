package com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.controller;

import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto.request.TraceabilityRequestDto;
import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.handlers.ITraceabilityHandler;
import com.pragma.powerup.traceabilitymicroservice.configuration.Constants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/traceability")
@RequiredArgsConstructor
@SecurityRequirement(name = "jwt")
public class TraceabilityRestController {

    private final ITraceabilityHandler traceabilityHandler;

    @Operation(summary = "Send sms notify",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Notification sent",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Map"))),
                    @ApiResponse(responseCode = "409", description = "Restaurant already exists",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error"))),
                    @ApiResponse(responseCode = "403", description = "Role not allowed for restaurant creation",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})
    @PostMapping("/sms")
    public ResponseEntity<Map<String, String>> notifyOrderStatus(@Valid @RequestBody TraceabilityRequestDto traceabilityRequestDto) {

        traceabilityHandler.saveTraceability( traceabilityRequestDto );
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY, Constants.SMS_SENT_MESSAGE));

    }

}