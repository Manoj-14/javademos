package main.demo.functionalProgramming;

import java.util.function.Predicate;

public class PredicateDemo {
	// Predicate function -> take one argument and returns boolean
	public static void main(String[] args) {
//		Predicate<Integer> gt20 = (i) -> (i>20);
//		System.out.println("Is 15 > 20 ? :"+gt20.test(15));
//		
//		Predicate<String> stringLenGt5 = (str) -> (str.length() > 5) ;
//		System.out.println("Is len of Hello > 5 ? :"+stringLenGt5.test("Hello World"));
		
		Predicate<Integer> gt5 = (i) -> (i>5);
		Predicate<Integer> even = (i) -> (i%2==0);
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		evenNum(even.and(gt5), arr);
		
	}
	
	public static void evenNum(Predicate<Integer> p,int[] arr) {
		for(int i:arr) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}
	
}
