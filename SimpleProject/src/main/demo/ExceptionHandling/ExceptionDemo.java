package main.demo.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
//		 nullpointerDemo();
//		zeroErrorDemo();
		try {
			checkedException();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	private static void nullpointerDemo() {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (Exception e) {
			System.out.println("Exception occured");
		}
	}

	private static void zeroErrorDemo() {
		int a, b, c, d;
		System.out.print("Enter 2 numbers:");
		Scanner input = new Scanner(System.in);
		try {
			a = input.nextInt();
			b = input.nextInt();
			int res = a / b;
			System.out.printf("Result: %d\n", res);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch (InputMismatchException ime) {
			System.out.println("Input Mismatch Exception");
		}

//		System.out.println("Outside the try");
	}

	public static void checkedException() throws FileNotFoundException {

		FileInputStream fs = new FileInputStream("C:\\Users\\anm\\git\\javademos\\SimpleProject\\src\\file.txt");
	}
}
