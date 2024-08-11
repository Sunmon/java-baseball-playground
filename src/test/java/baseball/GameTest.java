package baseball;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


class GameTest {
    static Game game;

    @BeforeAll
    static void beforeAll() {
        game = new Game();
    }

    @Test
    @DisplayName("정답으로 1~9 사이의 숫자 3개를 생성한다")
    void generateAnswer() {
        int[] result = game.generateAnswer();

        assertThat(result).hasSize(3);
        for(int n : result) {
            assertThat(n).isBetween(1,9);
        }
    }
}