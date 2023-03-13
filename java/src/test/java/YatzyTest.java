import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    @ParameterizedTest
    @CsvSource({
        "2, 3, 4, 5, 1, 15",
        "3, 3, 4, 5, 1, 16"
    })
    public void chance(int die1, int die2, int die3, int die4, int die5, int expected) {
        Dice dice = new Dice(die1, die2, die3, die4, die5);
        Yatzy yatzy = new Yatzy(dice);
        assertEquals(expected, yatzy.chance());
    }

    @ParameterizedTest
    @CsvSource({
        "4, 4, 4, 4, 4, 50",
        "6, 6, 6, 6, 6, 50",
        "6, 6, 6, 6, 3, 0"
    })
    public void yatsy(int die1, int die2, int die3, int die4, int die5, int expected) {
        Dice dice = new Dice(die1, die2, die3, die4, die5);
        Yatzy yatzy = new Yatzy(dice);
        assertEquals(expected, yatzy.yatzy());
    }

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3, 4, 5, 1",
        "1, 2, 1, 4, 5, 2",
        "6, 2, 2, 4, 5, 0",
        "1, 2, 1, 1, 1, 4"
    })
    public void ones(int die1, int die2, int die3, int die4, int die5, int expected) {
        Dice dice = new Dice(die1, die2, die3, die4, die5);
        Yatzy yatzy = new Yatzy(dice);
        assertEquals(expected, yatzy.ones());
    }

    @ParameterizedTest
    @CsvSource({
        "1, 1, 3, 4, 5, 0",
        "1, 2, 3, 2, 6, 4",
        "2, 2, 2, 2, 2, 10"
    })
    public void twos(int die1, int die2, int die3, int die4, int die5, int expected) {
        Dice dice = new Dice(die1, die2, die3, die4, die5);
        Yatzy yatzy = new Yatzy(dice);
        assertEquals(expected, yatzy.twos());
    }

    @ParameterizedTest
    @CsvSource({
        "1, 2, 2, 4, 5, 0",
        "1, 2, 3, 2, 3, 6",
        "2, 3, 3, 3, 3, 12"
    })
    public void threes(int die1, int die2, int die3, int die4, int die5, int expected) {
        Dice dice = new Dice(die1, die2, die3, die4, die5);
        Yatzy yatzy = new Yatzy(dice);
        assertEquals(expected, yatzy.threes());
    }


    @ParameterizedTest
    @CsvSource({
        "1, 2, 3, 3, 5, 0",
        "4, 4, 4, 5, 5, 12",
        "4, 4, 5, 5, 5, 8",
        "4, 5, 5, 5, 5, 4"
    })
    public void fours(int die1, int die2, int die3, int die4, int die5, int expected) {
        Dice dice = new Dice(die1, die2, die3, die4, die5);
        Yatzy yatzy = new Yatzy(dice);
        assertEquals(expected, yatzy.fours());
    }

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3, 4, 4, 0",
        "4, 4, 4, 5, 5, 10",
        "4, 4, 5, 5, 5, 15",
        "4, 5, 5, 5, 5, 20"
    })
    public void fives(int die1, int die2, int die3, int die4, int die5, int expected) {
        Dice dice = new Dice(die1, die2, die3, die4, die5);
        Yatzy yatzy = new Yatzy(dice);
        assertEquals(expected, yatzy.fives());
    }

    @ParameterizedTest
    @CsvSource({
        "4, 4, 4, 5, 5, 0",
        "4, 4, 6, 5, 5, 6",
        "6, 5, 6, 6, 5, 18"
    })
    public void sixes(int die1, int die2, int die3, int die4, int die5, int expected) {
        Dice dice = new Dice(die1, die2, die3, die4, die5);
        Yatzy yatzy = new Yatzy(dice);
        assertEquals(expected, yatzy.sixes());
    }

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3, 4, 5, 0",
        "3, 4, 3, 5, 6, 6",
        "5, 3, 3, 3, 5, 10",
        "5, 3, 6, 6, 5, 12"
    })
    public void one_pair(int die1, int die2, int die3, int die4, int die5, int expected) {
        Dice dice = new Dice(die1, die2, die3, die4, die5);
        Yatzy yatzy = new Yatzy(dice);
        assertEquals(expected, yatzy.onePair());
    }

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3, 4, 5, 0",
        "3, 3, 5, 4, 5, 16",
        "3, 3, 5, 5, 5, 16"
    })
    public void two_pair(int die1, int die2, int die3, int die4, int die5, int expected) {
        Dice dice = new Dice(die1, die2, die3, die4, die5);
        Yatzy yatzy = new Yatzy(dice);
        assertEquals(expected, yatzy.twoPair());
    }

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3, 4, 5, 0",
        "3, 3, 3, 4, 5, 9",
        "5, 3, 5, 4, 5, 15",
        "3, 3, 3, 3, 5, 9",
        "3, 3, 3, 3, 3, 9"
    })
    public void three_of_a_kind(int die1, int die2, int die3, int die4, int die5, int expected) {
        Dice dice = new Dice(die1, die2, die3, die4, die5);
        Yatzy yatzy = new Yatzy(dice);
        assertEquals(expected, yatzy.threeOfAKind());
    }

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3, 4, 5, 0",
        "3, 3, 3, 3, 5, 12",
        "5, 5, 5, 4, 5, 20",
        "3, 3, 3, 3, 3, 12"
    })
    public void four_of_a_knd(int die1, int die2, int die3, int die4, int die5, int expected) {
        Dice dice = new Dice(die1, die2, die3, die4, die5);
        Yatzy yatzy = new Yatzy(dice);
        assertEquals(expected, yatzy.fourOfAKind());
    }


    @ParameterizedTest
    @CsvSource({
        "1, 2, 3, 4, 5, 15",
        "2, 3, 4, 5, 1, 15",
        "1, 2, 2, 4, 5, 0"
    })
    public void small_straight(int die1, int die2, int die3, int die4, int die5, int expected) {
        Dice dice = new Dice(die1, die2, die3, die4, die5);
        Yatzy yatzy = new Yatzy(dice);
        assertEquals(expected, yatzy.smallStraight());
    }

    @ParameterizedTest
    @CsvSource({
        "6, 2, 3, 4, 5, 20",
        "2, 3, 4, 5, 6, 20",
        "1, 2, 2, 4, 5, 0"
    })
    public void large_straight(int die1, int die2, int die3, int die4, int die5, int expected) {
        Dice dice = new Dice(die1, die2, die3, die4, die5);
        Yatzy yatzy = new Yatzy(dice);
        assertEquals(expected, yatzy.largeStraight());
    }

    @ParameterizedTest
    @CsvSource({
        "6, 2, 2, 2, 6, 18",
        "2, 3, 4, 5, 6, 0",
        "2, 2, 2, 5, 6, 0"
    })
    public void full_house(int die1, int die2, int die3, int die4, int die5, int expected) {
        Dice dice = new Dice(die1, die2, die3, die4, die5);
        Yatzy yatzy = new Yatzy(dice);
        assertEquals(expected, yatzy.fullHouse());
    }
}
