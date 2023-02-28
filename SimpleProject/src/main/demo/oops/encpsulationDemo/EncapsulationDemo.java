package main.demo.oops.encpsulationDemo;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Car car = new Car("White",4);
//		car.setColor("Black");
//		car.setNumOfWheels(6);
		
		System.out.println(car.getColor());
		System.out.println(car.getNumOfWheels());
	}
}

class Car {
	private String color;
	private int numOfWheels;
	
	public Car() {}
	
	public Car(String color,int now) {
		this.setColor(color);
		this.setNumOfWheels(now);
	}

	public String getColor() {
		if (this.color == null) {
			return "Not Mentioned Yet" ;
		}		
		return color;
	}

	public void setColor(String color) {
		
		this.color = color;
	}

	public int getNumOfWheels() {
		
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	
	
}