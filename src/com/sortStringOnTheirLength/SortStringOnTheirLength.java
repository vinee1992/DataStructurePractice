package com.sortStringOnTheirLength;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringOnTheirLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] sort= new String[] {"vineet","amy","java"};
		List SortedList=Arrays.asList(sort).stream().sorted((p1,p2)->p2.length()-p1.length()).collect(Collectors.toList());
		System.out.println(SortedList);
		

	}

}
