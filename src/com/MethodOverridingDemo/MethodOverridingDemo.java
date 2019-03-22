package com.MethodOverridingDemo;


class Parent{ 
	 public static void print(){ 
	  System.out.println("I am Parent"); 
	 } 
	}

class Child extends Parent{ 
	 public static void print(){ 
	  System.out.println("I am Child"); 
	 } 
	}

public class MethodOverridingDemo {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Parent parent = new Parent(); 
		  parent.print();
		  
		  parent = new Child(); 
		  parent.print(); 
		   
		  
		  Child child = new Child(); 
		  child.print();
		
	}

}
