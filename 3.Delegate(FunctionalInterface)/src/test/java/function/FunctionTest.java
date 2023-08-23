package function;

import delegates.function.FunctionCustom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FunctionTest {
    @Test
    public void apply() {
        String testStr = "HelloWorld";
        FunctionCustom<String, String> func = (x) -> x.toUpperCase();
        String upperCaseStr = func.apply(testStr);
        Assertions.assertEquals("HELLOWORLD", upperCaseStr, "Function filed to apply");
    }
}
