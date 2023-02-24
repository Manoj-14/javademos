package main;

import main.demo.Car;

public class Main {
	public static void main(String[] args) {
//		System.out.println("From Main Method");
		
		Car car1 = new Car("car1","white",4);
		
		System.out.println(car1.car_name);
		System.out.println(car1.color);
		System.out.println(car1.num_of_wheels);
		System.out.println(Car.manufacturer);
		Car.manufacturer = "Audi" ;
		
		Car car2 = new Car("car2","white",4);
		System.out.println(car2.car_name);
		System.out.println(car2.color);
		System.out.println(car2.num_of_wheels);
		System.out.println(Car.manufacturer);
		
	}
	
//	static {
//		System.out.println("From Static block 1");
//	}
//	
//	static {
//		System.out.println("From Static block 2");
//	}
}
