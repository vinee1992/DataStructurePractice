package com.SortByValuesInMap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByValuesInMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Map<String, Integer> budget = new HashMap<>();
		    budget.put("clothes", 120);
		    budget.put("grocery", 150);
		    budget.put("transportation", 100);
		    budget.put("utility", 130);
		    budget.put("rent", 1150);
		    budget.put("miscellneous", 90);
		    
		    
		    
		 Map b=   budget.entrySet()
		    .stream()
		    .sorted(Map.Entry.comparingByKey())
		    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		 
		 
		 System.out.println(b);

	}

}
