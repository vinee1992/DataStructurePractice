package com.ReversStringUsingStack;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayReversalDemoTestClasses {

	@Test
	public void testReverseWithEvenLengthOfArray() {
		
        Integer[] numbers = {1, 2, 3, 4, 5, 6};
        ReverSeArrayInPlace.f.accept(numbers);
        assertArrayEquals(new Integer[]{6, 5, 4, 3, 2, 1}, numbers);
        
        
        
		
	
		
	}
	
	   @Test
	    public void testReverseWithOddLengthOfArray(){
		   Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};
	        ReverSeArrayInPlace.f.accept(numbers);
	        assertArrayEquals(new Integer[]{7, 6, 5, 4, 3, 2, 1}, numbers);
	    }
}
