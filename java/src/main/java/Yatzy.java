public class Yatzy {

    private final int[] dice;

    public Yatzy(int die1, int die2, int die3, int die4, int die5) {
        dice = new int[]{die1, die2, die3, die4, die5};
    }

    public static int yatzy(int... dice) {
        int[] counts = new int[6];
        for (int die : dice)
            counts[die - 1]++;
        for (int i = 0; i != 6; i++)
            if (counts[i] == 5)
                return 50;
        return 0;
    }

    public static int pair(int die1, int die2, int die3, int die4, int die5) {
        int[] counts = new int[6];
        counts[die1 - 1]++;
        counts[die2 - 1]++;
        counts[die3 - 1]++;
        counts[die4 - 1]++;
        counts[die5 - 1]++;
        int at;
        for (at = 0; at != 6; at++)
            if (counts[6 - at - 1] >= 2)
                return (6 - at) * 2;
        return 0;
    }

    public static int twoPair(int die1, int die2, int die3, int die4, int die5) {
        int[] counts = new int[6];
        counts[die1 - 1]++;
        counts[die2 - 1]++;
        counts[die3 - 1]++;
        counts[die4 - 1]++;
        counts[die5 - 1]++;
        int n = 0;
        int score = 0;
        for (int i = 0; i < 6; i += 1)
            if (counts[6 - i - 1] >= 2) {
                n++;
                score += (6 - i);
            }
        if (n == 2)
            return score * 2;
        else
            return 0;
    }

    public static int threeOfAKind(int die1, int die2, int die3, int die4, int die5) {
        int[] t;
        t = new int[6];
        t[die1 - 1]++;
        t[die2 - 1]++;
        t[die3 - 1]++;
        t[die4 - 1]++;
        t[die5 - 1]++;
        for (int i = 0; i < 6; i++)
            if (t[i] >= 3)
                return (i + 1) * 3;
        return 0;
    }

    public static int fourOfAKind(int die1, int die2, int die3, int die4, int die5) {
        int[] tallies;
        tallies = new int[6];
        tallies[die1 - 1]++;
        tallies[die2 - 1]++;
        tallies[die3 - 1]++;
        tallies[die4 - 1]++;
        tallies[die5 - 1]++;
        for (int i = 0; i < 6; i++)
            if (tallies[i] >= 4)
                return (i + 1) * 4;
        return 0;
    }

    public static int smallStraight(int die1, int die2, int die3, int die4, int die5) {
        int[] tallies;
        tallies = new int[6];
        tallies[die1 - 1] += 1;
        tallies[die2 - 1] += 1;
        tallies[die3 - 1] += 1;
        tallies[die4 - 1] += 1;
        tallies[die5 - 1] += 1;
        if (tallies[0] == 1 &&
            tallies[1] == 1 &&
            tallies[2] == 1 &&
            tallies[3] == 1 &&
            tallies[4] == 1)
            return 15;
        return 0;
    }

    public static int largeStraight(int die1, int die2, int die3, int die4, int die5) {
        int[] tallies;
        tallies = new int[6];
        tallies[die1 - 1] += 1;
        tallies[die2 - 1] += 1;
        tallies[die3 - 1] += 1;
        tallies[die4 - 1] += 1;
        tallies[die5 - 1] += 1;
        if (tallies[1] == 1 &&
            tallies[2] == 1 &&
            tallies[3] == 1 &&
            tallies[4] == 1
            && tallies[5] == 1)
            return 20;
        return 0;
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

    public int chance() {
        return sum(dice);
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
        int sum = 0;
        for (int at = 0; at < dice.length; at++)
            if (dice[at] == 6)
                sum = sum + 6;
        return sum;
    }

    private int sum(int[] dice) {
        int total = 0;
        for (int die : dice) {
            total += die;
        }
        return total;
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
}



