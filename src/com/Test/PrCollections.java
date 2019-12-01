package com.Test;

import java.util.ArrayList;

class Fruit { }
	
class Apple extends Fruit {}

class Orange extends Fruit {}

public class PrCollections {
	
	public static void main(String[] args) {
		
		ArrayList<Apple> alist = new ArrayList<Apple>();
		alist.add(new Apple());
		ArrayList blist = alist;
		ArrayList<Orange> olist = blist;
		olist.add(new Orange());
		System.out.println(alist);
	}
}