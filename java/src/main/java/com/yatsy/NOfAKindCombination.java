package com.yatsy;

public class NOfAKindCombination extends Combination {
    private final int number;

    public NOfAKindCombination(int number) {
        this.number = number;
    }

    public int score(Dice dice) {
        int[] counts = dice.getCounts();
        for (int i = counts.length - 1; i > 0; i--) {
            if (counts[i] >= number) {
                return i + 1;
            }
        }
        return 0;
    }
}
