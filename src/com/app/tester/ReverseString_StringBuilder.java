package com.app.tester;

public class ReverseString_StringBuilder {

	public static void main(String[] args) {
		String s =  "Hello";
		StringBuilder bulid = new StringBuilder();
		bulid.append(s);
		
		System.out.println(bulid.reverse());
	}
}
