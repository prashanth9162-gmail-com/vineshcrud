package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class PrintDupArrayList {
	
	public static void main(String[] args) {
		int[] arr = {1,5,7,8,9,5,1,8};
		removeDuplicates(arr);
		ArrayList<String> s1 = new ArrayList<>();
		
		s1.add("prashanth");
		s1.add("chary");
		s1.add("Vinesh");
		s1.add("prashanth");
		
		HashSet<String> hs = new HashSet<>();
		
		for (String str : s1) {
			if (hs.add(str)==true) {
				//System.out.println(str);
			}
			
		}
		
		ArrayList<Integer> n1 = new ArrayList<>();
		
		n1.add(11);
		n1.add(12);
		n1.add(13);
		n1.add(13);
		
		//System.out.println(n1);
		
		//n1.stream().collect(Collectors.toSet()).forEach(t-> System.out.println(t));
		
		/*HashSet<Integer> hs1=new HashSet<>();
		
		for (Integer in : n1) {
			hs1.add(in);
			System.out.println(hs1);
			
		}*/
		
	}

	private static void removeDuplicates(int[] arr) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer integer : arr) {
			list.add(integer);
		}
		HashSet<Integer> set = new HashSet<>(list);
		for (Integer integer : set) {
			System.out.println(integer);
		}
	}

}
