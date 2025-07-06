package com.leaderboard_service.leaderboard_service.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ScoreRequest {
    private String userId;
    private int score;
}