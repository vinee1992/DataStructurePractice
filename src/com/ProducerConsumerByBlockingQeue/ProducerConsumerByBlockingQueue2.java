package com.ProducerConsumerByBlockingQeue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerByBlockingQueue2 {
 
	static BlockingQueue queue = new LinkedBlockingQueue(50);
	public static void main(String[] args) {
	    Producer producer = new Producer();
	    Consumer consumer = new Consumer();
	    producer.start();
	    consumer.start();	
	}
	
	
	static class Producer extends Thread{
		Random random= new Random();
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				//
				try {
					queue.put(random.nextInt(500));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	static class Consumer extends Thread{
		public void run() {
		      while (true) {
		        try {
		          System.out.println("Consumed " + queue.take());
		        } catch (InterruptedException e) {
		          e.printStackTrace();
		        }
		      }
		}
	}
}
