package main.demo.searching;

public class LinearSearchDemo {
	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 1, 0, 3, 23 };
		long start = System.currentTimeMillis();
		int key = 7;
		int index = linearSearch(arr, key);
		long end = System.currentTimeMillis();
		if (index != -1)
			System.out.println(key + " found at :" + index);
		else
			System.out.println(key + " not found");

		System.out.println("\nTime taken for Searching : " + (end - start));
	}
}
