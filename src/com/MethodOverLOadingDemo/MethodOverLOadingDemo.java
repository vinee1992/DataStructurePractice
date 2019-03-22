package com.MethodOverLOadingDemo;



class A{}

class B extends A{}
 
class C extends B{}
class D extends B{}


public class MethodOverLOadingDemo {

	
	/* public void test(String str) {
		   System.out.println("String");
		 }
	 
	 public void test(StringBuffer obj) {
		  System.out.println("Object");
		 }
		 
		 */
	
	/* public void test(A obj) {
		  System.out.println("B");
		 }
	 
	 public void test(C obj) {
		  System.out.println("C");
		 }*/
	
	
/*	 public void test(long lng) {
	        System.out.println("Long");
	    }
	      
	 
	   public void test(Integer integer) {
	        System.out.println("Integer");
	    }*/
	
	
    public void test(byte obj) {
        System.out.println("Char");
    }
    public void test(short obj) {
        System.out.println("Int");
    } 
	      
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLOadingDemo m= new MethodOverLOadingDemo();
		m.test(9);

	}

}
