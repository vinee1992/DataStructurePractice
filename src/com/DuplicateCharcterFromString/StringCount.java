package com.DuplicateCharcterFromString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="vineeeeeet";




		/**
		 * Total Word Count
		 */
		Long i=Stream.of(s.split("")).collect(Collectors.counting());
		System.out.println(i);


		/**
		 * Each word count
		 */
		Map m=	Stream.of(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(m);


		/**
		 * find duplivates elemnt count of key---vale
		 */

		Map<Object, Object> l=Stream.of(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(p->p.getValue()>1)
				/*.map(p->p.getKey())*/
				.collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));	
		System.out.println(l);





		/**
		 * find duplivates elemnt count of only key---vale
		 */


		List l1=Stream.of(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(p->p.getValue()>1)
				.map(p->p.getKey())
				.collect(Collectors.toList());	
		System.out.println(l1);

		
		

		
		


	}





}
