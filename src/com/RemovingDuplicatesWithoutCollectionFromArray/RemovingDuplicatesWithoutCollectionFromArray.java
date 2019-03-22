package com.RemovingDuplicatesWithoutCollectionFromArray;

import java.util.Arrays;

public class RemovingDuplicatesWithoutCollectionFromArray {

	
	
	public static void main(String[] args) {
		
		
        int[][] test = new int[][]{
            {1, 1, 2, 2, 3, 4, 5},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 2, 3, 4, 5, 6, 7},
            {1, 2, 1, 1, 1, 1, 1},};
            
            
            
            for (int[] input : test) {
                System.out.println("Array with Duplicates       : " + Arrays.toString(input));
                System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(input)));
            }


    



	}
	
	
	
	public static int[] removeDuplicates(int[] numWithDupli) {
		
		
		//sorting array to bring duplicate together
		
		
		Arrays.sort(numWithDupli);
		
		
		int[] re=new int[numWithDupli.length];
		int prev=numWithDupli[0];
		re[0]=prev;
		
		for(int i=0;i<numWithDupli.length;i++) {
			int ch=numWithDupli[i];
			if(prev!=ch)
				re[i]=ch;
			
			prev=ch;
		}
		 return re;
	}
}
