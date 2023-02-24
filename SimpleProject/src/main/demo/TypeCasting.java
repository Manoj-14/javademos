package main.demo;

public class TypeCasting {
	
	public static void main(String[] args) {
		byte a = 2 ;
		int b = 20 ;
		
		b = a ; // implicit conversion
		a = (byte) a; // explicit conversion
		
		
		char c = 'a' ;
		b = c ;
		
		int d = 98 ;
		char e = (char) d;
		
		System.out.println(e);
		
		
//		String f =  c;
		System.out.println(c);
		
		
	}
	
}
