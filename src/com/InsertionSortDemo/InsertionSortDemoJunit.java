package com.InsertionSortDemo;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class InsertionSortDemoJunit {
	
	
	@Test
	public void insertionsortDemo() {
		
		InsertionSortDemo i= new InsertionSortDemo();
		
		Integer[] in=new Integer[] {4,6,5,9,7};
		
		Integer[] ex=new Integer[] {4,5,6,7,9};
		
		//assertArrayEquals(ex,i.fSort.accept(in));
		assertArrayEquals(ex, i.fSort.apply(in));
		
		
		
	}

}
