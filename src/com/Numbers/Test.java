package com.Numbers;

public class Test {
	
	public void sum(double d) {
		System.out.println("double arg");
	}

	public void sum(int a) {
		System.out.println("int arg");
	}
	public void sum(String s1, int...a) {
		System.out.println("hello");
		System.out.println("arguments are :" +a.length);
	}
	
	public static void main(String[] args) {
		
		
		Test t = new Test();
		t.sum(10);
		t.sum(10.0);
		t.sum(10l);
		
		t.sum("Hello pr" +10,20,30,40,50,8);
	
	}
}

