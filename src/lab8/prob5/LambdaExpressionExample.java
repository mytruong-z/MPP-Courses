package lab8.prob5;

import java.util.Arrays;
import java.util.List;
//a. Use a Lambda Expression:
public class LambdaExpressionExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation", "Everywhere you want to be");

		//print each element of the list in upper case
		list.forEach(s -> System.out.println(s.toUpperCase()));
	}
}