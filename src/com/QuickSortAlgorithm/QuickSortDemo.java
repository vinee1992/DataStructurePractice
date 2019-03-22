package com.QuickSortAlgorithm;

import java.util.Arrays;

public class QuickSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsorted = {6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println("Unsorted array :" + Arrays.toString(unsorted));

        QuickSortAlgorithm algorithm = new QuickSortAlgorithm();
        algorithm.sort(unsorted);
        
        System.out.println("Sorted array :" + Arrays.toString(unsorted));
        
        
	}

}
