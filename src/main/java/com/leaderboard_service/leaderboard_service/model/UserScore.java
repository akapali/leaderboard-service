package com.leaderboard_service.leaderboard_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class UserScore {
    private String userId;
    private int totalScore;

    public UserScore(String key, Integer value) {
    }
}