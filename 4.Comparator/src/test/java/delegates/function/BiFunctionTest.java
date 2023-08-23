package delegates.function;

import delegates.function.BiFunctionCustom;
import delegates.function.FunctionCustom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiFunctionTest {
    @Test
    public void apply() {
        BiFunctionCustom<String, String, Integer> biFunc = (x, y) -> Integer.valueOf(x + y);
        Integer numberLeft = 20;
        Integer numberRight = biFunc.apply("10", "10");
        Assertions.assertEquals(numberLeft, numberRight, "BiFunction filed to apply");
    }

    @Test
    public void andThen() {
        Double numberLeft = 2020.0;
        BiFunctionCustom<String, String, Integer> biFunc = (x, y) -> Integer.valueOf(x + y);
        FunctionCustom<Number, Number> func = (x) -> x.doubleValue() + x.doubleValue();
        Number result = biFunc.andThen(func).apply("10", "10");
        Assertions.assertEquals(numberLeft, result, "BiFunction filed to create");
    }
}
