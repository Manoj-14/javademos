package main.demo;

public class ConstructorChainingdemo {
	public static void main(String[] args) {
		ChildClass cc = new ChildClass(10);
	}
}


class SuperClass{
	int x;
	SuperClass(){
		System.out.println("No arg superclass constructor");
	}
	
	SuperClass(int x){
		System.out.println("Parameter Constructor of super class");
		this.x = x;
	}
}

class ChildClass extends SuperClass{
	
	public ChildClass() {
		System.out.println("No arg childclass constructor");
	}
	ChildClass(int x){
		super(x);
		System.out.println("Parameter Constructor of child class");
	}
	
}