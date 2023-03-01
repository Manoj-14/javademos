package main.demo.collectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		arrListOfAll();
		System.out.println("------------");
		
	}
	
	public static void arrListOfAll() {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2.5f);
		al.add("Manoj");
		System.out.println(al);
	}
	
	
}
