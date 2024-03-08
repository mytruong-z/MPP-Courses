package lab8.prob3;

import java.util.function.BiFunction;
import java.util.*;

public class BiFunctionExample {
	/* As a lambda:
	 * public static void main(String[] args) { BiFunction<Integer, Integer,
	 * Integer> f = (x,y) -> 2*x - y; System.out.println(f.apply(2, 3)); }
	 */
	public static void main(String[] args) {
		BiFunction<Double, Double, List<Double>> biFunction = (x, y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add(x * y);
			return list;
		};

		List<Double> result = biFunction.apply(2.0, 3.0);
		System.out.println(result);
	}

}
