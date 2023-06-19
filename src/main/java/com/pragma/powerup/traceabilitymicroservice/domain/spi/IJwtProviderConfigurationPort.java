package com.pragma.powerup.traceabilitymicroservice.domain.spi;

public interface IJwtProviderConfigurationPort {

    String getIdFromToken(String token);

    String getUserNameFromToken(String token);

    String getRoleFromToken(String token);

}
