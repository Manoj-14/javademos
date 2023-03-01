package main.demo.collectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		arrListOfAll();
		System.out.println("------------");
		arrListofString();
		System.out.println("------------");
		arrListofInt();
		System.out.println("------------");
		modifyArrList();
	}
	
	public static void arrListOfAll() {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2.5f);
		al.add("Manoj");
		System.out.println(al);
	}
	public static void arrListofInt() {
		ArrayList<Integer> alInt = new ArrayList<>();
		alInt.add(2);
		alInt.add(4);
		alInt.add(6);
		alInt.add(8);
		System.out.println(alInt);
	}
	
	public static void arrListofString() {
		ArrayList<String> alInt = new ArrayList<>();
		alInt.add("Manoj");
		alInt.add("Darshan");
		alInt.add("Karthik");
		alInt.add("Mohan");
		System.out.println(alInt);
	}
	
	public static void modifyArrList() {
		ArrayList<Integer> alInt = new ArrayList<Integer>();
		
		for (int i=10;i<=100;i+=10) {
			alInt.add(i);
		}
		System.out.println(alInt);
		
		System.out.println("Setting value at pos 3:");
		alInt.set(3, 101);
		System.out.println(alInt);
		
		System.out.println("Adding value at pos 3:");
		alInt.add(3, 40);
		System.out.println(alInt);
		
		System.out.println("Removing a value at index 4:");
		alInt.remove(4);
		System.out.println(alInt);
		
		System.out.println("Searching value 90:");
		System.out.println(alInt.contains(90));
		System.out.println("Searching value 200:");
		System.out.println(alInt.contains(200));
	}
}
