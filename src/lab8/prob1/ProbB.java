package lab8.prob1;

import java.util.function.Supplier;

public class ProbB {
    /*
    . Rewriting Math::random as a lambda expression:

    Java
    Supplier<Double> randomSupplier = () -> Math.random();

     */

    public static void main(String[] args) {
        RandomSupplier randomSupplier = new RandomSupplier();
        double randomNumber = randomSupplier.get();
        System.out.println("Random number: " + randomNumber);
    }

    static class RandomSupplier implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }

}
