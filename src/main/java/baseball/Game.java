package baseball;

public class Game {

    int[] generateAnswer() {
        int[] result = new int[3];
        boolean isDup = false;
        for(int i = 0; i<result.length; i++) {
            result[i] = (int) ((Math.random() * 9) + 1);
        }
        // 중복된 숫자 체크
        for(int i = 0; i<result.length; i++) {
            isDup = isDup || result[(i+1)%3] == result[i];
            isDup = isDup || result[(i+2)%3] == result[i];
        }

        return isDup ? generateAnswer() : result;
    }

    // [ball개수, strike개수]를 리턴
    int[] checkAnswer(int[] answer, int[] userInput) {
        int[] result = {0, 0}; // [ball, strike]
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < userInput.length; j++) {
                if (answer[i] != userInput[j]) continue;
                result[i == j ? 1 : 0] += 1;
            }
        }

        return result;
    }
}