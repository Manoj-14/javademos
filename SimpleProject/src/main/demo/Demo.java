package main.demo;

public class Demo {
	public static void main(String[] args) {
		System.out.println("From Main Method");
		method1();
		
		Demo demo = new Demo();
		demo.method3();
	}
	
	static void method1() {
		System.out.println("From Static block 1");
	}
	
	static void method2(){
		System.out.println("From Static block 2");
	}
	
	void method3() {
		System.out.println("From Non Static method");
	}
}
