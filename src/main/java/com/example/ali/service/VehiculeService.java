package com.example.ali.service;

import com.example.ali.dao.UserRepository;
import com.example.ali.dao.VehiculeRepository;
import com.example.ali.dto.VehiculeDto;
import com.example.ali.entity.User;
import com.example.ali.entity.Vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehiculeService {

    @Autowired
     VehiculeRepository repository;
    @Autowired
     UserRepository userRepository;

    public void AddVehicule(int driverId){

        User user=userRepository.findById(driverId).get();
    }

    public List<VehiculeDto> getALl(){
        List<VehiculeDto> list=new ArrayList<VehiculeDto>();
        List<Vehicule> vehicules=repository.findAll();

        for(int i=0;i<vehicules.size();i++){
            User user=new User();

            try {
                user = userRepository.findById(vehicules.get(i).getUserId()).get();
            }
            catch (Exception e){
            }

            VehiculeDto vehicule =new VehiculeDto();
            vehicule.setBrand(vehicules.get(i).getBrand());
            vehicule.setMatriculation(vehicules.get(i).getMatriculation());
            vehicule.setCin(user.getCin());
            vehicule.setName(user.getFirstName()+' '+user.getLastName());

            list.add(vehicule);

        }
        return list;
    }
}
