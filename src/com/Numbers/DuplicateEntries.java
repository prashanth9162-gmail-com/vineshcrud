package com.Numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class DuplicateEntries {
	
	static 	List<Integer> l = new ArrayList<Integer>();
	static HashMap<Integer, Integer> hm = new HashMap<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter elements");
		for (int i = 1; i <= 10; i++) {
			int e =sc.nextInt();
			l.add(e);
			boolean there = isThere(e);
			System.out.println(there);
		}
	}

	public static boolean isThere(int e) {
		if (hm.containsKey(e)) {
			hm.put(e, hm.get(e)+1);
		} else {
			hm.put(e, 1);
		}
		if (hm.get(e)>1) {
			return false;
		}
		return true;
	}

}
