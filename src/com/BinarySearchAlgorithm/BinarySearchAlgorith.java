package com.BinarySearchAlgorithm;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BinarySearchAlgorith {
	
	
	static BiConsumer<Integer[],Integer> c= (arr,n)->{
		
		int frst=0;
		int lst=arr.length-1;
		int midle=(frst+lst)/2;
		
		
		while(frst<=lst) {
			
			if(arr[midle]<n)
				frst=midle+1;
			else if(arr[midle]==n) {
				System.out.printf(n + " found at location %d %n", midle);
			break;	
			}else {
				lst=midle-1;
			}
			
			midle=(frst+lst)/2;
		}
		
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Integer[] list = new Integer[] {23,43,45,67,1};
		 
		 Arrays.sort(list);
		
		c.accept(list, 45);

	}

}
