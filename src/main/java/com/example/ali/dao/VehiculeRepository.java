package com.example.ali.dao;

import com.example.ali.entity.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeRepository extends JpaRepository<Vehicule,Integer> {
}
