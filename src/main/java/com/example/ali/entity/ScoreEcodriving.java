package com.example.ali.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ScoreEcodriving {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private int driverId;

    private float scoreidLing;

    private float scorehighRpm;

    private float scorefuelConsumption;

    private float ecoScore;

    private String classificaton;




}
