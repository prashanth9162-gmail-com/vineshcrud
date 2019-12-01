package com.basics;

public class RestrictedObjectCreation extends Exception {

	public RestrictedObjectCreation(String string) {
		System.out.println("can not create more than 3 obj");
	}

}
