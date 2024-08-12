package baseball;

import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public String getUserInput() {
        System.out.println("숫자 세개를 입력하세요");
        return scanner.nextLine();
    }

    public String getRestartInput() {
        System.out.println("다시 시작하려면 1, 아니면 2를 입력하세요");
        return scanner.nextLine();
    }
}
