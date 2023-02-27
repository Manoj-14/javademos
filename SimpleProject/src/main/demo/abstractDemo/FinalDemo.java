package main.demo.abstractDemo;

public class FinalDemo{
	public static void main(String[] args) {
		FinalChild fc = new FinalChild();
		fc.A();
	}
}

class Final {
	final int MAX = 10;
	final void A() {		
		System.out.println("Inside A() method");
	}
}

// IF class is Final Cannot extend that class
// If variable is final -> cannot change var value
// If method is final we cannot overide the method
// Abstract Class cannot be a final

final class FinalChild extends Final{
	
}
