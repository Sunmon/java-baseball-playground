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
    }


}
