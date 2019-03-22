package com.BinaryToDecimal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryToDecimalJunit {
	
	@Test
	public void bToD() {
		BinaryToDecimal bd= new BinaryToDecimal();
		assertEquals(547, bd.fbinToDec.apply(1000100011).intValue());
		
		
	}

}
