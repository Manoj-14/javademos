package main.demo.threading;

public class Utils{
	public static void printMsg(String str) {
		System.out.println(Thread.currentThread()+" -> "+str);
	}
}
