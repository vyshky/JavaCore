package BinaryOperationTest;

import delegates.binaryOperation.BinaryOperatorCustom;
import delegates.function.FunctionCustom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryOperationTest {
    @Test
    public void apply() {
        BinaryOperatorCustom<String, String, Integer> biOperation = (x, y) -> Integer.parseInt(x + y);
        Integer left = 1010;
        Integer result = biOperation.apply("10", "10");
        Assertions.assertEquals(left, result, "BinaryOperation filed to apply");
    }

    @Test
    public void andThen() {
        BinaryOperatorCustom<String, String, Integer> first = (x, y) -> Integer.parseInt(x + y);
        FunctionCustom<Integer, Double> second = (x) -> x.doubleValue();
        Double left = 1010.0;
        Double result = first.andThen(second).apply("10", "10");
        System.out.println();
        Assertions.assertEquals(left, result, "BinaryOperation filed to apply");
    }
}
