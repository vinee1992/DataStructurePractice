package com.ReversStringUsingStack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReversStringUsingStack {



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String  s="vineeet";
		
		Stack<Character> s1= new Stack<>();
		for(char c : s.toCharArray()) {
			s1.push(c);
		}
Arrays.asList(s1);
	
int l=s1.size();
for(int i=0;i<l;i++) {
	System.out.println(s1.pop());
}
	

while(!s1.isEmpty()) {
	System.out.println(s1.pop());
}

	}

}
