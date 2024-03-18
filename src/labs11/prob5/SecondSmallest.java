package lab11.labs.prob5;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondSmallest {
    public static <T extends Comparable<? super T>> Optional<T> secondSmallest(List<T> list) {
        if (list == null || list.size() < 2) return Optional.empty();

        T smallest = list.get(0);
        T secondSmallest = null;
        for (T element : list) {
            if (element.compareTo(smallest) < 0) {
                secondSmallest = smallest;
                smallest = element;
            } else if (secondSmallest == null || element.compareTo(secondSmallest) < 0 && element.compareTo(smallest) != 0) {
                secondSmallest = element;
            }
        }
        return Optional.ofNullable(secondSmallest);
    }

    public static void main(String[] args) {
        // Test with a list of Integers
        List<Integer> integerList = Arrays.asList(5, 3, 8, 2, 4);
        System.out.println("Second smallest integer: " + secondSmallest(integerList).orElse(null));

        // Test with a list of Strings
        List<String> stringList = Arrays.asList("banana", "apple", "cherry", "date");
        System.out.println("Second smallest string: " + secondSmallest(stringList).orElse(null));

        // Test with a list of LocalDates
        List<LocalDate> dateList = Arrays.asList(LocalDate.of(2020, 1, 1), LocalDate.of(2022, 1, 1), LocalDate.of(2021, 1, 1));
        System.out.println("Second smallest date: " + secondSmallest(dateList).orElse(null));
    }

}
