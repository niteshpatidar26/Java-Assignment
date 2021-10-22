package blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);
		Thread producerThread1 = new Thread(new Producer(queue),"Producer-1");
		producerThread1.start();
		
		Thread consumerThread1 = new Thread(new Consumer(queue),"Consumer-1");
		consumerThread1.start();

		Thread producerThread2 = new Thread(new Producer(queue),"Producer-2");
		producerThread2.start();
		
		Thread consumerThread2 = new Thread(new Consumer(queue),"Consumer-2");
		consumerThread2.start();
	}

}
