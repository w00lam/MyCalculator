package Step2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    List<Integer> results = new ArrayList<Integer>();
    int result = 0;

    public int calculate(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+' -> results.add(result = operand1 + operand2);
            case '-' -> results.add(result = operand1 - operand2);
            case '*' -> results.add(result = operand1 * operand2);
            case '/' -> {
                if (operand2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    results.add(result = operand1 / operand2);
                }
            }
        }

        return result;
    }
}
