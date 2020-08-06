package com.lordgasmic.pumpingservice.service;

import com.lordgasmic.pumpingservice.entity.ExpressionEntity;
import com.lordgasmic.pumpingservice.model.Expression;
import com.lordgasmic.pumpingservice.repository.ExpressionRepository;
import org.hibernate.cfg.CreateKeySecondPass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
public class PumpingService {

    @Autowired
    private ExpressionRepository repository;

    public void putExpression(Expression expression) {
        repository.save(expression.toEntity());
    }

    public void putExpressions(List<Expression> expressions) {
        repository.saveAll(expressions.stream().map(Expression::toEntity).collect(toList()));
    }

    public List<Expression> getExpressions() {
        List<Expression> expressions = new ArrayList<>();

        Iterable<ExpressionEntity> entities = repository.findAll();
        for(ExpressionEntity entity : entities) {
            expressions.add(Expression.fromEntity(entity));
        }

        return expressions;
    }

}
