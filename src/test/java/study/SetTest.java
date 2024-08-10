package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현
    @Test
    @DisplayName("Set size() 테스트")
    void 요구사항1(){
//        Assertions.assertEquals(numbers.size(), 3);
        assertThat(numbers.size()).isEqualTo(3);
    }

    @ParameterizedTest
    @DisplayName("Parameterized Test로 중복되는 테스트 간결화")
    @ValueSource(ints = {1,2,3})
    void 요구사항2(int input){
        assertThat(numbers.contains(input)).isTrue();
    }

    @ParameterizedTest
    @DisplayName("Parameterized Test로 중복되는 테스트 간결화-결과까지 간결화")
    @CsvSource({"1,true", "2,true","3,true","4,false","5,false"})
    void 요구사항3(int input, boolean expected){
        assertThat(numbers.contains(input)).isEqualTo(expected);
    }


}