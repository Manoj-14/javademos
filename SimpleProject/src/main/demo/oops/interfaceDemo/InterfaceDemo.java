package main.demo.oops.interfaceDemo;

public class InterfaceDemo {
	public static void main(String[] args) {
		Honda h = new Honda();
		h.go();
		h.stop();
	}
}

interface Car{
	void go();
	void stop();
}

class Honda implements Car{

	@Override
	public void go() {
		System.out.println("Inside honda go");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Inside honda stop");
	}
	
}