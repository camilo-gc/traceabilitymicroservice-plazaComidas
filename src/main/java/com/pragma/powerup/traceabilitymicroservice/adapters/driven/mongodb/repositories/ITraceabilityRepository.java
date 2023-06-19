package com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongodb.repositories;

import com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongodb.entities.TraceabilityEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ITraceabilityRepository extends MongoRepository<TraceabilityEntity, Long> {



}
