package baseball;

import java.util.List;

public class OutputView {
    public void printResult(List<GameResult> results) {
        if (results.stream().allMatch(i -> i == GameResult.NOTHING)) {
            System.out.println("포볼");
            return;
        }
        if (results.contains(GameResult.BALL)) {
            System.out.printf("%d 볼", results.stream().filter(i -> i == GameResult.BALL).count());;
        }
        if (results.contains(GameResult.STRIKE)) {
            System.out.printf("%d 스트라이크", results.stream().filter(i -> i == GameResult.STRIKE).count());
        }
        System.out.printf("\n");
    }

    public  void printEnd() {
        System.out.println("3개의 숫자를 모두 맞추셨습니다. 게임 종료.");
    }
}
