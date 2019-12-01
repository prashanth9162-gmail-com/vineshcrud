package com.basics;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		//int n=211;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		int sum=0;
		int m=n;
		
		while (n>0) {
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if (m==sum) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}
	
}
