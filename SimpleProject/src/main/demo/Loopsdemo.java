package main.demo;

public class Loopsdemo {
	public static void main(String[] args) {
//		for(int i=0 ; i< 4 ; i++) System.out.println("Hello World");
//		
//		
//		for(int i = 1 ; i<11 ; i++) {
//			if(i%2==0) System.out.println(i);
//		}
//		
//		for(int i = 0 ; i<11 ; i+=2) {
//			System.out.println(i);
//		}
		
//		int sum = 0 ;
//		for(int i =1 ; i<10 ; i+=2) sum+=i ;
//		System.out.println(sum);
		
//		for (int i = 10 ; i>0 ; i--) System.out.println(i);
		
		int i =0 ;
		while (i<6) {
			System.out.println(i);
			i++;
		};
		
		
		char op = 'y';
		
		switch(op) {
		case 'a' : 
			System.out.println("Option A");
			break;
		case 'b' : 
			System.out.println("Option B");
			break;
		case 'c' : 
			System.out.println("Option C");
			break;
		default:
			System.out.println("Invalid");
			
		}
	}
}
