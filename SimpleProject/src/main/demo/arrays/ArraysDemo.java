package main.demo.arrays;

public class ArraysDemo {
	
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		int[] arr1;
		
		printArr(arr);
		arr[0] = 13;
		printArr(arr);
		arr[3] = new Integer(34);
		printArr(arr);
		arr[4] = new Integer(37);
		printArr(arr);
	}
	
	
	public static void printArr(int[] arr) {
		for(int i=0; i< arr.length ;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
}
