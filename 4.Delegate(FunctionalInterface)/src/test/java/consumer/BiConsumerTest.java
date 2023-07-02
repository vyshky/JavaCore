package consumer;

import delegates.cosumer.BiConsumerCustom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiConsumerTest {
    @Test
    public void accept() {
        BiConsumerCustom<Integer, Integer> biFunc = (x, y) -> Integer.valueOf(x + y);
        biFunc.accept(1, 1);
        Assertions.assertNotNull(biFunc, "BiConsumer filed to apply");
    }

    @Test
    public void andThen() {
        BiConsumerCustom<Integer, Integer> first = (x, y) -> System.out.println(x + y);
        BiConsumerCustom<Integer, Integer> second = (x, y) -> Integer.valueOf(x + y);
        BiConsumerCustom<Integer, Integer> three = (x, y) -> Integer.valueOf(x + y);
        first.andThen(second)
                .andThen(three)
                .accept(10, 10);
        Assertions.assertNotNull(first, "BiConsumer filed to andThen");
    }
}
