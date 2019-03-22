package com.SumOfTwoNumberInArray;

import java.util.HashSet;
import java.util.Set;

public class SolutionWithImprovedComplexity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {2,3,1,4,6,-1,8,9,6};
		int s=5;
		
		printPair(num, s);

	}
	
	
	public static void printPair(int num[],int sum) {
        if(num.length < 2){
            return;
        }  
		Set s= new HashSet(num.length);
		for(int v :num) {
			
			int targ=sum-v;
			
			
			
			
			if(!s.contains(targ)) {
				s.add(v);
			}else {
				System.out.println("value="+v+":"+"target="+targ);
			}
			

		}
		
		
	}

}
