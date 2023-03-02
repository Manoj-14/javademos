package main.demo.innerClasses;

public class InnerClasssDemo1 {
	public static void main(String[] args) {
		ElectronicDevices.powerOn();

		ElectronicDevices.Chip.brandName();

		ElectronicDevices.Chip chip = new ElectronicDevices.Chip();
		chip.specs();
		
		ElectronicDevices laptop = new ElectronicDevices();
		
		
		ElectronicDevices.Processor proc = laptop.new Processor();
		proc.getVoltage();
		
		ElectronicDevices.Processor.processorBrand();
		
	}
}

class ElectronicDevices {
	static void powerOn() {
		System.out.println("Device powered on....");
	}

	static class Chip {
		static void brandName() {
			System.out.println("Brand name....");
		}

		void specs() {
			System.out.println("Specifications of this chip....");
		}
	}

	class Processor {
		void getVoltage() {
			System.out.println("Display voltage of the processor....");
		}
		
		static void processorBrand() {
			System.out.println("Processor Brand name....");
		}
	}
}