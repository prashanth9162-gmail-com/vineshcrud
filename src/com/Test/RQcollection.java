package com.Test;

import java.util.ArrayList;
import java.util.Collection;

public class RQcollection {
	
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i : makeCollection()) {
			sum += i;
			System.out.println(sum);
		}
	}

	static Collection<Integer> makeCollection() {
		System.out.println("A collection coming Up.");
		Collection<Integer> c1 = new ArrayList<Integer>();
		c1.add(11);
		c1.add(12);
		c1.add(13);
		c1.add(16);
		return c1;
	}

}
