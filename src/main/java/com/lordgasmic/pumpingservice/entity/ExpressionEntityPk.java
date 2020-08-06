package com.lordgasmic.pumpingservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpressionEntityPk {
    private String date;
    private String timeExpressed;
}
