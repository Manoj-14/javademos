package main.demo.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 35 };
		int[] arr1;

//		printArr(arr);
//		arr[0] = 13;
//		printArr(arr);
//		arr[3] = new Integer(34);
//		printArr(arr);
//		arr[4] = new Integer(37);
//		printArr(arr);

//		addZeroAtFive();
		System.out.println("Sum of array:" + sumOfArr(arr));
		System.out.println("Sum of even num in array:" + sumofEvenNumInArr(arr));
		System.out.println("Reverse string:" + reverseString("Hello World"));

		arrOfObjects();
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
			else if (arr[i - 1] == 3 && arr[i] == 5)
				arr[i] = 0;

		}

		printArr(arr);
	}

	public static int sumOfArr(int arr[]) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	public static int sumofEvenNumInArr(int arr[]) {
		int sum = 0;
		for (int i : arr) {
			if (i % 2 == 0)
				sum += i;
		}
		return sum;
	}

	private static String reverseString(String str) {
		String reverse = "";
//		for(int i = str.length()-1 ; i>=0 ;i--) {
//			reverse += str.charAt(i);
//		}

		for (char i : str.toCharArray())
			reverse = i + reverse;

		return reverse;
	}

	private static void arrOfObjects() {
		Employee emp1 = new Employee(1, "Manoj", 1200000, "A00021");
		Employee emp2 = new Employee(2, "Darshan", 1200020, "A00022");
		Employee emp3 = new Employee(3, "Karthik", 1200020, "A00023");
		
		Employee[] emp = {emp1,emp2,emp3};
		
		for(Employee e:emp) System.out.println(e);
	}
}

