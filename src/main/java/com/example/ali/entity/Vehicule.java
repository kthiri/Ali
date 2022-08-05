package com.example.ali.entity;

import com.example.ali.dao.UserRepository;
import com.example.ali.dao.VehiculeRepository;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Vehicule {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private String brand;

    private String matriculation;


    private int userId;







}
