package com.Numbers;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		int n,fact=1;
		n=6;
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();*/
		
		for (int i=1; i<n; i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+n+"is"+fact);
	}
}
