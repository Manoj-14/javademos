package main.demo.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		for(int i=1 ;i<=10 ;i++) num.add(i);
		System.out.println(num);
		List<Integer> evenNum = num.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenNum);
		List<Integer> multiplyBy2 = num.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(multiplyBy2);
		
		List<String> names = new ArrayList<>();
		names.add("MAX");
		names.add("MILLER");
		names.add("JHON");
		names.add("COLLINS");
		
		List<String> lowerCase = names.stream().map(i->i.toLowerCase()).collect(Collectors.toList());
		System.out.print(lowerCase);
	}
}
