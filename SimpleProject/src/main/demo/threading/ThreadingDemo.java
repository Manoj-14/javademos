package main.demo.threading;

public class ThreadingDemo {
	public static void main(String[] args) {
		MultiThread mt = new MultiThread();
		mt.start();
		
		System.out.println("------------");
		
		SingleThread st = new SingleThread();
		st.printNumbers();
		
		
	}
}


class SingleThread{
	void printNumbers() {
		for(int i=1 ; i<=200 ; i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MultiThread extends Thread{
	public void run() {
		for(int i=1 ; i<=200 ; i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}