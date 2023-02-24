package main.demo;

public class DataTypeDemo {
	static byte a = 127 ;
	static short b = 32767 ;
	
	static float c = 1.23f ; //f at and because by default all decimal value are double
	static double d = 123.6 ;
	
	public static void main(String[] args) {
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(c);
		System.out.println(d);
	}
}
