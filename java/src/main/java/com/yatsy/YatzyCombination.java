package com.yatsy;

public class YatzyCombination extends Combination {

    public YatzyCombination() {
    }

    public int score(Dice dice) {
        int[] counts = dice.getCounts();
        for (int count : counts) {
            if (count == 5) {
                return 50;
            }
        }
        return 0;
    }
}
