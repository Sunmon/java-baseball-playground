package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {
    Game game = new Game();

    @Test
    @DisplayName("중복되지 않는 공 N개를 뽑는다")
    void pickBallsTest() {
        int n = 3;
        List<Ball> balls = game.pickBalls(n);
        assertThat(balls).hasSize(n);
        assertThat(balls).extracting("value").doesNotHaveDuplicates();
        assertThat(balls).extracting("pos").containsExactly(0,1,2);
    }

    @Test
    @DisplayName("공의 자리와 값을 비교하여 결과를 얻는다")
    void throwBallTest() {
        GameResult STRIKE = game.throwBall(new Ball(1, 0), new Ball(1,0));
        GameResult BALL = game.throwBall(new Ball(1, 0), new Ball(1,1));
        GameResult NOTHING = game.throwBall(new Ball(1, 0), new Ball(2,0));

        assertThat(STRIKE).isEqualTo(GameResult.STRIKE);
        assertThat(BALL).isEqualTo(GameResult.BALL);
        assertThat(NOTHING).isEqualTo(GameResult.NOTHING);
    }
}
