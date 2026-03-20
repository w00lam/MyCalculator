package Step3;

import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> calc = new ArithmeticCalculator<>();
        String choice;

        do {
            System.out.println("\n[ 메뉴를 선택하세요 ]");
            System.out.println("1. 사칙연산 수행");
            System.out.println("2. 기준값보다 큰 연산 결과 조회");
            System.out.print("선택: ");
            String menu = sc.nextLine();

            switch (menu) {
                case "1" -> {
                    try {
                        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                        System.out.print("첫 번째 숫자를 입력하세요: ");
                        double a = Double.parseDouble(sc.nextLine());
                        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                        System.out.print("두 번째 숫자를 입력하세요: ");
                        double b = Double.parseDouble(sc.nextLine());
                        // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
                        System.out.print("연산 기호를 입력하세요 (+, -, *, /): ");
                        char symbol = sc.nextLine().charAt(0);

                        // 기호를 Enum으로 변환 및 계산
                        OperatorType operator = OperatorType.fromSymbol(symbol);
                        Double result = calc.calculate(a, b, operator);

                        // 결과 출력 (정수면 소수점 제거)
                        if (result % 1 == 0) {
                            System.out.println("결과: " + result.intValue());
                        } else {
                            System.out.println("결과: " + result);
                        }
                    } catch (Exception e) {
                        System.out.println("오류 발생: " + e.getMessage());
                    }
                }
                case "2" -> {
                    // 2번: 우리가 구현한 필터링 기능
                    if (calc.getResults().isEmpty()) {
                        System.out.println("저장된 연산 결과가 없습니다. 먼저 계산을 수행해주세요.");
                    } else {
                        try {
                            System.out.print("기준값을 입력하세요: ");
                            double input = Double.parseDouble(sc.nextLine());
                            calc.printResultsGreaterThan(input);
                        } catch (NumberFormatException e) {
                            System.out.println("오류: 숫자 형식으로 입력해주세요.");
                        }
                    }
                }
                default -> System.out.println("잘못된 선택입니다. 1번 또는 2번을 입력해주세요.");
            }

            System.out.print("프로그램을 계속하시겠습니까? (exit 입력 시 종료, 그 외 엔터): ");
            choice = sc.nextLine();
        } while (!choice.equalsIgnoreCase("exit"));

        sc.close();
    }
}
