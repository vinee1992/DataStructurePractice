package com.CountNoOfLeafsInBianryTree;

import java.util.Stack;

public class BinaryTree {

	

	
	
	static class TreeNode{
		
		String value;
		TreeNode left,right;
		
		public TreeNode(String value) {
			// TODO Auto-generated constructor stub
			this.value=value;
			left=right=null;
			
		}
		
		
		boolean 	isLeaf() {
			return left==null
					?right==null:false;
		}
		
	}
		
		 // root of binary tree
		  TreeNode root;
		  
		  
		  /** * Java method to calculate number of leaf node in binary tree. * * @param node * @return count of leaf nodes. */

		 //javarevisited.blogspot.com/2016/12/how-to-count-number-of-leaf-nodes-in-java-recursive-iterative-algorithm.html#ixzz5W9XtrnE4
		  
		  
		  
		  public int countLeafNodesRecursively() {
			    return countLeaves(root);
			  }


		private int countLeaves(TreeNode node) {
			// TODO Auto-generated method stub
			
			if(node==null)
				return 0;
			if(node.isLeaf()) {
				return 1;
			}else {
				return countLeaves(node.left)+countLeaves(node.right);
			}
				
			

				
		}
		
		
		/** * Java method to count leaf nodes using iteration * * @param root * @return number of leaf nodes * */

		//javarevisited.blogspot.com/2016/12/how-to-count-number-of-leaf-nodes-in-java-recursive-iterative-algorithm.html#ixzz5W9Z9q9wH
		
	public 	int countLeafOfNode() {
			
			if(root==null)
				return 0;
			
			Stack<TreeNode> s=new Stack<>();
			
			s.push(root);
			int cout=0;
			while(!s.isEmpty()) {
				TreeNode node1 =s.pop();
				if(node1.left!=null)
					s.push(node1.left);
				if(node1.right!=null)
					s.push(node1.right);
				if(node1.isLeaf())
					cout++;
				
				
				
				
				
			}
			return cout;
			
			
			
		}



	
	
}
