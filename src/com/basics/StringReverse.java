package com.basics;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String s1 = "madam";
		for (int i=s1.length()-1; i>=0; i--) {
			s1.charAt(i);
		}
		
		System.out.println("The reverse string is :"+s1);
	}

	
}
