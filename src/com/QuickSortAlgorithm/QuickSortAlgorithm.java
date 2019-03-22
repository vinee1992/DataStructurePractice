package com.QuickSortAlgorithm;

public class QuickSortAlgorithm {

	
    private int input[];
    private int length;
    
    
    public void sort(int[] num) {
    	if(num==null || num.length==0) {
    		return;
    	}
    	this.input=num;
    	length=num.length;
    	 quickSort(0, length - 1);
    	
    }

    
    private void quickSort(int low, int high) {
        int i = low;
        int j = high;

int pivot=input[low+(high-low)/2];


while(i<=j) {
	
	while(input[i] < pivot) {
		
		i++;
	}
    while (input[j] > pivot) {
        j--;
    }
    
    if(i<=j) {
    	swap(i, j);
    	i++;
    	j--;
    }
    if (low < j) {
        quickSort(low, j);
    }

    if (i < high) {
        quickSort(i, high);
    }
    
}

    }
    
    
    
    private void swap(int i, int j) {
    	int temp=input[i];
    	input[i]=input[j];
    	input[j]=temp;
    }
}
