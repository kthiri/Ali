package com.example.ali.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Ecodriving {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int driverId;

    private int idLing;

    private int highRpm;

    private float fuelConsumption;

    private float crusing;


}
