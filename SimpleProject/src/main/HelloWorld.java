package main;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("From Main Method");
	}
	
	static {
		System.out.println("From Static block 1");
	}
	
	static {
		System.out.println("From Static block 2");
	}
}
