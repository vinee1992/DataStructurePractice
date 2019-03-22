package com.SquareRootOfNumber;

public class SquareRootOfNumber {

	
	
	public static float root(int nu) {
		float root=0.0f;
		 float precision = 0.1f;
		float sqr=root;
		while(sqr<nu) 
		{
root=			root+precision;
			sqr=root*root;
		}
		return root;
		
	}
	
	public static void main(String[] args) {

		
		float i=root(10);
		System.out.println(i);

	}

}
