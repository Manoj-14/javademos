package main.demo.searching;

import java.util.Arrays;

import main.demo.sorting.BubbleSortDemo;

public class BinarySearchDemo {
	public static int binarySearch(int[] arr, int key) {
		BubbleSortDemo.bubbleSort(arr);
		int start = 0, end = arr.length, mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (key == arr[mid])
				return mid;
			else if (key > mid)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 1, 0, 3, 23, 2 };
		int key = 7;
		long start = System.currentTimeMillis();
		int index = binarySearch(arr, key);
		long end = System.currentTimeMillis();
		if (index != -1)
			System.out.println(key + " found at index " + index + " of sorted array " + Arrays.toString(arr));
		else
			System.out.println(key + " not found");

		System.out.println("\nTime taken for Searching : " + (end - start) + "ms");
	}
}
