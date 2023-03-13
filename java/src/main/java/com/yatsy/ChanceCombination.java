package com.yatsy;

import java.util.Arrays;

public class ChanceCombination extends Combination {

    public ChanceCombination() {
    }

    public int score(Dice dice) {
        return Arrays.stream(dice.getDiceValues()).sum();
    }
}
