package com.MethodOverridingDemo;

class Parent1{ 
	 public  int var = 10;
	  
	 public  static void print(){ 
	  int var = 20;
	    
	  System.out.println("I am Parent 1:"+var);
	  System.out.println("I am Parent 2:"+var);
	 }
	}
	 
class Child1 extends Parent1{ 
	 public static int var = 30;
	  
	 public static void print(){ 
	  int var = 40;
	    
	  System.out.println("I am Child 1:"+var);
	  System.out.println("I am Child 2:"+var);
	  System.out.println("I am Child 3:"+var);
	 } 
	}


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  Parent1 p = new Parent1();
		  System.out.println(p.var);
		  p.print();*/
		  
	/*	  Child1 c = new Child1();
		  System.out.println(c.var); //30
		  c.print(); // 40,30,10
		  System.out.println("---------------");*/
		  
		  Parent1 pc = new Child1(); //(OR p = c)
		  System.out.println(pc.var); //10
		  pc.print(); //30,40,30,10
		  System.out.println("---------------");
		  
		
	}

}
