
public class FullHouseCombination extends Combination {

    public FullHouseCombination() {
    }

    public int score(Dice dice) {

        int[] counts = dice.getCounts();

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
}