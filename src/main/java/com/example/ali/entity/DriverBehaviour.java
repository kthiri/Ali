package com.example.ali.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class DriverBehaviour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int driverId;

    private float meanSpeed;

    private float stdSpeed;

    private float maxSpeed;

    private float harchAcceleration;

    private float harchBraking;


}
