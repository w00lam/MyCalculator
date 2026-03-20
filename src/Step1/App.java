package Step1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

            switch (c) {
                case '+':
                    System.out.println("결과: " + (a + b));
                    break;
                case '-':
                    System.out.println("결과: " + (a - b));
                    break;
                case '*':
                    System.out.println("결과: " + (a * b));
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    } else {
                        System.out.println("결과: " + (a / b));
                    }
                    break;
            }
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            choice = sc.nextLine();
        } while (!choice.equalsIgnoreCase("exit"));

        sc.close();
    }
}