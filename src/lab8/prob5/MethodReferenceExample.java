package lab8.prob5;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation", "Everywhere you want to be");
        list.forEach(System.out::println);
    }
}
