import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Generic {
    public static void main(String[] args) {
        // Запрещает запись вовсе, В лист List<? extends Number> можно записать только наследников
        List<? extends Number> foo3 = new ArrayList<Number>();  // Number "extends" Number (in this context)
        List<? extends Number> foo4 = new ArrayList<Integer>(); // Integer extends Number
        List<? extends Number> foo5 = new ArrayList<Double>();  // Double extend Number
//        ((List<Integer>)foo3.add(1); // Нет ошибки
//        foo4.add(3); // Ошибка
//        foo5.add(3);


        // Ограничивает на запись только интов, В лист List<? super Integer> можно записать только Базовый класс(родитель)
        List<? super Integer> foo6 = new ArrayList<Integer>();  // Integer is a "superclass" of Integer (in this context)
        List<? super Integer> foo7 = new ArrayList<Number>();   // Number is a superclass of Integer
        List<? super Integer> foo8 = new ArrayList<Object>();   // Object is a superclass of Integer
        foo6.add(2);
        foo7.add(3);
        foo8.add(3);


        //Function<? super T, ? extends K> // T - передавайемый аргумент, K - возвращаемый тип
        Function<Integer, String> convert = x -> String.valueOf(x) + " долларов";
        System.out.println(convert.apply(5)); // 5 долларов

        //Function<? super R, ? extends V> - Очень крутое решение, Function конвертирует значение из R в V
        //но здесь используется super - это значит, в R нельзя передавать дочерние классы, только базовый класс или классы, которые находятся на базовым.
        //А в V используется extend - это значит, что можно передавать дочерние
    }
}
