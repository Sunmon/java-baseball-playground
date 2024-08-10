package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("split() 테스트")
    void 요구사항1(){
        String[] result1 = "1,2".split(",");
        assertThat(result1).contains("1","2");

       String[] result2 =  "1,".split(",");
        assertThat(result2).containsExactly("1");
    }

    @Test
   @DisplayName("substring() 테스트")
    void 요구사항2(){
        String input = "(1,2)";
        String result = input.substring(1, input.length()-1);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt() 테스트")
    void 요구사항3(){
        String input = "abc";
        char result = input.charAt(2);
        assertThat(result).isEqualTo('c');

        assertThatThrownBy(() -> {
            input.charAt(5);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range:");
    }
}
