package main.demo.collectionsDemo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		intSet();
		stringSet();
	}
	
	
	private static void intSet() {
		Set<Integer> setInt = new TreeSet<Integer>() ;		
		setInt.add(5);
		setInt.add(6);
		setInt.add(1);
		setInt.add(2);
		System.out.println(setInt);
	}
	
	private static void stringSet() {
		Set<String> setInt = new TreeSet<String>() ;		
		setInt.add("Zoyaff");
		setInt.add("Ravif");
		setInt.add("Abhi");
		setInt.add("Das");
		System.out.println(setInt);
		
		
		Set<String> setInt1 = new TreeSet<String>(new StringComparator()) ;		
		setInt1.add("Zoyaff");
		setInt1.add("Ravif");
		setInt1.add("Abhi");
		setInt1.add("Dasa");
		System.out.println(setInt1);
	}
	
	
	
}

class StringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		int l1 = o1.length();
		int l2 = o2.length();
		if(l1 > l2) return -1;
		else if(l1 < l2) return 1;
		else return o1.compareTo(o2);
	}
	
}
