package main.demo.ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		 nullpointerDemo();
	}
	
	
	private static void nullpointerDemo() {
		try {
		String s=null;
		System.out.println(s.length());
		}catch(Exception e) {
			System.out.println("Exception occured");
		}
	}
	private static void zeroErrorDemo() {
		int a,b,c,d;
		System.out.print("Enter 2 numbers:");
		Scanner input = new Scanner(System.in);
		try {			
			a = input.nextInt();
			b = input.nextInt();
			int res = a / b;
			System.out.printf(" Result: %d\n",res);
		}catch(Exception e){
			System.out.println("Error is "+e);
		}
		System.out.println("Outside the try");
	}
}
