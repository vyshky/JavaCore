
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        String str = "HelloWorld";
        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                //.collect(Collectors.groupingBy((c) -> c, Collectors.counting()));
                .collect(Collectors.groupingBy(Stream::getChar, Collectors.counting()));
                //.collect(Collectors.toMap((c) -> "45", (c)-> 22L));
        System.out.println("End");
    }

//Function<? super T, ? extends K> // T - передавайемый аргумент, K - возвращаемый тип, можно называть конвертером
    public static char getChar(char c){
        return c;
    }
}
