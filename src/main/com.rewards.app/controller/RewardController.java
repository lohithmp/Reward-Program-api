package com.rewards.app.controller;

import com.rewards.app.dto.CustomerRewardResponse;
import com.rewards.app.service.RewardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller for reward endpoints.
 */
@RestController
@RequestMapping("/api/rewards")
@RequiredArgsConstructor
public class RewardController {

    private final RewardService rewardService;

    /**
     * Fetches rewards for all customers.
     */
    @GetMapping
    public ResponseEntity<List<CustomerRewardResponse>> getRewards() {

        return ResponseEntity.ok(rewardService.getCustomerRewards());
    }
}