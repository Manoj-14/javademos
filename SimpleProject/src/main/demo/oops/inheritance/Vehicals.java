package main.demo.oops.inheritance;

public class Vehicals {
	int a , b ;
	Vehicals(int a,int b){
		this.a = a;
		this.b = b ;
	}
	void fuel() {
		System.out.println("Petrol");
	}
}

class Bus extends Vehicals {
	int c;
	Bus(int a, int b,int c) {
		super(a, b);
		this.c = c;
	}

	void fuel() {
		super.fuel();
		System.out.println("CNG");
	}
}

class Car extends Vehicals {
	Car(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	void fuel() {
		super.fuel();
		System.out.println("Diesal");
	}
}

class Bike extends Vehicals {
	Bike(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	void fuel() {
		super.fuel();
		System.out.println("Electrical");
	}
}