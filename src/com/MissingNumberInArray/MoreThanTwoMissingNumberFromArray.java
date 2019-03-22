package com.MissingNumberInArray;

import java.util.Arrays;
import java.util.BitSet;

public class MoreThanTwoMissingNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        // one missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);
 
        // two missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}, 10);
 
        // three missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);
 
        // four missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 9, 8}, 10);
		
	}
	
	
	public static void printMissingNumber(int[] num,int count) {
		
		int misngCount=num.length-count;
		BitSet b=new BitSet(count);
		
		for(int n : num) {
			
			b.set(n-1);
			
			System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
			        Arrays.toString(num), count);
			
			
			int lstMissingIndex=0;
			
			 for (int i = 0; i < misngCount; i++) {
				 lstMissingIndex = b.nextClearBit(lstMissingIndex);
		            System.out.println(++lstMissingIndex);
		        }
		}
		
	}

}
