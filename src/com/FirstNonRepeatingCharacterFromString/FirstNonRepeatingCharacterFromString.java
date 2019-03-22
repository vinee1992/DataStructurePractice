package com.FirstNonRepeatingCharacterFromString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;

public class FirstNonRepeatingCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    /*
	     * Using LinkedHashMap to find first non repeated character of String
	     * Algorithm :
	     *            Step 1: get character array and loop through it to build a 
	     *                    hash table with char and their count.
	     *            Step 2: loop through LinkedHashMap to find an entry with 
	     *                    value 1, that's your first non-repeated character,
	     *                    as LinkedHashMap maintains insertion order.
	     */
		
		
		
		Function<String,Character> f=s->{

			Map<Character,Integer> m = new LinkedHashMap<>();
			for(char c: s.toCharArray()) {
				m.put(c, m.containsKey(c)?m.get(c)+1:1);
			}
			for(Entry<Character,Integer> entry : m.entrySet()) {
				
				if(entry.getValue()==1)
					return entry.getKey();	
			}
			throw new RuntimeException("didn't find any non repeated Character");
			
			
		};
		

	
	System.out.println("first non repeating elemnt sis    "+f.apply("swiss") );
	
	
	char c1=firstNonRepeatingChar("aaja");
	System.out.println(c1);

	}
	
	   public static char firstNonRepeatingChar(String word) {
	        Set<Character> repeating = new HashSet<>();
	        List<Character> nonRepeating = new ArrayList<>();
	        for (int i = 0; i < word.length(); i++) {
	            char letter = word.charAt(i);
	            if (repeating.contains(letter)) {
	                continue;
	            }
	            if (nonRepeating.contains(letter)) {
	                nonRepeating.remove((Character) letter);
	                repeating.add(letter);
	            } else {
	                nonRepeating.add(letter);
	            }
	        }
	        return nonRepeating.get(0);
	    }
	
	
	
	

	


}
