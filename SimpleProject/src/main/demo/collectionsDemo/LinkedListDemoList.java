package main.demo.collectionsDemo;

import java.util.LinkedList;

public class LinkedListDemoList {

	public static void main(String[] args) {
		linkedListInt();
	}
	
	public static void linkedListInt() {
		LinkedList<Integer> llInt =new LinkedList<Integer>();
		
		for (int i=10;i<=100;i+=10) {
			llInt.add(i);
		}
		
		
		System.out.println(llInt);
	}
}

