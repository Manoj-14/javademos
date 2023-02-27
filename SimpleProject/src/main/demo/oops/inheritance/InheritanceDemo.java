package main.demo.oops.inheritance;

public class InheritanceDemo {
	public static void main(String[] args) {
		Vehicals vehical = new Vehicals(2,3);
		vehical.fuel();
		
		Vehicals bus = new Bus(3,4,5);
		bus.fuel();
	}
}
