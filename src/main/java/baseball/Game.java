package baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Game {

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
    public List<Ball> pickBalls(int n) {
        List<Ball> result = new ArrayList<>();
        for(int i = 0; i< n; i++) {
            Ball ball = new Ball();
            ball.setPos(i);
            result.add(ball);
        }

        // 중복 검사
        for(int i = 0; i<result.size(); i++) {
            for(int j = i+1; j < result.size(); j++) {
                if (result.get(i).equals(result.get(j))) {
                    return pickBalls(n);
                }
            }
        }

        return result;
    }

    public GameResult throwBall(List<Ball> balls, Ball userBall) {
        return balls.stream().map(i -> i.getResult(userBall)).max(Comparator.comparingInt(GameResult::ordinal)).get();

    }

    public void play() {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        List<Ball> balls = pickBalls(3);

        while(true) {
            List<Integer> userInputs = parseToIntList(inputView.getUserInput());
            List<Ball> userBalls = createBalls(userInputs);
            List<GameResult> results = new ArrayList<>();
            for(int i = 0; i<userBalls.size(); i++) {
                results.add(throwBall(balls, userBalls.get(i)));
            }
           outputView.printResult(results);
            if (results.stream().allMatch(i -> i == GameResult.STRIKE)) {
                outputView.printEnd();
                break;
            }
        }

        boolean restart = inputView.getRestartInput().equals("1");
        if (restart) {
            play();
        }
    }

    public List<Integer> parseToIntList(String input) {
        return input.chars().map(Character::getNumericValue).boxed().collect(Collectors.toList());
    }

    public List<Ball> createBalls(List<Integer> inputs) {
        List<Ball> result = new ArrayList<>();
        for(int i = 0; i<inputs.size(); i++) {
            result.add(new Ball(inputs.get(i), i));
        }

        return result;
    }
}
