package delegates.function;

import java.util.Objects;

@FunctionalInterface // предоставляет ограничение в 1 метод, при добавлении 2 метода IDE будет ругаться
public interface BiFunctionCustom<InType, InType2, Return> {
    Return apply(InType value1, InType2 value2);

    //// TypeValue - любой он берется из аргуметов          Тут будет возвращатся          принимаемый тип       возвращаемый тип
//               |                                            |                                    |                      |
    default <TypeValue> BiFunctionCustom<InType, InType2, TypeValue> andThen(FunctionCustom<? super Return, ? extends TypeValue> functionAfter) {
        Objects.requireNonNull(functionAfter);
        return (InType value1, InType2 value2) -> functionAfter.apply(apply(value1, value2));
        // super Return - говорит нам, что тип данных на вход должен быть : изменяемым, super классом
        // extends TypeValue - говорит нам, что тип данных на выходе будет не изменяемым, но если тип изменить на super TypeValue и привести функцию к типу (TypeValue)functionAfter.apply(apply(value1, value2)); , то он тоже станет изменяемым с возможными ошибками, не рекомендуется так делать
    }
}
