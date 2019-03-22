package com.linkedListImplementation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinkedListJunit {

	@Test
	public void testNewLinkedList() {
		SinglyLinkedList sl= new SinglyLinkedList();
		
		assertTrue(sl.isEmpty());
		assertEquals(0, sl.length());
		
		sl.append("vineet");
		sl.append("vineet+harry");
		assertEquals(2, sl.length());
		
		assertFalse(sl.isEmpty());
	}
	
	
}
