package delegates.binaryOperation;

import delegates.function.BiFunctionCustom;
import delegates.function.FunctionCustom;

import java.util.Objects;

@FunctionalInterface // предоставляет ограничение в 1 метод, при добавлении 2 метода IDE будет ругаться
public interface BinaryOperatorCustom<T> extends BiFunctionCustom<T, T, T> {
    //Return apply(In1 value1, In2 value2);

//    default <V> BinaryOperatorCustom<In1, In2, V> andThen(FunctionCustom<? super Return, ? extends V> after) {
//        Objects.requireNonNull(after);
//        return (In1 t, In2 u) -> after.apply(apply(t, u));
//    }
}
