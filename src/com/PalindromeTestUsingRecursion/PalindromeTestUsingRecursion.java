package com.PalindromeTestUsingRecursion;

public class PalindromeTestUsingRecursion {

public static String reverse(String s) {
	
	if(s==null || s.isEmpty())
		return s;
	
	return s.charAt(s.length()-1)+reverse(s.substring(0, s.length()-1));
	
	
}


public static boolean isPallindrome(String txt) {
	String reve=reverse(txt);
	if(txt.equals(reve))
		return true;
	return false;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("Is aaa palindrom?: " + isPallindrome("vineetchaurasia"));
		
	}

}
