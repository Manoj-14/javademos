package main.demo.oops.interfaceDemo;

import main.demo.oops.inheritance.Vehicals;

public class InterfaceDemo {
	public static void main(String[] args) {
		Honda h = new Honda(4,5);
		h.start();
		h.go();
		h.stop();
		h.start();
		h.carStart();
	}
}

interface Car{
	
	public default void carStart() {
		System.out.println("Start In interface");
	}
	void go();
	void stop();
}

interface Vehicle{
	void start();
}

class Honda extends Vehicals implements Car,Vehicle{

	Honda(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
		System.out.println("Inside honda Constructor");
	}
	
	
	
	@Override
	public void go() {
		System.out.println("Inside honda -> car go");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Inside honda -> car stop");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Inside honda -> vehical  start");
	}
	
//	@Override
//	public void carStart() {
//		System.out.println("Start In honda class");
//	}
}