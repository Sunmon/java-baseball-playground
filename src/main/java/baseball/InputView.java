package baseball;

import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);
    String getUserInput() {
        System.out.println("숫자를 입력해주세요:");
        return scanner.nextLine();
    }
}
