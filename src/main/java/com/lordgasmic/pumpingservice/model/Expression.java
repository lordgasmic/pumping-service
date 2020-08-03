package com.lordgasmic.pumpingservice.model;

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
}