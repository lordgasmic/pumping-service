package com.lordgasmic.pumpingservice.controller;

import com.lordgasmic.pumpingservice.model.Expression;
import com.lordgasmic.pumpingservice.service.PumpingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PumpingServiceController {

    @Autowired
    private PumpingService service;

    @PutMapping("/api/v1/expression")
    public void putExpression(@RequestBody Expression expression) {
        service.putExpression(expression);
    }
}
