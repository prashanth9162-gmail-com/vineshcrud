package com.basics;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int r = n1+n2;
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(r);
				r = n1+n2;
				n1=n2;
				n2=r;
			}
			System.out.println(" ");
		}
	}

}
