package main.demo.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		int[] arr1;

//		printArr(arr);
//		arr[0] = 13;
//		printArr(arr);
//		arr[3] = new Integer(34);
//		printArr(arr);
//		arr[4] = new Integer(37);
//		printArr(arr);

		addZeroAtFive();
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
	}

	public static void addZeroAtFive() {
		int arr[] = { 3, 5, 4, 5, 6, 3, 5, 7 };
		for (int i = 0; i < arr.length; i++) {
			if (i == 0)
				continue;
			else 
				if (arr[i - 1] == 3 && arr[i] == 5)
					arr[i] = 0;

		}

		printArr(arr);
	}
}
