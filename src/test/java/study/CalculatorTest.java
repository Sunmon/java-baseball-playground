package study;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class CalculatorTest {
    static Calculator calculator;
    String value;
    @BeforeAll
    static void beforeAll(){
        calculator = new Calculator();
    }

    @ParameterizedTest
    @DisplayName("사칙연산 테스트")
    @CsvSource(value = {"3 + 5 - 1=7","3 - 5 * 4 / 2=-4"}, delimiter = '=')
    void calculateTest(String input, String expected){
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        Scanner scanner = new Scanner(in);
        assertThat(calculator.calculate(input)).isEqualTo(Double.parseDouble(expected));
    }
}
