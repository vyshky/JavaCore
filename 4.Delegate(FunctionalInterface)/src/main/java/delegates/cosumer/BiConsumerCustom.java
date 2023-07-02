package delegates.cosumer;

import java.util.Objects;
import java.util.function.BiConsumer;

@FunctionalInterface // предоставляет ограничение в 1 метод, при добавлении 2 метода IDE будет ругаться
public interface BiConsumerCustom<In1, In2> {
    void accept(In1 value1, In2 value2);

    default BiConsumerCustom<In1, In2> andThen(BiConsumerCustom<? super In1, ? super In2> after) {
        Objects.requireNonNull(after);
        return (l, r) -> {
            accept(l, r);
            after.accept(l, r);
        };
    }
}
