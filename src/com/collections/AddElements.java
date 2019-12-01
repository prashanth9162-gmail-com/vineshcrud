package com.collections;

import java.util.ArrayList;
import java.util.List;

public class AddElements {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i : addObjects())
		sum +=i;
	    System.out.println(sum);
	}
	static List<Integer> addObjects() {
	
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		return l;
	
	}

}
