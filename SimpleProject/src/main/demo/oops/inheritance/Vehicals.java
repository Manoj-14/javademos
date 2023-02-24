package main.demo.oops.inheritance;

public class Vehicals {

	void fuel() {
		System.out.println("Petrol");
	}
}

class Bus extends Vehicals {
	void fuel() {
		super.fuel();
		System.out.println("CNG");
	}
}

class Car extends Vehicals {
	void fuel() {
		super.fuel();
		System.out.println("Diesal");
	}
}

class Bike extends Vehicals {
	void fuel() {
		super.fuel();
		System.out.println("Electrical");
	}
}