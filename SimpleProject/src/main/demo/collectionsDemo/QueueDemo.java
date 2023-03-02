package main.demo.collectionsDemo;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
	
	public static void main(String[] args) {
		priorityQueueDemo();
	}
	
	private static void priorityQueueDemo() {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		System.out.println(queue.peek()); // print first element
		
		Random random = new Random();
		for(int i=0;i<10;i++) queue.offer(random.nextInt(1,10)); // add element at last
		System.out.println(queue);
		System.out.println(queue.poll()); // remove first element
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
	}
	
}
