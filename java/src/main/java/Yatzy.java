public class Yatzy {

    private final int[] dice;

    public Yatzy(int die1, int die2, int die3, int die4, int die5) {
        dice = new int[]{die1, die2, die3, die4, die5};
    }





    public static int fullHouse(int die1, int die2, int die3, int die4, int die5) {
        int[] tallies;
        boolean _2 = false;
        int i;
        int _2_at = 0;
        boolean _3 = false;
        int _3_at = 0;

        tallies = new int[6];
        tallies[die1 - 1] += 1;
        tallies[die2 - 1] += 1;
        tallies[die3 - 1] += 1;
        tallies[die4 - 1] += 1;
        tallies[die5 - 1] += 1;

        for (i = 0; i != 6; i += 1)
            if (tallies[i] == 2) {
                _2 = true;
                _2_at = i + 1;
            }

        for (i = 0; i != 6; i += 1)
            if (tallies[i] == 3) {
                _3 = true;
                _3_at = i + 1;
            }

        if (_2 && _3)
            return _2_at * 2 + _3_at * 3;
        else
            return 0;
    }

    public int pair() {
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

    public int threeOfAKind() {
        return nOfAKind(3) * 3;
    }

    public int fourOfAKind() {
        return nOfAKind(4) * 4;
    }

    public int smallStraight() {
        int[] counts = getCounts();
        for (int i = 0; i < counts.length-2; i++) {
            if (counts[i] != 1)
                return 0;
        }
        return 15;
    }

    public int largeStraight() {
        int[] counts = getCounts();
        for (int i = 1; i < counts.length-1; i++) {
            if (counts[i] != 1)
                return 0;
        }
        return 20;
    }

    private int sum(int[] dice) {
        int total = 0;
        for (int die : dice) {
            total += die;
        }
        return total;
    }


    private int[] getCounts() {
        int[] counts = new int[6];
        for (int die : dice) {
            counts[die - 1]++;
        }
        return counts;
    }

    private int count(int value) {
        int total = 0;
        for (int die : dice) {
            if (die == value) {
                total = total + die;
            }
        }
        return total;
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



