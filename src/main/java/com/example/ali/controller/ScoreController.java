package com.example.ali.controller;

import com.example.ali.dao.ScoreDrivingRepository;
import com.example.ali.dao.ScoreEcodrivingRepository;
import com.example.ali.dto.ScoreAllDTO;
import com.example.ali.dto.ScoreBehaviourDTO;
import com.example.ali.dto.ScoreEcodrivingDTO;
import com.example.ali.entity.ScoreDrivingBehaviou;
import com.example.ali.entity.ScoreEcodriving;
import com.example.ali.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("score")
public class ScoreController {

    @Autowired
    ScoreEcodrivingRepository ecodrivingRepository;

    @Autowired
    ScoreDrivingRepository drivingRepository;

    @Autowired
    ScoreService service;

    @GetMapping("ecodriving")
    public List<ScoreEcodriving> getAll(){
        return ecodrivingRepository.findAll();
    }
    @GetMapping("ecodriving/{id}")
    public List<ScoreEcodriving> findByid(@PathVariable int id){
        return ecodrivingRepository.findScoreDrivingBehaviouByDriverId(id);
    }
    @PostMapping("ecodriving")
    public void create(@RequestBody ScoreEcodriving ecodriving){
        ecodrivingRepository.save(ecodriving);
    }

    @GetMapping("driving")
    public List<ScoreDrivingBehaviou> getAll2(){
        return drivingRepository.findAll();
    }
    @GetMapping("driving/{id}")
    public List<ScoreDrivingBehaviou> findById(@PathVariable int id){
        return drivingRepository.findByDriverId(id);
    }

    @PostMapping("driving")
    public void create2(@RequestBody ScoreDrivingBehaviou drivingBehaviou){
        drivingRepository.save(drivingBehaviou);
    }


    @GetMapping("ecodrivingUser")
    public List<ScoreEcodrivingDTO> getByUser(){
        return service.getAllEcodriving();
    }

    @GetMapping("drivingUser")
    public List<ScoreBehaviourDTO> getByUserBehviour(){
        return service.getAllBehaviour();
    }

    @GetMapping("mixed")
    public List<ScoreAllDTO> getScoreMixed(){
        return service.getAllMixed();
    }


}
