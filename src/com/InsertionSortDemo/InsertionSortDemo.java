package com.InsertionSortDemo;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;


public class InsertionSortDemo {
	
	static Function<Integer[],Integer[]> fSort= un->{
		
		for(int i=0;i<un.length;i++) {
			int current=un[i];
			int j=i;
			while(j>0 && un[j-1]>current) {
				
				un[j]=un[j-1];
				j--;
				un[j]=current;
				
		
			}
			
			
		}
		
		return un;
		
	};
	
	
	public static void main(String...args) {
		
		Integer[] i=new Integer[] {8,4,1,2,6,7};
		
	
		fSort.apply(i);
		
	}

}
