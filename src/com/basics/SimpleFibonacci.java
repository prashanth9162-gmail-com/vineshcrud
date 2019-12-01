package com.basics;

public class SimpleFibonacci {
	
	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int result;
		int num=11;
		
		for (int i = 1; i<=(num-2); i++) {
			result=n1+n2;
			n1=n2;
			n2=result;
			System.out.println(""+result);
			
		}
	}
	
}
