import delegates.binaryOperation.BinaryOperatorCustom;

public class Main {
    public static void main(String[] args) {
//        Реализовать интерфейсы
//        И на основе этих интерфейсов, реализовать коллектор
//        Consumer<in T> - Done
//        BiConsumer<in T,in T2> - Done
//        BinaryOperator<in T> - Done
//        Function<in T,out R> - Done
//        BiFunction<in T,in U,out R> -Done
//        Predicate<in T>
//        Supplier<in T>
//        UnaryOperator<in T>


//        ConsumerCustom<String> first = x -> System.out.println("first " + x);
//        ConsumerCustom<String> two = x -> System.out.println("second " + x);
//        ConsumerCustom<String> three = x -> System.out.println("three " + x);
//        ConsumerCustom<String> result = first.andThen(two).andThen(three);
//        result.accept(" Consumer println");
//
//        BiConsumerCustom<String, String> biCoCu = (x, y) -> System.out.println(x + y);
//        biCoCu.accept("Bi", "Consumer");


//        Predicate<Integer> bolshe0 = (x) -> x > 0;
//        Predicate<Integer> menshe10 = (x) -> x > 0;
//        System.out.println(bolshe0.and(menshe10).test(2)); // больше 0 и меньше 10, передаем 2
//        System.out.println(bolshe0.test(1)); // больше 0
//        System.out.println(Predicate.not(bolshe0).test(1)); // не больше 0




//        BiFunctionCustom<String, String, Integer> result = (x, y) -> Integer.parseInt(x + y); // 155  str + str
//        FunctionCustom<Number, Number> functionSum55 = (resultIn) -> resultIn.intValue() + 55; // 155 + 55
//        System.out.println(result.apply("1", "55"));
//        System.out.println(result.andThen(functionSum55).apply("1", "55"));


//        BiFunctionCustom<String> biFun = (x, y) -> x + y;
//        System.out.println(biFun.apply("Binary", "Function"));
    }


}
