package main.demo.threading;

public class SynchronizationDemo {
	public static void main(String[] args) {
		
		Monitor m = new Monitor();
		
		Thread t1 = new Thread(new MonitorWorker(m, "Max"));
		t1.setName("T1");
		Thread t2 = new Thread(new MonitorWorker(m, "Tex"));
		t2.setName("T2");
		
		t1.start();
		t2.start();
	}
}

class MonitorWorker implements Runnable{
	Monitor monitor;
	String name;
	
	public MonitorWorker(Monitor monitor ,String str) {
		this.monitor = monitor;
		this.name = str;
	}

	@Override
	public void run() {
		monitor.displayGreeting(name);		
	}
	
}

class Monitor{
	public synchronized void displayGreeting(String str) {
//		synchronized (this) {
			for(int i=1;i<=10;i++) {
				Utils.printMsg(i+": how are you "+str);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
//		}
					
	}
}