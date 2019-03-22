package com.LargestAndSmalletstFromArray;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LargestAndSmalletsJunit {
	
	//normalT est cases

	@Test
	public void maxNumber() {
		LargestAndSmalletstFromArray l= new LargestAndSmalletstFromArray();
		
		Integer[] test= new Integer[] {4,5,6,8,9,90};
	
		
		assertTrue(l.fmax.apply(test)==90);
		assertEquals(90, l.fmax.apply(test).intValue());
		
		//testing for empty array
		
		
		/*Integer[] empty= {};
		assertEquals(new IllegalArgumentException("Invalid output"+Arrays.toString(empty)), l.fmax.apply(empty));*/
		
		
		//testing negative scenarios
		
		   Integer[] negative = { 1, -1, 2, -3 };
		   
		   assertEquals(2, l.fmax.apply(negative).intValue());
		
		
		
	}
	
}
