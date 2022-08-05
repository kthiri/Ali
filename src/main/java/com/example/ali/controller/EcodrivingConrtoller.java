package com.example.ali.controller;

import com.example.ali.dao.EcodrivingRepository;
import com.example.ali.entity.Ecodriving;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ecodriving")
public class EcodrivingConrtoller {

    @Autowired
    EcodrivingRepository repository;

    @GetMapping
    public List<Ecodriving> getAll(){
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public List<Ecodriving> findById(@PathVariable int id){
        return repository.findScoreDrivingBehaviouByDriverId(id);
    }
    @PostMapping
    public void create(@RequestBody Ecodriving ecodriving){
        repository.save(ecodriving);
    }
}
