package delegates.BinaryOperationTest;

import delegates.binaryOperation.BinaryOperatorCustom;
import delegates.function.FunctionCustom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperationTest {
    @Test
    public void apply() {
        BinaryOperatorCustom<String> biOperation = (x, y) -> x + y;
        String left = "1010";
        String result = biOperation.apply("10", "10");
        Assertions.assertEquals(left, result, "BinaryOperation filed to apply");
    }

    @Test
    public void andThen() {
        BinaryOperatorCustom<String> first = (x, y) -> x + y;
        FunctionCustom<String, Double> second = (x) -> Double.valueOf(x);
        Double left = 1010.0;
        Double result = first.andThen(second).apply("10", "10");
        Assertions.assertEquals(left, result, "BinaryOperation filed to apply");
    }
}
