package com.ProducerConsumerByBlockingQeue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	protected BlockingQueue<Object> q;
	public Consumer(BlockingQueue<Object> q) {
		this.q=q;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Object o=q.take();
				System.out.println("Consumed resource - Queue size now = "  + q.size());
				take(o);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	private void take(Object o) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Consumer Read INTERRUPTED");
		}
		System.out.println("Consuming object " + o);
		
	}
}
