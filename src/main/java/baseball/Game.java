package baseball;

public class Game {

    int[] generateAnswer() {
        int[] result = new int[3];
        for(int i = 0; i<result.length; i++) {
            result[i] = (int) ((Math.random() * 9) + 1);
        }
        return result;
    }
}
