package com.ProducerConsumerByBlockingQeue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerByBlockingQeue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int numProducers=4;
		int numConsumers=3;
		
		BlockingQueue<Object> bq= new LinkedBlockingQueue<>(20);
		   for (int i = 0; i < numProducers; i++){
	            new Thread(new Producer(bq)).start();
	        }
		   
	        for (int i = 0; i < numConsumers; i++){
	            new Thread(new Consumer(bq)).start();
	            
	        }
	        Thread.sleep(10 * 1000);
	        System.exit(0);
	}

}
