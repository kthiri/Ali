package com.example.ali.dao;

import com.example.ali.entity.ScoreDrivingBehaviou;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScoreDrivingRepository extends JpaRepository <ScoreDrivingBehaviou,Integer>{
    public List<ScoreDrivingBehaviou> findByDriverId(int driverId);
    public ScoreDrivingBehaviou findScoreDrivingBehaviouByDriverId(int id);
}
