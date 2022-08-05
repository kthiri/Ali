package com.example.ali.dao;

import com.example.ali.entity.Ecodriving;
import com.example.ali.entity.ScoreEcodriving;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScoreEcodrivingRepository extends JpaRepository<ScoreEcodriving,Integer> {
    public List<ScoreEcodriving> findScoreDrivingBehaviouByDriverId(int driverId);
    public ScoreEcodriving findScoreEcodrivingByDriverId(int id);

}
