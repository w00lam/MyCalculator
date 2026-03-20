package Step3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {
    private List<Integer> results = new ArrayList<>();

    public void calculate(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+' -> {
                results.add(OperatorType.ADD.apply(operand1, operand2));
                System.out.println("결과: "+OperatorType.ADD.apply(operand1, operand2));
            }
            case '-' -> {
                results.add(OperatorType.SUB.apply(operand1, operand2));
                System.out.println("결과: " + OperatorType.SUB.apply(operand1, operand2));
            }
            case '*' -> {
                results.add(OperatorType.MUL.apply(operand1, operand2));
                System.out.println("결과: " + OperatorType.MUL.apply(operand1, operand2));
            }
            case '/' -> {
                if (operand2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    results.add(OperatorType.DIV.apply(operand1, operand2));
                    System.out.println("결과: " + OperatorType.DIV.apply(operand1, operand2));
                }
            }
        }
    }
}
