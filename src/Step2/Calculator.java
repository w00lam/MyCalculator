package Step2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results = new ArrayList<Integer>();

    public void calculate(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+' -> {
                results.add(operand1 + operand2);
                System.out.println("결과 = " + (operand1 + operand2));
            }
            case '-' -> {
                results.add(operand1 - operand2);
                System.out.println("결과 = " + (operand1 - operand2));
            }
            case '*' -> {
                results.add(operand1 * operand2);
                System.out.println("결과 = " + (operand1 * operand2));
            }
            case '/' -> {
                if (operand2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    results.add(operand1 / operand2);
                    System.out.println("결과 = " + (operand1 / operand2));
                }
            }
        }
    }

    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }
}
