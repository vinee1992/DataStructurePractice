package com.StringJoiner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String combined = String.join("   ", "Java", "is", "best");
		System.out.println("combined string: " + combined);
		
		
		
		List<String> typesOfLoan = Arrays.asList("home loan", "personal loan",
		           "car loan", "balance transfer");
		
		
		String l=typesOfLoan.stream()
				.map(String::toUpperCase)
				.collect(Collectors.joining(";"));
		
		System.out.println(l);

	}

}
