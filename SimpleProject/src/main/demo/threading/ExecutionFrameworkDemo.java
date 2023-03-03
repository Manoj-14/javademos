package main.demo.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutionFrameworkDemo {
	public static void main(String[] args) {
		VideoProcessor videoTasks[] = { new VideoProcessor("Bank"), new VideoProcessor("School"), new VideoProcessor("Conference"),
				new VideoProcessor("Home Security") };
		
		ExecutorService newFixedThredPool = Executors.newFixedThreadPool(4);
		for (VideoProcessor v : videoTasks) {
			newFixedThredPool.submit(v);
		}
		newFixedThredPool.shutdown();
	}
}

class VideoProcessor implements Runnable {

	String sourceName;

	public VideoProcessor(String sourceName) {
		this.sourceName = sourceName;
	}

	@Override
	public void run() {
		Utils.printMsg("Processing video from " + this.sourceName + " started...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utils.printMsg("Processing video from " + this.sourceName + " ended...");
	}

}