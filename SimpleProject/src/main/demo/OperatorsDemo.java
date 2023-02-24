package main.demo;

public class OperatorsDemo {
	public static void main(String[] args) {
		int a =10 ;
		int b = 5 ;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		
		
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b);
		
		boolean isSelected = false ;
		
		if(!isSelected) {
			System.out.println("Block");
		}
		
		
//		Relational Operators: > , <,<=,>= , !=,==
//		Logical Operators : && , || 
		
//		Ternary operator
		
		int age = 16 ;
		boolean drivingClassAttended = true ;
		
		String haveLicense = (age > 15 && drivingClassAttended)? "yes" : "no" ;
		
		System.out.println(haveLicense);
	}
}
