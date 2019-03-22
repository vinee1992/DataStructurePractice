package com.TopTwoNumberFromArray;

import java.util.Arrays;

public class TopTwoNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        topTwo(new int[]{20, 34, 21, 87, 92, Integer.MAX_VALUE});
        topTwo(new int[]{0, Integer.MIN_VALUE, -2});
        topTwo(new int[]{Integer.MAX_VALUE, 0, Integer.MAX_VALUE});
        topTwo(new int[]{1, 1, 0});
	}
	
	public static void topTwo(int[] num) {
		
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		
		for(int i:num) {
			if(i>max1) {
			max2=max1;
			max1=i;	
			}else if(i>max2){
				max2=i;
			}

	      	
		}
		  System.out.println("Given integer array : " + Arrays.toString(num));
	        System.out.println("First maximum number is : " + max1);
	        System.out.println("Second maximum number is : " + max2);
	}

}
