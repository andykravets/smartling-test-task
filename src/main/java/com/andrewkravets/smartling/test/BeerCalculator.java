package com.andrewkravets.smartling.test;

public class BeerCalculator {
    private static final int BIG_BOTTLE_SIZE = 3;

    public boolean gotBeer(int goalPints, int smallBottles, int bigBottles) {
        final int bigBottleAmount = BIG_BOTTLE_SIZE * bigBottles;
        final int goalWithoutSmall = goalPints - smallBottles;
        if (bigBottleAmount > goalWithoutSmall) {
            return gotBeer(goalPints - smallBottles, 0, bigBottles - 1);
        } else {
            return goalWithoutSmall <= 0 || goalWithoutSmall - bigBottleAmount == 0;
        }
    }
}
