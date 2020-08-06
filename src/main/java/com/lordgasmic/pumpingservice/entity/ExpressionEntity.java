package com.lordgasmic.pumpingservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "expression_vw")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpressionEntity {

    @Id
    private String derp;
}
