package comparator;

// ComparableCustom<IntegerCustom> обязательно должен быть тип IntegerCustom, чтобы в методе compareTo() принимался аргумент типом IntegerCustom
// Это ограничение прописанно в интерфейсе, если ComparableCustom<IntegerCustom>, то и в методе будет агрумент с типом IntegerCustom
public class IntegerCustom implements ComparableCustom<IntegerCustom> {
    Integer value;

    public IntegerCustom(Integer value) {
        this.value = value;
    }

    @Override
    public int compareTo(IntegerCustom o) {
        return value < o.value ? -1 : (value == o.value ? 0 : 1);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
