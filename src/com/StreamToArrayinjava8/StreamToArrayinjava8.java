package com.StreamToArrayinjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToArrayinjava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stream<String> c=Stream.of("INR", "USD", "GBP", "EUR", "JPY");
		
		//c.toArray();
		System.out.println(Arrays.toString(c.toArray()));
		
		  // via - Stream.toArray() and lambda expression
		
		  Integer[] primes = {2, 3, 5, 7, 11};
		  
		  List<Integer> l=Arrays.asList(primes);
		  l.stream()
		  .toArray(Integer[]::new);
		  
		  System.out.println(l);
		  
		  // via arraylist 
		  
	/*	  List list=l.stream()
		  .collect(Collectors.toCollection(()->new ArrayList<>()));
		  System.out.println(list);
		  */
		  //Method refernce
		  
		  
		  List list=l.stream()
				  .collect(Collectors.toCollection(ArrayList::new));
				  System.out.println(list);
				  
		  
		  
		  

	}

}
