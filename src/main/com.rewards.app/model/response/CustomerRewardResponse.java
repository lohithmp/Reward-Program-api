package com.rewards.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Response object for customer reward details.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRewardResponse {

    private Long customerId;
    private String customerName;
    private List<MonthlyRewardDto> monthlyRewards;
    private Long totalRewardPoints;
}