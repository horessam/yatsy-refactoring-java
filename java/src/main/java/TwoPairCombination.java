
public class TwoPairCombination extends Combination {

    public TwoPairCombination() {
    }

    public int score(Dice dice) {
        int[] counts = dice.getCounts();
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
}