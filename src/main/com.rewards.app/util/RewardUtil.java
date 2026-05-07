package com.rewards.app.util;

/**
 * Utility class for reward point calculations.
 */
public class RewardUtil {

    private RewardUtil() {
    }

    /**
     * Calculates reward points.
     */
    public static long calculatePoints(double amount) {

        long points = 0;

        if (amount > 100) {
            points += (long) ((amount - 100) * 2); // 40
            points += 50; // 40+50 =90
        } else if (amount > 50) {
            points += (long) (amount - 50); // 100-50 = 50*1=50
        }

        return points;
    }
}