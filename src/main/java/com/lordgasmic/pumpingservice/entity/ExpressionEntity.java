package com.lordgasmic.pumpingservice.entity;

import com.lordgasmic.pumpingservice.model.PumpingType;
import com.lordgasmic.pumpingservice.model.StorageLocation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "expression_vw")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpressionEntity {

    @EmbeddedId
    private ExpressionEntityPk pk;
    private int boobRt;
    private int boobLf;
    private PumpingType pumpingType;
    private StorageLocation storageLocation;
    private int duration;
}
