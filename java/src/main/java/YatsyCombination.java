public class YatsyCombination extends Combination {

    public YatsyCombination() {
    }

    public int score(Dice dice) {
        int[] counts = dice.getCounts();
        for (int count : counts) {
            if (count == 5) {
                return 50;
            }
        }
        return 0;
    }
}
