package main.demo.threading;

public class RunnableDemo {
	public static void main(String[] args) {
		Utils.printMsg("Begin Main Thread ...");
		ImageProcessor ip = new ImageProcessor();
		Thread t1 = new Thread(ip);
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Utils.printMsg("Anonymus Runnable class");
				
			}
		});
		
		t2.start();
		Utils.printMsg("End Main Thread ...");
	}
}

class ImageProcessor implements Runnable{

	@Override
	public void run() {
		Utils.printMsg("Processing an Image");
		
	}
	
}