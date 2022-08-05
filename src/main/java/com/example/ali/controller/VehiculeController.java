package com.example.ali.controller;

import com.example.ali.dao.VehiculeRepository;
import com.example.ali.dto.VehiculeDto;
import com.example.ali.entity.Vehicule;
import com.example.ali.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vehicules")
public class VehiculeController {


    private    VehiculeRepository repository;
    private VehiculeService service;

    public VehiculeController(VehiculeRepository vehiculeRepository,VehiculeService vehiculeService){
        this.repository=vehiculeRepository;
        this.service=vehiculeService;
    }

    @GetMapping
    public List<Vehicule> getAll(){
        return repository.findAll();
    }
    @GetMapping("response")
    public List<VehiculeDto> getAllDto(){
        return service.getALl();
    }

    @PostMapping
    public void addVehicule(@RequestBody Vehicule vehicule){
        repository.save(vehicule);
    }


}
