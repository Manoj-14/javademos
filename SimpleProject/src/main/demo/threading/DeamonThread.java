package main.demo.threading;

public class DeamonThread {
	public static void main(String[] args) {
		Utils.printMsg(Thread.currentThread().isDaemon()+"");
		Thread dw = new Thread(new DeamonWorker());
		dw.setDaemon(true);
		Utils.printMsg(dw.isDaemon()+"");
		dw.start();
		try {
			dw.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class DeamonWorker implements Runnable{

	@Override
	public void run() {		
		for(int i=1 ;i <=10 ;i++) {
			Utils.printMsg(""+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
