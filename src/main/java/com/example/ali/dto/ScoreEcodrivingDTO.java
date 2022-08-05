package com.example.ali.dto;

import com.example.ali.entity.ScoreEcodriving;
import com.example.ali.entity.User;
import lombok.Data;

@Data
public class ScoreEcodrivingDTO {

    private User user;
    private ScoreEcodriving scoreEcodriving;
}
