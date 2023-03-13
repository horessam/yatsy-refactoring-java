package com.yatsy;

public class LargeStraightCombination extends Combination {

    public LargeStraightCombination() {
    }

    public int score(Dice dice) {
        int[] counts = dice.getCounts();
        for (int i = 1; i < counts.length - 1; i++) {
            if (counts[i] != 1)
                return 0;
        }
        return 20;
    }
}
