package baseball;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    InputView inputView;

    Game(InputView inputView) {
        this.inputView = inputView;
    }

    public static void main(String[] args) {
        InputView inputView = new InputView();
        Game game = new Game(inputView);
        do {
            game.play();
        } while (game.shouldRestart(inputView.getRestartInput()));
    }

    void play() {
        int[] answer = generateAnswer();
        while(true) {
            int[] userInput = getUserInput(inputView.getUserInput());
            int[] result = checkAnswer(answer, userInput);
            printResult(result);
            if (result[1] == 3) {
                break;
            }
        }
        System.out.println("3개의 숫자를 모두 맞추셨습니다. 게임 종료.");
    }

    int[] getUserInput(String userInput) {
        return userInput.chars() // IntStream
                .map(Character::getNumericValue) // get numeric value
                .toArray(); // 배열 리턴
    }

    void printResult(int[] result) {
        if (result[0] == 0 && result[1] == 0) {
            System.out.println("포볼");
            return;
        }

        System.out.printf("%d볼 %d스트라이크\n", result[0], result[1]);
    }

    boolean shouldRestart(String userInput) {
        return userInput.equals("1");
    }

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