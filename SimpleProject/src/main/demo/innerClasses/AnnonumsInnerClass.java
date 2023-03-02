package main.demo.innerClasses;

public class AnnonumsInnerClass {
	public static void main(String[] args) {
		PrinterConnections pcs = PrinterDriver.getConnection();
		pcs.print();
	}
}

class PrinterDriver{
	static PrinterConnections getConnection() {
		PrinterConnections con = new PrinterConnections() {
			
			@Override
			public void print() {
				System.out.println("Prinintg...");
				
			}
		};
		
//		MyPrinterConnection mpc = new MyPrinterConnection();
		return con;
		
		
	};
}

interface PrinterConnections{
	void print();
}

class MyPrinterConnection implements PrinterConnections{

	@Override
	public void print() {
		System.out.println("MyPrinterConnection Class printing..");
		
	}
	
}