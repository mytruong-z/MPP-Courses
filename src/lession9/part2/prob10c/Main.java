package lesson9.Lab9Part2.prob10c;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(16,1,1,2,9);
        IntSummaryStatistics summaryStatistics = integerStream.collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("The max number is: " + summaryStatistics.getMax());
        System.out.println("The min number is: " + summaryStatistics.getMin());
    }
}
