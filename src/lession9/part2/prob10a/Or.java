package lesson9.Lab9Part2.prob10a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
		Or or = new Or();
		System.out.println("The list contain true value : "+or.someSimpleIsTrue(list));
		System.out.println("Using Reduce the list contain true value : "+or.someSimpleIsTrue(list));
	}
	
	public boolean someSimpleIsTrue(List<Simple> list) {
		boolean accum = false;
		for(Simple s: list) {
			accum = accum || s.flag;
		}
		return accum;
	}

}
