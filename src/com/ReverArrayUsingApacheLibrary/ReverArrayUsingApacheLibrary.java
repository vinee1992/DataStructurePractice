package com.ReverArrayUsingApacheLibrary;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class ReverArrayUsingApacheLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArray = new int[] {101,102,103,104,105};
        String[] sArray = new String[] {"one", "two", "three", "four", "five"};
        System.out.println("Original int array : " + Arrays.toString(iArray));
        
        ArrayUtils.reverse(iArray);
        
        System.out.println("reversed int array : " + Arrays.toString(iArray));
		
	}

}
