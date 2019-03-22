package com.HighestOccurenceOfCharacterFromString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HighestOccurenceOfCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="assssssssddddddddsssssssaaaaa";
		
		
	//Arrays.asList(s).stream()
		
		List<Long> l=Stream.of(s.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.map(p->p.getValue())
		.filter(s->s.MAX_VALUE).collect(Collectors.toList());
		
		System.out.println(l);
		//.map(p->p.getValue()).max((s1,s2)->s1-s2).get();
	}

}
