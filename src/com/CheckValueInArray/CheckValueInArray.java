package com.CheckValueInArray;

import java.util.Arrays;

public class CheckValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] input = new Integer[]{1, 2, 3, 4, 5};
		System.out.printf("Does array %s has %s?  %b %n", Arrays.toString(input), 5, isExist(input, 8));
		System.out.printf("Does array %s contains %s?  %b %n", Arrays.toString(input), 5, contains(input, 5));
		
		 String[] names = new String[]{"JP", "KP", "RP", "OP", "SP"};
		 System.out.printf("Does String array %s contains %s?  %b %n", Arrays.toString(names), "JP", contains(names, "JP"));

	}



	private static <T> boolean contains(final T[] input, final T i) {
		// TODO Auto-generated method stub
		
		for(T t : input) {
			if(t==i || t.equals(i)) {
				return true;
			}
		}
		return false;
	}



	public static  <T> boolean isExist(final T[] arr,final T v) {
		return Arrays.asList(arr).contains(v);
	}


}
