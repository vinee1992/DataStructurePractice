package com.DuplicateCharcterFromString;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCharcterFromString {
	
	
	
	static Consumer<String> c=s->{
		
		char[]c=s.toCharArray();
		  Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		  
		  for(Character ch :c) {
			  if(charMap.containsKey(ch)) {
				  charMap.put(ch, charMap.get(ch) + 1);
			  }else {
				  charMap.put(ch, 1);
			  }
			  
		  }
		  
		  Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
	        System.out.printf("List of duplicate characters in String '%s' %n", s);
	        for (Map.Entry<Character, Integer> entry : entrySet) {
	            if (entry.getValue() > 1) {
	                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
	            }
	        }
		  
	} ;
	
	public static void main(String... args) {
		
		c.accept("vvineet");
		
	}
	
	
}
