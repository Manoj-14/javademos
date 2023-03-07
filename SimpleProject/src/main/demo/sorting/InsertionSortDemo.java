package main.demo.sorting;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortDemo {
	
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(2);
		numList.add(5);
		numList.add(1);
		numList.add(12);
		numList.add(0);
		System.out.println(numList);
		insertionSort(numList);
		System.out.println(numList);
	}
	
	public static void insertionSort(List<Integer> numList) {
		int len = numList.size();
		for (int i = 0; i < len - 1; i++) {
			if (numList.get(i) > numList.get(i + 1)) {
				numList.add(i, numList.get(i + 1));
				numList.remove(i+2);
				for (int j = i; j > 0; j--) {
					if(numList.get(j-1) > numList.get(j)) {
						numList.add(j-1, numList.get(j));
						numList.remove(j+1);
					}
				}
			}
		}
	}
}
