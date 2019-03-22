package com.FirstNonRepeatingCharcterFromString;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatingCharcterFromString {

	
	
	public static void main(String[] args) {
		
		chckNonRepaetingElemnt("swiss");
		
	
		
	}
	
	public static void chckNonRepaetingElemnt(String s) {
		
		
		
		
		Optional<Entry<String, Long>> m=	Stream.of(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
			.stream()
			.filter(p->p.getValue()==1)	
			.findFirst();
		
		System.out.println(m);
	}
	
	
	
}
