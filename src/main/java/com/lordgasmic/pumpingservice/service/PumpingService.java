package com.lordgasmic.pumpingservice.service;

import com.lordgasmic.pumpingservice.model.Expression;
import com.lordgasmic.pumpingservice.repository.ExpressionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PumpingService {

    @Autowired
    private ExpressionRepository repository;

    public void putExpression(Expression expression) {
        repository.save(expression.toEntity());
    }
}
