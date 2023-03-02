package main.demo.collectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UtilsDemo {
	
	public static void main(String[] args) {
		arrListDemo();
	}
	
	
	private static void arrListDemo() {
		int[] arr = {40,10,15,7} ;
		for(int i:arr) System.out.print(i+",");
		System.out.println();
		
		Arrays.sort(arr);
		for(int i:arr) System.out.print(i+",");
		System.out.println();
		
		String[] strArr = {"u","a","k","d"};
		List<String> strList = Arrays.asList(strArr);
		System.out.println(strList);
	}


	private static void CollectionsDemo() {
		List<String> alist = new ArrayList<>();
		alist.add("Manoj");
		alist.add("Darshan");
		alist.add("Karthik");
		alist.add("Mohan");
		System.out.println(alist);
		
//		Natural ordering
		Collections.sort(alist);
		System.out.println(alist);		
		
//		Using comparator
//		Collections.sort(alist,new MyComparator());
//		System.out.println(alist);	
		
//		Collections search
		System.out.println(Collections.binarySearch(alist, "Mohan"));
		System.out.println(Collections.binarySearch(alist, "Manoj"));
		
		Collections.reverse(alist);
		System.out.println(alist);	
	}
}

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}