package com.Base64Encodingcom.CountingVowelsFromString;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingVowelsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="vineet";
		
		Map<String, Long> l=Stream.of(s.split("")).filter(p->p.equalsIgnoreCase("a") || p.equalsIgnoreCase("e") || p.equalsIgnoreCase("i") || p.equalsIgnoreCase("o") || p.equalsIgnoreCase("u"))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(l);
	}

}
