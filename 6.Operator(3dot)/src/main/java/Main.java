public class Main {
    public static void main(String[] args) {

    }
    public static <T> T getMiddle(T... a) { //  ... - нужен когда передается много параметров
        return a[a.length / 2];
    }
}
