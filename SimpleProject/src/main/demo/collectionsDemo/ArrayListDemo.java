package main.demo.collectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		arrListOfAll();
		System.out.println("------------");
		arrListofString();
		System.out.println("------------");
		arrListofInt();
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
	
}
