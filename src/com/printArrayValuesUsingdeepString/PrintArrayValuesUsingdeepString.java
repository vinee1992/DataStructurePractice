package com.printArrayValuesUsingdeepString;

import java.util.Arrays;

public class PrintArrayValuesUsingdeepString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  int[] intArray = new int[]{1, 2,3,4, 5};
		    String[] strArray = new String[]{"abc", "bcd", "def", "efg"};
		    
		    
		    
	        int[][] twoDimensionArray = new int[][]{
                {1,2,3},
                {10,20,30},
                {100,200,300},
                };
               
            
		    
		    System.out.println(Arrays.toString(twoDimensionArray));
		    System.out.println(Arrays.deepToString(twoDimensionArray));
		    
	}

}
