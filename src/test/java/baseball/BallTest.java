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

}
