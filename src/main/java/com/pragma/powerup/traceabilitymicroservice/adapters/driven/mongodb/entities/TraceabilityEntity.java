package com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongodb.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

import java.util.Date;


@Document(collection = "traceability")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TraceabilityEntity {

    @Id
    private Long id;
    private Long order_id;
    private Long client_id;
    private String client_email;
    private Date date;
    private String previous_status;
    private String new_status;
    private Long employee_id;
    private String employee_emial;

}