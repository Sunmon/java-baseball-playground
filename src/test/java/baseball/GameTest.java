package baseball;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


class GameTest {
    static Game game;

    @BeforeAll
    static void beforeAll() {
        InputView input = new InputView();
        game = new Game(input);
    }

    @Test
    @DisplayName("정답으로 1~9 사이의 숫자 3개를 생성한다")
    void generateAnswer() {
        int[] result = game.generateAnswer();

        assertThat(result).hasSize(3);
        for (int n : result) {
            assertThat(n).isBetween(1, 9);
        }

        assertThat(result).containsOnlyOnce(result[0], result[1], result[2]);
    }


    static Iterable<Arguments> getTestData() {
        return List.of(
                Arguments.of(new int[]{1, 2, 3},new int[]{3,2,1},new int[] {2,1}),
                Arguments.of(new int[]{4,2,3},new int[]{4,2,3},new int[] {0,3}),
                Arguments.of(new int[]{6,5,4},new int[]{5,4,6},new int[]{3,0}),
                Arguments.of(new int[]{1,2,3},new int[]{4,5,6},new int[]{0,0})
        );
    }

    @ParameterizedTest
    @DisplayName("스트라이크와 볼 개수를 판단한다")
    @MethodSource("getTestData")
    void checkAnswer(int[] answer, int[] userInput, int[] expected) {
        int[] result = game.checkAnswer(answer, userInput);
        assertThat(result).isEqualTo(expected);
    }


}