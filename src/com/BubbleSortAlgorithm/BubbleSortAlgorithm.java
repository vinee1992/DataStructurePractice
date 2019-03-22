package com.BubbleSortAlgorithm;

import java.util.Arrays;

public class BubbleSortAlgorithm {


	public static void main(String...args) {


		
		
		bubbleAlgo(new int[] { 20, 12, 45, 19, 91, 55 });
		bubbleAlgo(new int[] { -1, 0, 1 });
		bubbleAlgo(new int[] { -3, -9, -2, -1 });


	}


	/**
	 * Bubble sort algorithm
	 */


	private static final void bubbleAlgo(int[] num)
	{


		System.out.printf("Unsorted array in Java :%s %n", Arrays.toString(num));

		for(int i=0;i<num.length;i++) {


			for(int j=num.length-1;j>=i;j--) {


				if(num[i]>num[j]) {
					
					
					
					
					swap(num, i, j);
				}
					



			}


		}
		
		System.out.printf("Sorted Array using Bubble sort algorithm :%s %n",
				Arrays.toString(num));







	}
	/**
	 * Utility method to swap two number
	 */
	private static void swap(int [] arr, int frm, int to) {

		int temp=arr[frm];
		arr[frm]=arr[to];
		arr[to]=temp;

	}
}

