package main.demo.oops.polymorphismDemo;

public class PolymorphismDemo {
	public static void main(String[] args) {
		CompileTimePoly cmp = new CompileTimePoly();
		cmp.add(3, 2);
		cmp.add(3.23f, 5.76f);
		cmp.add(3, 8, 1);
		
		
		Macbook mb = new MacbookPro();
		mb.start();
		mb.stop();
	}
}

class CompileTimePoly{
	void add(int a,int b) {
		int res = a + b ;
		System.out.printf("Addtion of 2 int %d\n",res);
	}
	
	void add(float a, float b) {
		float res = a + b ;
		System.out.printf("Addtion of 2 float %f\n",res);
	}
	
	void add(int a,int b,int c) {
		int res = a + b + c;
		System.out.printf("Addtion of 3 int %d\n",res);
	}
	
}

//Runtime polymorphism

class Macbook{
	void start() {
		System.out.println("Macbook started");
	}
	
	void stop() {
		System.out.println("Macbook stoped");
	}
}

class MacbookAir extends Macbook{
	void start() {
		System.out.println("MacbookAir started");
	}
	
	void stop() {
		System.out.println("MacbookAir stoped");
	}
}

class MacbookPro extends Macbook{
	void start() {
		System.out.println("MacbookPro started");
	}
	
	void stop() {
		System.out.println("MacbookPro stoped");
	}
}