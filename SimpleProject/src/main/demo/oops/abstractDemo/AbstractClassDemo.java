package main.demo.oops.abstractDemo;

public class AbstractClassDemo {

	public static void main(String[] args) {
		BMWThreeSeries b3 = new BMWThreeSeries();
		b3.start();
		b3.accelarate();
	}

}

abstract class BMW {
	void start() {
		System.out.println("BMW Started");
	}

	abstract void accelarate();
}

class BMWThreeSeries extends BMW {
	@Override
	void accelarate() {
		System.out.println("Tree time accelarated");
	}
}

class BMWFiveSeries extends BMW {
	@Override
	void accelarate() {
		System.out.println("Five time accelarated");
	}
}