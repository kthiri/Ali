package com.example.ali.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;

    private String lastName;

    private Long cin;

    private String username;

    private String email;

    private String passaword;

    private String phone;

    private String driverLicense;

    private int vehiculeId;

    private String role;




}
