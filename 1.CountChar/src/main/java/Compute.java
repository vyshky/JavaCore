import java.util.HashMap;
import java.util.Map;

public class Compute {
    public static void main(String[] args) {
        Map<Character, Integer> result = new HashMap<>();
        String str = "HelloWorld";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        System.out.println("End");
    }
}
