package com.lordgasmic.pumpingservice.model;

import com.lordgasmic.pumpingservice.entity.ExpressionEntity;
import com.lordgasmic.pumpingservice.entity.ExpressionEntityPk;
import lombok.Data;

@Data
public class Expression {
    private int right;
    private int left;
    private String date;
    private String time;
    private PumpingType pumpingType;
    private int duration;
    private StorageLocation storageLocation;

    public static Expression fromEntity(ExpressionEntity entity){
        Expression expression = new Expression();
        expression.setRight(entity.getBoobRt());
        expression.setLeft(entity.getBoobLf());
        expression.setDate(entity.getPk().getDate());
        expression.setTime(entity.getPk().getTimeExpressed());
        expression.setPumpingType(entity.getPumpingType());
        expression.setStorageLocation(entity.getStorageLocation());
        expression.setDuration(entity.getDuration());

        return expression;
    }

    public ExpressionEntity toEntity(){
        ExpressionEntityPk pk = new ExpressionEntityPk();
        pk.setDate(getDate());
        pk.setTimeExpressed(getTime());

        ExpressionEntity entity = new ExpressionEntity();
        entity.setPk(pk);
        entity.setBoobRt(getRight());
        entity.setBoobLf(getLeft());
        entity.setPumpingType(getPumpingType());
        entity.setStorageLocation(getStorageLocation());
        entity.setDuration(getDuration());

        return entity;
    }
}