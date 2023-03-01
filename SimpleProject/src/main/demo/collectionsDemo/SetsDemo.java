package main.demo.collectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {
	
	public static void main(String[] args) {
//		randomDemo();
		hashSetDemo();
	}
	
	private static void randomDemo() {
		Random random = new Random();
		System.out.println(random.nextInt(10,20));
	}
	
	private static void hashSetDemo() {
		Random random = new Random();
		List<Integer> lInt= new ArrayList<Integer>(); 
		for(int i=0;i<10;i++) {
			lInt.add(random.nextInt(1,10));
		}
		System.out.println("List:"+lInt);
		
		Set<Integer> hashSet = new HashSet<>(lInt); 
		System.out.println("Hash Set:"+hashSet); // Get sorted no duplicants
		
		Set<Integer> lhashSet = new LinkedHashSet<>(lInt);
		System.out.println("LinkedHash Set:"+lhashSet); //Elements in order of list no duplicants
		
		Set<Integer> treeSet = new TreeSet<>(lInt);
		System.out.println("Tree Set:"+treeSet); // Maintains order(sorted)
	}
}
