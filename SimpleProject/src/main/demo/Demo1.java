package main.demo;

public class Demo1 {

	public Demo1() {
		System.out.println("From the Constructor");
	
	}
	{
		System.out.println("From Non Static block");
	}
	
	public static void main(String[] args) {
		System.out.println("From Main Method");
		
		Demo1 demo = new Demo1();
	}
}
