package comparator;
public enum Singleton implements ComparatorCustom<ComparableCustom<Object>> {
    INSTANCE;

    // Тип передаваемый в аргументы, должен наследоваться от ComparableCustom<Любой тип так как в аргументах выставлен Object>, то есть может принимать любой тип наследуемый от ComparableCustom<>, напирмер IntegerCustom
    // Сдесь можно передать IntegerCustom у которого вызывается метод compareTo();
    @Override
    public int compare(ComparableCustom<Object> o1, ComparableCustom<Object> o2) {
        return o1.compareTo(o2);
    }

//    @Override
//    public ComparatorCustom<Comparable<Object>> reversed() {
//        return ComparatorCustom.super.reversed();
//    }
}
