package com.Numbers;

import java.util.Scanner;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		String a,b,c;
		StringBuffer sb;
		a="malayalam";
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Entered a string");
		a=sc.nextLine();*/
		
		sb=new StringBuffer(a);
		b=sb.reverse().toString();
		
		if (a.equals(b)) {
			System.out.println("It is palidrome");
		} else {
			System.out.println("It is not palindrome");
		}
	}

}
