package com.lordgasmic.pumpingservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpressionEntityPk implements Serializable {
    private String date;
    private String timeExpressed;
}
