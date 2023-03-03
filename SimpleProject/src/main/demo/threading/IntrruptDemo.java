package main.demo.threading;

public class IntrruptDemo {
	public static void main(String[] args) {
		Utils.printMsg("Start");
		Thread t = new Thread(new Worker());
		t.start();
		
		try {
			Thread.sleep(2000);
			t.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Utils.printMsg("End");
	}
}

class Worker implements Runnable{

	@Override
	public void run() {
		Utils.printMsg("Start");
		for(int i=1 ; i<=10 ; i++) {
			Utils.printMsg(""+i);	
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("Thread Intrrupted");
			}
		}
		
		Utils.printMsg("End");
		
	}
	
}