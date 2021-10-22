package blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private BlockingQueue<Integer> queue;
	
	
	
	public Producer(BlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		int i=1;
		while(true) {
			try {
				queue.put(i);
				System.out.println(Thread.currentThread().getName()+" added : "+i);
				Thread.sleep(1000);
				i++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}