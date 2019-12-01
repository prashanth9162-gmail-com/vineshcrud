package com.Numbers;

import java.util.Scanner;

public class FactorialOfNumber {
	
	public static void main(String[] args) {
		 int n;
		 int cn;
		 int fact;
		  
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number");
		 n = sc.nextInt();
		 
		 System.out.println("\n Factorial of numbers between 1 to "+n+" :");
		 for(int i=1; i<=n;i++) {
			 cn = i;
			 fact = 1;
			 for(int j=1;j<=cn;j++) {
				 fact = fact*j;
			 }
			 System.out.printf("%5d :%d\n",cn,fact);
		 }
	}

}
