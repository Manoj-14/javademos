package main.demo.threading;

import java.util.Scanner;

public class JoinDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number(Sum of N number):");
		int n = input.nextInt();
		
		Calculator calculator = new Calculator(n);
		calculator.start();
		
		try {
			calculator.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Sum of first "+n+" is : "+calculator.getSum());
	}
}

class Calculator extends Thread{
	
	int n;
	private int sum=0;


	public Calculator(int n) {
		this.n = n;
	}
	
	public void run() {
		for(int i=0 ; i<=this.n ; i++) sum+=i;
	}
	
	public int getSum() {
		return sum;
	}
}