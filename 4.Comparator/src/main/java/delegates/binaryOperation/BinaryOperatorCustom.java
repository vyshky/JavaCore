package delegates.binaryOperation;

import comparator.ComparatorCustom;
import delegates.function.BiFunctionCustom;

import java.util.Objects;

@FunctionalInterface // предоставляет ограничение в 1 метод, при добавлении 2 метода IDE будет ругаться
public interface BinaryOperatorCustom<T> extends BiFunctionCustom<T, T, T> {
    //Return apply(In1 value1, In2 value2);

//    default <V> BinaryOperatorCustom<In1, In2, V> andThen(FunctionCustom<? super Return, ? extends V> after) {
//        Objects.requireNonNull(after);
//        return (In1 t, In2 u) -> after.apply(apply(t, u));
//    }

    public static <T> BinaryOperatorCustom<T> minBy(ComparatorCustom<? super T> comparator) {
        Objects.requireNonNull(comparator);
        return (a, b) -> comparator.compare(a, b) <= 0 ? a : b;
    }
}
