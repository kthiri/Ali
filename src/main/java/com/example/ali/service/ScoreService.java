package com.example.ali.service;

import com.example.ali.dao.ScoreDrivingRepository;
import com.example.ali.dao.ScoreEcodrivingRepository;
import com.example.ali.dao.UserRepository;
import com.example.ali.dto.ScoreAllDTO;
import com.example.ali.dto.ScoreBehaviourDTO;
import com.example.ali.dto.ScoreEcodrivingDTO;
import com.example.ali.entity.ScoreDrivingBehaviou;
import com.example.ali.entity.ScoreEcodriving;
import com.example.ali.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScoreService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ScoreEcodrivingRepository scoreEcodriving;
    @Autowired
    ScoreDrivingRepository drivingRepository;

    public List<ScoreEcodrivingDTO> getAllEcodriving() {
        List<ScoreEcodrivingDTO> list = new ArrayList<>();
        List<ScoreEcodriving> fromDB = scoreEcodriving.findAll();
        for (int i = 0; i < fromDB.size(); i++) {
            User user;
            ScoreEcodrivingDTO response = new ScoreEcodrivingDTO();
            try {
                user = userRepository.findById(fromDB.get(i).getDriverId()).get();

                response.setUser(user);

            } catch (Exception e) {

            }
            ScoreEcodriving score = fromDB.get(i);
            response.setScoreEcodriving(score);

            list.add(response);
        }
        return list;
    }
    public List<ScoreBehaviourDTO> getAllBehaviour() {
        List<ScoreBehaviourDTO> list = new ArrayList<>();
        List<ScoreDrivingBehaviou> fromDB = drivingRepository.findAll();
        for (int i = 0; i < fromDB.size(); i++) {
            User user;
            ScoreBehaviourDTO response = new ScoreBehaviourDTO();
            try {
                user = userRepository.findById(fromDB.get(i).getDriverId()).get();

                response.setUser(user);

            } catch (Exception e) {

            }
            ScoreDrivingBehaviou score = fromDB.get(i);
            response.setScoreDrivingBehaviou(score);

            list.add(response);
        }
        return list;
    }
    public List<ScoreAllDTO> getAllMixed(){
        List<ScoreAllDTO> list = new ArrayList<>();
        List<ScoreDrivingBehaviou> fromDB = drivingRepository.findAll();
        List<ScoreEcodriving> fromDb2=scoreEcodriving.findAll();
        List<User> users=userRepository.findAll();

        for(int i=0;i<users.size();i++){
            ScoreAllDTO response = new ScoreAllDTO();
            ScoreDrivingBehaviou score =drivingRepository.findScoreDrivingBehaviouByDriverId(users.get(i).getId());
            ScoreEcodriving scoreEco =scoreEcodriving.findScoreEcodrivingByDriverId(users.get(i).getId());
            response.setUser(users.get(i));
            response.setScoreEcodriving(scoreEco);
            response.setScoreDrivingBehaviou(score);
            if(score!=null && scoreEco!=null) {
                list.add(response);
            }

        }
                return list;

    }
}
