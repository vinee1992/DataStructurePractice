package com.LargestAndSmalletstFromArray;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

public class LargestAndSmalletstFromArray {

	
	static Function<Integer[],Integer> fmax =i->{
		
		if(i==null ||i.length==0)
			throw new IllegalArgumentException("Invalid output"+Arrays.toString(i));
		
		int max=i[0];
		for(int j=1;j<i.length;j++) {
			if(i[j]>max)
				max=i[j];
		}
		
		return max;
		
	};
	
	
	static Consumer<Integer[]> fmin=i->{
		if(i==null ||i.length==0)
			throw new IllegalArgumentException("Invalid output"+Arrays.toString(i));
		int min=i[0];
		for(int j=1;j<i.length;j++) {
			if(i[j]<min)
				min=i[j];
		};
		
		System.out.println("max value from array is ==" + min);
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		

	}

}
