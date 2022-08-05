package com.example.ali.dao;

import com.example.ali.entity.DriverBehaviour;
import com.example.ali.entity.Ecodriving;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DriverBehaviourRepository extends JpaRepository<DriverBehaviour,Integer> {
    public List<DriverBehaviour> findScoreDrivingBehaviouByDriverId(int driverId);

}
