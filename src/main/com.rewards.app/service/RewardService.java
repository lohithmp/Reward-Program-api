package com.rewards.app.service;

import com.rewards.app.dto.CustomerRewardResponse;

public interface RewardService {

    CustomerRewardResponse getRewardsByCustomerId(Long customerId);
}