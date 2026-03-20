package Step2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        String choice;

        do {
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = Integer.parseInt(sc.nextLine());
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = Integer.parseInt(sc.nextLine());
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            System.out.print("사칙연산 기호를 입력하세요: ");
            char c = sc.nextLine().charAt(0);

            calc.calculate(a, b, c);
            calc.removeResult();

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            choice = sc.nextLine();
        } while (!choice.equalsIgnoreCase("exit"));

        sc.close();
    }
}