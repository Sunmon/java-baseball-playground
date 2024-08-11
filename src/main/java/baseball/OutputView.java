package baseball;

public class OutputView {
    void printResult(int[] result) {
        if (result[0] == 0 && result[1] == 0) {
            System.out.println("포볼");
            return;
        }

        System.out.printf("%d볼 %d스트라이크\n", result[0], result[1]);
    }

    void printEndMessage() {
        System.out.println("3개의 숫자를 모두 맞추셨습니다. 게임 종료.");
    }
}
