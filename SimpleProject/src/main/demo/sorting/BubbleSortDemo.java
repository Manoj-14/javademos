package main.demo.sorting;

public class BubbleSortDemo {

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 1, 0, 3, 23 };
		long start = System.currentTimeMillis();
		bubbleSort(arr);
		long end = System.currentTimeMillis();
		for (int i : arr) {
			System.out.print(i + ",");
		}
		System.out.println("\nTime taken for sorting : "+(end-start));
	}
}
