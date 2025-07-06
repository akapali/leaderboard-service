package com.leaderboard_service.leaderboard_service.controller;

import com.leaderboard_service.leaderboard_service.dto.ScoreRequest;
import com.leaderboard_service.leaderboard_service.model.UserScore;
import com.leaderboard_service.leaderboard_service.service.LeaderboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leaderboard")
public class LeaderboardController {

    @Autowired
    private LeaderboardService leaderboardService;

    @PostMapping("/score")
    public String addScore(@RequestBody ScoreRequest request) {
        leaderboardService.addOrUpdateScore(request.getUserId(), request.getScore());
        return "Score updated successfully!";
    }

    @GetMapping("/all")
    public List<UserScore> getAllScores() {
        return leaderboardService.getAllScores();
    }
}
