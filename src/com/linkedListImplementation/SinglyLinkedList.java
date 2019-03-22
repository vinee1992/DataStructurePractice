package com.linkedListImplementation;

public class SinglyLinkedList {
	
	
	private  static class Node {

		private  Node next;
		private  String data;
		
		
		public Node(String data) {
			this.data=data;
		}
		
	    @Override
	    public String toString() {
	        return this.data;
	    }
		
	}


	
	
	//head is the first element of list
	
	private Node head;
	
	public boolean isEmpty() {
		
		return length()==0;
	}

	
	public void append(String d) {
		if(head==null) {
			head=new Node(d);
			return;
		}
		tail().next=new Node(d);
	
	}
	
	private Node tail() {
		Node tail=head;
		
		while(tail.next!=null) {
			tail=tail.next;
		}
		return tail;
	}
	
	
	public int length() {
		// TODO Auto-generated method stub
		
		int len=0;
		Node curr=head;
		
		while(curr!=null) {
			len++;
		curr=	curr.next;
			
		}
		return len;
	}
}
