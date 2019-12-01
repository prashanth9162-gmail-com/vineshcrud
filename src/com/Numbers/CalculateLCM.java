package com.Numbers;

import java.util.Scanner;

public class CalculateLCM {
	
	public static int lcm(int firstNumber, int secondNumber) {
		int x,max=0,min=0,lcm=0;
		if(firstNumber > secondNumber) {
			max=firstNumber;
			min=secondNumber;
		}
		else {
			max=secondNumber;
			min=firstNumber;
		}
		for(int i=1;i<=min;i++) {
			x=max*i;
			if(x%min==0) {
				lcm=x;
				break;
			}
		}
		return lcm;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number :");
		int num2 = sc.nextInt();	
		
		System.out.println("The LCM is :"+lcm(num1,num2));
	}

}
