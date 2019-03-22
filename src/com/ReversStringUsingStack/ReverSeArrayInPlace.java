package com.ReversStringUsingStack;



import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

import org.junit.Test;

public class ReverSeArrayInPlace {
	
	  static Integer[] numbers = {1, 2, 3, 4, 5, 6, 7,7,9,0,4};
	
    static Consumer<Integer[]>   f= i->{
    	if(i==null || i.length<=1) {
    		
    	}
    		
    	for(int j=0;j<i.length/2;j++) {
    		int t=i[j];
    		i[j]=i[i.length-1-j];
    		i[i.length-1-j]=t;
    		
    	}
    	
        System.out.println("reversed array : " + Arrays.toString(i));
  
    	
    	
    	
    };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      f.accept(numbers);
        //reverse(numbers);
    	

        
     
		
		
        
        
	}


	

}
