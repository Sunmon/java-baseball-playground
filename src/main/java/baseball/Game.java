package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Game {
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

    public GameResult throwBall(Ball ball1, Ball ball2) {
        return ball1.getResult(ball2);
    }

//    public List<GameResult> play() {
//
//    }
}
