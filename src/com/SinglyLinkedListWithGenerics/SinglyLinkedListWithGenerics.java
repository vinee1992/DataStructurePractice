package com.SinglyLinkedListWithGenerics;

public class SinglyLinkedListWithGenerics {
	
	
	
	private Node head;
	
	public boolean isEmpty() {
		return length()==0;
	}
	
	public <T> void insert(T v) {
		if(head==null) {
			head=new Node(v);
			return;
		}
		
		tail().next=new Node<T>(v);
		
		
		
	}
	
	private Node tail() {
		Node tail=head;
		while(tail.next!=null) {
			tail=tail.next;
		}
		return tail;
	}
	
	

	private int length() {
		int len=0;
		Node curr=head;
		while(curr!=null) {
			len++;
			curr=curr.next;
		}
		return len;
	}


@Override
public String toString() {
StringBuilder sb= new StringBuilder();

Node curr=head;
while(curr!=null) {
	sb.append(curr).append("-->");
	curr=curr.next;
}
	return sb.toString();
}









































	private static class Node<T>{
		private Node next;
		private T data;
		
		public Node(T data) {
			this.data=data;
		}
		
		



		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return data.toString();
		}
	}

}
