package Step3;

import java.util.function.BiFunction;

public enum OperatorType {
    ADD("+", (operand1, operand2) -> operand1 + operand2),
    SUB("-", (operand1, operand2) -> operand1 - operand2),
    MUL("-", (operand1, operand2) -> operand1 * operand2),
    DIV("-", (operand1, operand2) -> operand1 / operand2);

    private final String symbol;
    private final BiFunction<Integer, Integer, Integer> expression;

    OperatorType(String symbol, BiFunction<Integer, Integer, Integer> expression) {
        this.symbol = symbol;
        this.expression = expression;
    }

    public int apply(Integer operand1, Integer operand2) {
        return expression.apply(operand1, operand2);
    }
}
