import java.util.Arrays;

public class Yatzy {

    private final int[] dice;

    public Yatzy(int die1, int die2, int die3, int die4, int die5) {
        dice = new int[]{die1, die2, die3, die4, die5};
    }

    public int chance() {
        return sum(dice);
    }

    public int yatzy() {
        int[] counts = getCounts();
        for (int count : counts) {
            if (count == 5) {
                return 50;
            }
        }
        return 0;
    }

    public int ones() {
        return count(1);
    }

    public int twos() {
        return count(2);
    }

    public int threes() {
        return count(3);
    }

    public int fours() {
        return count(4);
    }

    public int fives() {
        return count(5);
    }

    public int sixes() {
        return count(6);
    }

    public int onePair() {
        return nOfAKind(2) * 2;
    }

    public int twoPair() {
        int[] counts = getCounts();
        int pairs = 0;
        int score = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] >= 2) {
                pairs++;
                score += (i + 1) * 2;
            }
        }
        return pairs == 2 ? score : 0;
    }

    public int threeOfAKind() {
        return nOfAKind(3) * 3;
    }

    public int fourOfAKind() {
        return nOfAKind(4) * 4;
    }

    public int smallStraight() {
        int[] counts = getCounts();
        for (int i = 0; i < counts.length - 2; i++) {
            if (counts[i] != 1)
                return 0;
        }
        return 15;
    }

    public int largeStraight() {
        int[] counts = getCounts();
        for (int i = 1; i < counts.length - 1; i++) {
            if (counts[i] != 1)
                return 0;
        }
        return 20;
    }

    public int fullHouse() {
        int[] counts = getCounts();

        boolean hasTwo = false;
        boolean hasThree = false;
        int fullHouse = 0;

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 2) {
                hasTwo = true;
                fullHouse += (i + 1) * 2;
            } else if (counts[i] == 3) {
                hasThree = true;
                fullHouse += (i + 1) * 3;
            }
        }

        return hasTwo && hasThree ? fullHouse : 0;
    }

    private int sum(int[] dice) {
        return Arrays.stream(dice).sum();
    }

    private int[] getCounts() {
        int[] counts = new int[6];
        for (int die : dice) {
            counts[die - 1]++;
        }
        return counts;
    }

    private int count(int value) {
        return Arrays.stream(dice)
            .filter(diceValue -> diceValue == value
            ).sum();
    }

    private int nOfAKind(int n) {
        int[] counts = getCounts();
        for (int i = counts.length - 1; i > 0; i--) {
            if (counts[i] >= n) {
                return i + 1;
            }
        }
        return 0;
    }
}



