package Step2;

public class Calculator {
    public void calculate(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+' -> System.out.println("결과: " + (operand1 + operand2));
            case '-' -> System.out.println("결과: " + (operand1 - operand2));
            case '*' -> System.out.println("결과: " + (operand1 * operand2));
            case '/' -> {
                if (operand2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    System.out.println("결과: " + (operand1 / operand2));
                }
            }
        }
    }
}
