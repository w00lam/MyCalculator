package Step3;

import java.util.function.BiFunction;

public enum OperatorType{
    ADD('+'), SUB('-'), MUL('*'), DIV('/');

    private final char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public static OperatorType fromSymbol(char symbol) {
        for (OperatorType type : values()) {
            if (type.symbol == symbol) return type;
        }
        throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
    }
}
