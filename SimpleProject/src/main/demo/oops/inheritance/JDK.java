package main.demo.oops.inheritance;

public class JDK {
	public static void main(String[] args) {
		JDK5 jdk5 = new JDK7();
	}
}


class JDK5 {
	JDK5(){
		System.out.println("JDK5 base class");
	}
}

class JDK6 extends JDK5{
	JDK6(){
		System.out.println("JDK6  class");
	}
}

class JDK7 extends JDK6{
	JDK7(){
		System.out.println("JDK7  class");
	}
}