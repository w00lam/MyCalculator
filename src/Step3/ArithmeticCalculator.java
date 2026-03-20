package Step3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> {
    private List<T> results = new ArrayList<>();

    public T calculate(T operand1, T operand2, OperatorType operator) {
        T result;

        double value1 = operand1.doubleValue();
        double value2 = operand2.doubleValue();
        double resultValue = 0;

        switch (operator) {
            case ADD -> resultValue = value1 + value2;
            case SUB -> resultValue = value1 - value2;
            case MUL -> resultValue = value1 * value2;
            case DIV -> {
                if (value2 == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
                resultValue = value1 / value2;
            }
        }

        result = (T) Double.valueOf(resultValue);
        results.add(result);
        return result;
    }
}
