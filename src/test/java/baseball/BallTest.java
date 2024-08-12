package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {
    @Test
    @DisplayName("정답으로 사용할 숫자 한개를 뽑는다")
    void getRandNumTest() {
        Ball ball = new Ball();
        int num = ball.getRandNum();
        assertThat(num).isBetween(1,9);
    }

    @Test
    @DisplayName("두 공이 같은 값을 가지는지 비교한다")
    void isEqualTest() {
        Ball ball1 = new Ball(1);
        Ball ball2 = new Ball(2);
        Ball ball3 = new Ball(1);
        assertThat(ball1.equals(ball2)).isFalse();
        assertThat(ball1.equals(ball3)).isTrue();
    }

}
