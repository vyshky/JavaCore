package consumer;

import delegates.cosumer.ConsumerCustom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConsumerTest {
    @Test
    public void apply() {
        ConsumerCustom<String> consumer = (x) -> String.valueOf(x);
        Assertions.assertNotNull(consumer, "Consumer filed to apply");
    }
}
