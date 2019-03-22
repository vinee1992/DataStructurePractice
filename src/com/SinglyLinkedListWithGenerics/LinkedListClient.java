package com.SinglyLinkedListWithGenerics;

public class LinkedListClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SinglyLinkedListWithGenerics l=new SinglyLinkedListWithGenerics();
		l.insert("java");
		l.insert("Angular");
		l.insert("Andropid");
		l.insert(2);
		
	
		System.out.println("Singly linked list contains : " + l); 
	//	System.out.println("length of linked list : " + l.length()); 
		System.out.println("is this linked list empty : " + l.isEmpty());

		
		
	}

}
