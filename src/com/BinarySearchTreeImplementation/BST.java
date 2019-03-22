package com.BinarySearchTreeImplementation;

import java.util.Stack;

public class BST {

	
	private static class Node{
	
		
		private int data;
		private Node left,right;
		
		public Node(int value) {
			data=value;
			left=right=null;
		}
	}
	
	
	private Node root;
	
	public BST() {
		root=null;
	}
	
	public Node getRoot() {
		return root;
	}
	
	/** * 
	 * Java function to check if binary tree is empty or not * Time Complexity of this solution is constant O(1)
	 *  for * best, average and worst case.
	 *  * * @return true if binary search tree is empty */

	public boolean isEmpty() {
		return null ==root;
	}
	
	
	
	public int sizeOfTree() {
		Node current=root;
		int size=0;
		Stack<Node> s=new Stack<Node>();
		while(!s.isEmpty() || current!=null) {
			if(current!=null) {
				s.push(current);
				current=current.left;
			}else {
				size++;
			    current = s.pop();
                current = current.right;
			}
			
			
			
		}
		return size;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
