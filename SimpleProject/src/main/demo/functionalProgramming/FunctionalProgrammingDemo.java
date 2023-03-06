package main.demo.functionalProgramming;

public class FunctionalProgrammingDemo {
	public static void main(String[] args) {
//		Traditional way
		Calculator sum = new Calculator();
		sum.calculate(3, 5);

//		Anonymous Inner class
		ICalculator sub = new ICalculator() {

			@Override
			public void calculate(int a, int b) {
				int res = a - b;
				System.out.println("Calculating " + a + "-" + b + "=" + res);
			}
		};
		sub.calculate(10, 5);

//		Anonymous Function Or Lambda Function
		ICalculator multiply = (a, b) -> {
			int res = a * b;
			System.out.println("Calculating " + a + "x" + b + "=" + res);
		};
		multiply.calculate(2, 5);

		Divide divide = (a, b) -> {
			int res = a / b;
			System.out.println("Calculating " + a + "/" + b + "=" + res);
		};
		
		divide.calculate(6, 3);
	}
}

interface ICalculator {
	void calculate(int a, int b);
}

class Calculator implements ICalculator {

	@Override
	public void calculate(int a, int b) {
		int res = a + b;
		System.out.println("Calculating " + a + "+" + b + "=" + res);
	}

}

interface Divide {
	void calculate(int a, int b);
}