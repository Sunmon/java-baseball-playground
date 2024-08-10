package study;
import java.util.Scanner;

public class Calculator {
    Scanner scanner;
//    String[] values;

    public Calculator() {
        this.scanner = new Scanner(System.in);
    }
    public String getInput() {
        System.out.println("Input something:");
        String value = "";
        while(scanner.hasNext()) {
             value = scanner.nextLine();
        }
//        return scanner.nextLine();
//        scanner.close();
        return value;
    }

    public double calculate(String input) {
        String[] values = input.split(" ");
        double result = Double.parseDouble(values[0]);
        for(int i = 1; i<values.length; i++){
            try {
                int num = Integer.parseInt(values[i]);
                switch(values[i-1]) {
                    case "+": result += num; break;
                    case "-": result -= num; break;
                    case "*": result *= num; break;
                    case "/": result /= num; break;
                }
            } catch(Exception e) {
                // 숫자가 아니라 사칙연산인 경우 건너뛰기
//                System.out.println(e.toString());
                continue;
            }
        }
        return result;
    }
}
