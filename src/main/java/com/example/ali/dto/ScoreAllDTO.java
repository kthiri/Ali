package com.example.ali.dto;

import com.example.ali.entity.ScoreDrivingBehaviou;
import com.example.ali.entity.ScoreEcodriving;
import com.example.ali.entity.User;
import lombok.Data;

@Data
public class ScoreAllDTO {
    private User user;

    private ScoreEcodriving scoreEcodriving;

    private ScoreDrivingBehaviou scoreDrivingBehaviou;

}
