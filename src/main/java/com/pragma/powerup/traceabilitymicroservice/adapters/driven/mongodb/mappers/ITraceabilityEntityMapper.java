package com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongodb.mappers;

import com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongodb.entities.TraceabilityEntity;
import com.pragma.powerup.traceabilitymicroservice.domain.model.Traceability;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITraceabilityEntityMapper {

    TraceabilityEntity toEntity(Traceability traceability);

    Traceability toRestaurant(TraceabilityEntity traceabilityEntity);

    List<Traceability> toTraceabilityList(List<TraceabilityEntity> traceabilityEntities);

}