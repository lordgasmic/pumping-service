package com.lordgasmic.pumpingservice.repository;

import com.lordgasmic.pumpingservice.entity.ExpressionEntity;
import com.lordgasmic.pumpingservice.entity.ExpressionEntityPk;
import org.springframework.data.repository.CrudRepository;

public interface ExpressionRepository extends CrudRepository<ExpressionEntity, ExpressionEntityPk> {
}
