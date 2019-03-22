package com.LargerstAndSmallestFromArray;

import java.util.Arrays;

public class LargerstAndSmallestFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		largestAndSmallest(new int[]{-20, 34, 21, -87, 92,
				Integer.MAX_VALUE});
		
		largestAndSmallest(new int[]{10, Integer.MIN_VALUE, -2});
		
        largestAndSmallest(new int[]{Integer.MAX_VALUE, 40,
                Integer.MAX_VALUE});
largestAndSmallest(new int[]{1, -1, 0});*/

		
        largestAndSmallest(new int[]{1,2,3,4,5,6,7,8,9, 40,41,33,44,90,66});
		
	}

	
	public static void largestAndSmallest(int [] num) {
		
		int largest=Integer.MIN_VALUE;
		int smallest =Integer.MAX_VALUE;
		
		for(int n :num) {
			if(n>largest)
				largest=n;
			else if (n < smallest) 
				smallest=n;
		}
		
        System.out.println("Given integer array : " + Arrays.toString(num));
        System.out.println("Largest number in array is : " + largest);
        System.out.println("Smallest number in array is : " + smallest);
	}
}
