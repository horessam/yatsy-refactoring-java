package com.yatsy;

public class SmallStraightCombination extends Combination {

    public SmallStraightCombination() {
    }

    public int score(Dice dice) {
        int[] counts = dice.getCounts();
        for (int i = 0; i < counts.length - 2; i++) {
            if (counts[i] != 1)
                return 0;
        }
        return 15;
    }
}
