package Step3;

import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> calc = new ArithmeticCalculator<>();
        String choice;

        do {
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double operand1 = Double.parseDouble(sc.nextLine());
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("두 번째 숫자를 입력하세요: ");
            double operand2 = Double.parseDouble(sc.nextLine());
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            System.out.print("사칙연산 기호를 입력하세요: ");
            char symbol = sc.nextLine().charAt(0);
            OperatorType operator = OperatorType.fromSymbol(symbol);

            Double result = calc.calculate(operand1, operand2, operator);

            if (result % 1 == 0) {
                System.out.println("결과: " + result.intValue());
            } else {
                System.out.println("결과: " + result);
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            choice = sc.nextLine();
        } while (!choice.equalsIgnoreCase("exit"));

        sc.close();
    }
}
