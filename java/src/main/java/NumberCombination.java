import java.util.Arrays;

public class NumberCombination extends Combination {
    private final int number;

    public NumberCombination(int number) {
        this.number = number;
    }

    public int score(Dice dice) {
        return Arrays.stream(dice.getDiceValues())
            .filter(diceValue -> diceValue == number
            ).sum();
    }
}
