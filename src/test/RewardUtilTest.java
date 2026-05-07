package com.rewards.app.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for reward calculation utility.
 */
class RewardUtilTest {

    @Test
    void shouldReturnZeroPointsWhenAmountBelow50() {

        long points = RewardUtil.calculatePoints(40);

        Assertions.assertEquals(0, points);
    }

    @Test
    void shouldReturnTwentyFivePointsFor75Dollars() {

        long points = RewardUtil.calculatePoints(75);

        Assertions.assertEquals(25, points);
    }

    @Test
    void shouldReturnNinetyPointsFor120Dollars() {

        long points = RewardUtil.calculatePoints(120);

        Assertions.assertEquals(90, points);
    }

    @Test
    void shouldReturnThreeHundredFiftyPointsFor250Dollars() {

        long points = RewardUtil.calculatePoints(250);

        Assertions.assertEquals(350, points);
    }

    @Test
    void shouldReturnZeroForNegativeAmount() {

        long points = RewardUtil.calculatePoints(-100);

        Assertions.assertEquals(0, points);
    }

    @Test
    void shouldReturnZeroForZeroAmount() {

        long points = RewardUtil.calculatePoints(0);

        Assertions.assertEquals(0, points);
    }

    @Test
    void shouldReturnZeroPointsForNegativeAmount() {

        long points = RewardUtil.calculatePoints(-200);

        Assertions.assertEquals(0, points);
    }

    @Test
    void shouldReturnEmptyListWhenNoTransactionsExist() {

        when(transactionRepository.getTransactions())
                .thenReturn(List.of());

        List<CustomerRewardResponse> response =
                rewardService.getCustomerRewards();

        Assertions.assertTrue(response.isEmpty());
    }
}