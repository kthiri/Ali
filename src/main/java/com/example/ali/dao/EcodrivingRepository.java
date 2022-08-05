package com.example.ali.dao;

import com.example.ali.entity.Ecodriving;
import com.example.ali.entity.ScoreDrivingBehaviou;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EcodrivingRepository extends JpaRepository <Ecodriving,Integer>{
    public List<Ecodriving> findScoreDrivingBehaviouByDriverId(int driverId);

}
