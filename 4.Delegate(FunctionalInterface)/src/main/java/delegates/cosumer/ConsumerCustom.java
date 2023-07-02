package delegates.cosumer;

import java.util.Objects;

@FunctionalInterface // предоставляет ограничение в 1 метод, при добавлении 2 метода IDE будет ругаться
public interface ConsumerCustom<InType> {
    void accept(InType value);

    default ConsumerCustom<InType> andThen(ConsumerCustom<InType> afterConsumer) {
        Objects.requireNonNull(afterConsumer);
        return (InType value) -> {
            accept(value);
            afterConsumer.accept(value);
        };
    }
}
