package com.SumOfTwoNumberInArray;

public class SumOfTwoNumberInArray {


	public static void printPairs(int[] arr,int sum)
	{

		for(int i=0;i<arr.length;i++) 


		{
			int first = arr[i];
			for(int j=0;j<arr.length;j++) 

			{
				int second=arr[j];
				
				   if ((first + second) == sum) {
	                    System.out.printf("(%d, %d) %n", first, second);
	                }

			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
        
        printPairs(numbers,7);
       printPairs(numbersWithDuplicates,7);
        
        

	}

}
