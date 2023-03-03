package main.demo.threading;

public class ThreadCommunicationDemo {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread t = new Thread(myThread);
		t.setName("T1");
		t.start();
		synchronized (t) {
			Utils.printMsg("Going to Wait");
			try {
				t.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Utils.printMsg("Notified");
			Utils.printMsg("Sum is :"+myThread.getTotal());
		}
	}
}

class MyThread implements Runnable{
	int total = 0;
	@Override
	public void run() {
		Utils.printMsg("calculating Sum");
		synchronized (this) {
			for(int i=0 ; i<=100 ; i++) total+=i;
			Utils.printMsg("Calculation completed.. Notifying....");
			this.notify();
		}
	}
	public int getTotal() {
		return this.total;
	}
	
}
