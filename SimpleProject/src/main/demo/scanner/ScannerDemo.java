package main.demo.scanner;

import java.util.Scanner;

public class ScannerDemo {
	
	
	
	public static void scannerDemo1() {
		int id;
		String name;
		double salary;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Id:");
		id = input.nextInt();
		System.out.println("Enter name:");
		name = input.next();
		System.out.println("Enter salary:");
		salary = input.nextDouble();
		System.out.println(id+"|"+name+"|"+salary);
		input.close();
	}
	
	
	public static void scannerDemo2() {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter number to add (char to exit):");
		while(input.hasNextInt()) {
			sum += input.nextInt();
			System.out.println("Enter number to add (char to exit):");
		}
		System.out.println("Sum: "+sum);
		
	}
	
	
	public static void main(String[] args) {
		scannerDemo2();
	}
}


