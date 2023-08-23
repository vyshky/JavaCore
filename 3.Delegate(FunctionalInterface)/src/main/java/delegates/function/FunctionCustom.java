package delegates.function;

@FunctionalInterface // предоставляет ограничение в 1 метод, при добавлении 2 метода IDE будет ругаться
public interface FunctionCustom<In,Out> {
    Out apply(In value);
}
