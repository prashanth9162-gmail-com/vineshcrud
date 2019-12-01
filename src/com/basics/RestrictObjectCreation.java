package com.basics;

public class RestrictObjectCreation {

	static int count=0;
	{
		count++;
	}
	public RestrictObjectCreation() {
		if (count>3) {
			try {
				throw new RestrictedObjectCreation(null);
			} catch (RestrictedObjectCreation e) {
				System.out.println(e);
			}
		} else {
			System.out.println("Obj is created");
		}
	}
	public static void main(String[] args) {
		RestrictObjectCreation t1= new RestrictObjectCreation();
		RestrictObjectCreation t2= new RestrictObjectCreation();
		RestrictObjectCreation t3= new RestrictObjectCreation();
		RestrictObjectCreation t4= new RestrictObjectCreation();
	}
	
}
