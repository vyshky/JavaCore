package comporator;

import comparator.*;
import delegates.binaryOperation.BinaryOperatorCustom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class ComparatorTest {
    Integer left = -1;
    Integer right = 1;
    Integer equals = 0;

    @Test
    public void Compare() {
        ComparatorCustom<Integer> comparatorMax = (v1, v2) -> v1 > v2 ? -1 : (v1 == v2) ? 0 : 1;
        ComparatorCustom<Integer> comparatorMin = (v1, v2) -> v1 < v2 ? -1 : (v1 == v2) ? 0 : 1;
        Assertions.assertEquals(right, comparatorMax.compare(10, 20), "Comparator find max filed to compare right");
        Assertions.assertEquals(left, comparatorMax.compare(33, 20), "Comparator find max filed to compare left");
        Assertions.assertEquals(left, comparatorMin.compare(10, 20), "Comparator find min filed to compare left");
        Assertions.assertEquals(right, comparatorMin.compare(33, 20), "Comparator find min filed to compare right");
        Assertions.assertEquals(equals, comparatorMin.compare(20, 20), "Comparator equals filed to compare equals");
    }

    @Test
    public void Min() {
        // В ComparatorCustom<IntegerCustom> comparatorCustom запысывается лямбда из Instance
        // c типом ComparatorCustom<ComparableCustom<Object>> и кастица в ComparatorCustom, потом в ComparatorCustom<IntegerCustom> не явно
        // Ограничение ставятся для программиста, чтобы нельзя было отправлять другие типы в a и b

        Singleton instance = Singleton.INSTANCE;
        ComparatorCustom<IntegerCustom> comparatorCustom = (ComparatorCustom<IntegerCustom>) (ComparatorCustom) instance; // Происходит кастинг в интерфейс ComparatorCustom без типа в <>, и после не явно кастинг ComparatorCustom<IntegerCustom>, но в это примере мы явно скастили
        BinaryOperatorCustom<IntegerCustom> biInstanceFunction = (a, b) -> comparatorCustom.compare(a, b) <= 0 ? a : b;
        var result1 = biInstanceFunction.apply(new IntegerCustom(33), new IntegerCustom(20)).toString();
        Assertions.assertEquals("20", result1, "Comparator find min filed");

        // Готовый рабочий резаультат
        BinaryOperatorCustom<IntegerCustom> bin = BinaryOperatorCustom.minBy(ComparatorCustom.naturalOrder());
        var result2 = bin.apply(new IntegerCustom(33), new IntegerCustom(20)).toString();
        Assertions.assertEquals("20", result2, "Comparator find min filed");
    }

    // Если не прописывать защиту интерфейсом ComparatorCustom<IntegerCustom>, то может получится такая ошибка, когда разработчик попытается записать не то, что задумывалось
    // В тесте выше, этой проблемы нет, так как тип BinaryOperatorCustom<IntegerCustom>, заменить на BinaryOperatorCustom<Object> не получится
    @Test
    public void MinError() {
        Singleton instance = Singleton.INSTANCE;
        ComparatorCustom comparatorCustom = instance; // Происходит необработанное кастинг типа ComparatorCustom<ComparableCustom<Object>>
        BinaryOperatorCustom<Object> biInstanceFunction = (a, b) -> comparatorCustom.compare(a, b) <= 0 ? a : b;
        var result1 = biInstanceFunction.apply(33, 20).toString();
        Assertions.assertEquals("20", result1, "Comparator find min filed");
    }
}
