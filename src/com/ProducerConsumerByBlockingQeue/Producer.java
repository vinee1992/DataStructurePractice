package com.ProducerConsumerByBlockingQeue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	protected BlockingQueue<Object> q;
	public Producer(BlockingQueue<Object> q) {
		// TODO Auto-generated constructor stub
		this.q=q;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			
			try {
				Object justProduced = getResource();
				q.put(justProduced);
				System.out.println("Produced resource - Queue size now = "  + q.size());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block/
				System.out.println("Producer INTERRUPTED");
			}
		}
		
		
	}


	private Object getResource() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Object();
	}

}
