package com.app.tester;

public class ReverseStringManually {

	public static void main(String[] args) {
		String s= "Hello";
		
		System.out.println(manuallyReverseString(s));

	}
	
	public static String manuallyReverseString(String s) {
		StringBuilder builder = new StringBuilder();
		
		for (int i = s.length()-1; i >= 0; i--) {
			builder.append(s.charAt(i));
		}
		return builder.toString();
	}

}
