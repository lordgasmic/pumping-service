package com.lordgasmic.pumpingservice.controller;

import com.lordgasmic.pumpingservice.model.Expression;
import com.lordgasmic.pumpingservice.model.ExpressionResponse;
import com.lordgasmic.pumpingservice.service.PumpingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PumpingServiceController {

    @Autowired
    private PumpingService service;

    @PutMapping("/api/v1/expression")
    public void putExpression(@RequestBody Expression expression) {
        service.putExpression(expression);
    }

    @PutMapping("/api/v1/expressions")
    public void putExpressions(@RequestBody List<Expression> expressions) {
        service.putExpressions(expressions);
    }

    @GetMapping("/api/v1/expressions")
    public ExpressionResponse getExpressions() {
        ExpressionResponse response = new ExpressionResponse();

        response.setExpressions(service.getExpressions());

        return response;
    }

}
