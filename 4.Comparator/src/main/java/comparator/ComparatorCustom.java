package comparator;

@FunctionalInterface
public interface ComparatorCustom<T> {
    int compare(T value1, T value2);

    // <T extends ComparableCustom<? super T>> - проверка класса(Типа) на, то чтобы класс наледовался от ComparableCustom
    // и тип(? super T) в правой части был базовым для T или равен T
    public static <T extends ComparableCustom<? super T>> ComparatorCustom<T> naturalOrder() {
        return (ComparatorCustom<T>) Singleton.INSTANCE;
    }

    // Пример
    // Возвращается вот такого типа ComparatorCustom<ComparableCustom<Object>>
//    public static ComparatorCustom<ComparableCustom<Object>> naturalOrder2() {
//        return Singleton.INSTANCE;
//    }
}

