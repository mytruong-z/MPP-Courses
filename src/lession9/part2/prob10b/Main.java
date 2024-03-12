package lesson9.Lab9Part2.prob10b;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stringStr = Stream.of("Bill","Thomas","Mary");
        System.out.println(stringStr.collect(Collectors.joining(", ")));
    }
}
