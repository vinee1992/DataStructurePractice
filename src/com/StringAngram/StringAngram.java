package com.StringAngram;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class StringAngram {

	public static void main(String[] args) {

		
		
		// TODO Auto-generated method stub

		BiPredicate<String, String> p=(s1,s2)->{
			
			
			s2.toCharArray();
			 Arrays.sort(s1.toCharArray());
		        Arrays.sort(s2.toCharArray());
			return Arrays.equals(s1.toCharArray(), s2.toCharArray());
			
		};
		
		
	boolean b=	p.test("word", "wdor");
	
	System.out.println(b);
	
	boolean b1=chekAnargm("eetn", "ntee");
	System.out.println(b1);
		
	}

	
	public static boolean chekAnargm(String s1,String s2) {
		 char[] characters = s1.toCharArray();
		 StringBuilder sbSecond = new StringBuilder(s2);
		 
		 for(char c : characters) {
			 int in=sbSecond.indexOf(""+c);
			 
			 if(in != -1){
	                sbSecond.deleteCharAt(in);
	            }else{
	                return false;
	            }
		 }
		 return sbSecond.length()==0 ? true : false;
		
	}
	
}
