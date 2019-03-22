package com.ReversStringUsingStack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StackImplementationJunit {

	@Test
	public void size() {
		StackImplementationInterf<Integer> s=new StackImplementationImpl<>();
		assertTrue(s.size()==0);
		
		s.push(1);
		s.push(2);
		assertEquals(2, s.size());
		
	}
	
	@Test
	public void isEmpty() {
		
		StackImplementationInterf<Integer> s=new StackImplementationImpl<>();
		
		assertTrue(s.isEmpty());
		
		s.push(1);
		assertFalse(s.isEmpty());
		
		s.pop();
		assertEquals(0, s.size());
		
		s.push(10);
		s.push(20);
		
		assertEquals(true, s.contains(10));
		
		
	}
}
