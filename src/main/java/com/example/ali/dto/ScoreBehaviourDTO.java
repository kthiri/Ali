package com.example.ali.dto;

import com.example.ali.entity.ScoreDrivingBehaviou;
import com.example.ali.entity.User;
import lombok.Data;

@Data
public class ScoreBehaviourDTO {
    private User user;
    private ScoreDrivingBehaviou scoreDrivingBehaviou;
}
