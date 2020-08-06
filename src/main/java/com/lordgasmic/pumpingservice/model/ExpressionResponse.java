package com.lordgasmic.pumpingservice.model;

import lombok.Data;

import java.util.List;

@Data
public class ExpressionResponse {
    private List<Expression> expressions;
}
