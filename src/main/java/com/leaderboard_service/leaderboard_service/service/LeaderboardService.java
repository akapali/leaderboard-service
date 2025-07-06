package com.leaderboard_service.leaderboard_service.service;

import com.leaderboard_service.leaderboard_service.model.UserScore;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LeaderboardService {

    // userId -> total score
    private final Map<String, Integer> userScoreMap = new HashMap<>();

    public void addOrUpdateScore(String userId, int score) {
        int newScore = userScoreMap.getOrDefault(userId, 0) + score;
        userScoreMap.put(userId, newScore);
    }

    public List<UserScore> getAllScores() {
        List<UserScore> list = new ArrayList<>();
        for (var entry : userScoreMap.entrySet()) {
            list.add(new UserScore(entry.getKey(), entry.getValue()));
        }
        return list;
    }
}