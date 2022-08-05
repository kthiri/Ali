package com.example.ali.controller;

import com.example.ali.dao.DriverBehaviourRepository;
import com.example.ali.entity.DriverBehaviour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("behaviour")
public class DriverBehaviourController {

    @Autowired
    DriverBehaviourRepository driverBehaviourRepository;

    @GetMapping
    public List<DriverBehaviour> getAll(){
        return driverBehaviourRepository.findAll();
    }
    @GetMapping("/{id}")
    public List<DriverBehaviour> findById(@PathVariable int id){
        return driverBehaviourRepository.findScoreDrivingBehaviouByDriverId(id);
    }
    @PostMapping
    public void create(@RequestBody DriverBehaviour behaviour){
        driverBehaviourRepository.save(behaviour);
    }
}
