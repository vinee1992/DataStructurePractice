package com.MissingNumberInArray;

import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int m=getMissingNumber(new int[] {1,2,3,4,6,7,8}, 8);
		System.out.println("Missing number is=="+m);

	}
	
	
	private static int getMissingNumber(int num[],int n) {
		
		
	int expectedSum=	(n*(n+1)/2);
	int actualSum=0;
	for(int i: num) {
		
		actualSum+=i;
	}
		
		return expectedSum-actualSum;
	}

}
