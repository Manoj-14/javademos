package main.demo.sorting;

import java.util.Arrays;

public class SelectionSortDemo {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 1, 0, 3, 23 };
		System.out.println(Arrays.toString(arr));
		long start = System.currentTimeMillis();
		selectionSort(arr);
		long end = System.currentTimeMillis();
		System.out.println(Arrays.toString(arr));
		System.out.println("\nTime taken for sorting : " + (end - start));
	}

	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min_ind = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[min_ind])
					min_ind = j;
			}
			swap(arr,i,min_ind);
		}
	}

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
