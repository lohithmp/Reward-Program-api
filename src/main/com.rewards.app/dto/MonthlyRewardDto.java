package com.rewards.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents monthly reward details.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MonthlyRewardDto {

    private String month;
    private Long points;
}