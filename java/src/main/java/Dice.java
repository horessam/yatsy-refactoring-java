public class Dice {
    private final int[] diceValues;

    public Dice(int die1, int die2, int die3, int die4, int die5) {
        diceValues = new int[]{die1, die2, die3, die4, die5};
    }

    public int[] getDiceValues() {
        return diceValues;
    }

    public int[] getCounts() {
        int[] counts = new int[6];
        for (int die : this.getDiceValues()) {
            counts[die - 1]++;
        }
        return counts;
    }

}
