package com.SumOfTwoNumberInArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SolutionWithImprovedComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       prettyPrint(getRandomArray(9), 11);
	       prettyPrint(getRandomArray(10), 12);

	}

	private static void prettyPrint(int[] num, int n) {
		// TODO Auto-generated method stub
		   if(num.length < 2){
	            return;
	        } 
		   
		   Set set = new HashSet(num.length);
		   
		   for(int v : num) {
			   int target = n - v;
	            // if target number is not in set then add
	            if(!set.contains(target)){
	                set.add(v);
	            }else {
	                System.out.printf("(%d, %d) %n", v, target);
	            }
		   }
		
		
		
		
	}

	
	
	
	// random array
	private static int[] getRandomArray(int len) {
		// TODO Auto-generated method stub
		
		int ran[]=new int[len];
		
		for(int i=0;i<len;i++) {
		ran[i]=	(int)( Math.random()*10245);
		}
		System.out.println(Arrays.toString(ran));
		return ran;
	}

}
