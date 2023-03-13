package com.yatsy;

public class Yatzy {

    private final Dice dice;

    public Yatzy(Dice dice) {
        this.dice = dice;
    }

    public int chance() {
        return new ChanceCombination().score(dice);
    }

    public int yatzy() {
        return new YatsyCombination().score(dice);
    }

    public int ones() {
        return new NumberCombination(1).score(dice);
    }

    public int twos() {
        return new NumberCombination(2).score(dice);
    }

    public int threes() {
        return new NumberCombination(3).score(dice);
    }

    public int fours() {
        return new NumberCombination(4).score(dice);
    }

    public int fives() {
        return new NumberCombination(5).score(dice);
    }

    public int sixes() {
        return new NumberCombination(6).score(dice);
    }

    public int onePair() {
        return new NOfAKindCombination(2).score(dice) * 2;
    }

    public int twoPair() {
        return new TwoPairCombination().score(dice);
    }

    public int threeOfAKind() {
        return new NOfAKindCombination(3).score(dice) * 3;
    }

    public int fourOfAKind() {
        return new NOfAKindCombination(4).score(dice) * 4;
    }

    public int smallStraight() {
        return new SmallStraightCombination().score(dice);
    }

    public int largeStraight() {
        return new LargeStraightCombination().score(dice);
    }

    public int fullHouse() {
        return new FullHouseCombination().score(dice);
    }
}



