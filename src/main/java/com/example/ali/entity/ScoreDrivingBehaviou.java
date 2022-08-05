package com.example.ali.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ScoreDrivingBehaviou {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int driverId;

    private float scoremeanSpeed;

    private float scorestdSpeed;

    private float scoremaxSpeed;

    private float scoreharchAcceleration;

    private float scoreharchBraking;

    private float scoreDrivingBehaviour;

    private String classtification;


}
