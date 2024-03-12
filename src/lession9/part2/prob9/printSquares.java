package lesson9.Lab9Part2.prob9;

import java.util.stream.IntStream;

public class printSquares {
    public static void main(String[] args) {
        printSquares(4);
    }

    public static void printSquares(int num) {
        IntStream intStream = IntStream.iterate(1, n -> squares(n) );
        System.out.println(intStream.limit(num).boxed().toList());
    }
    public static int squares(int n){
        return  (int) Math.pow((int)Math.sqrt(n) + 1, 2);
    }
}
