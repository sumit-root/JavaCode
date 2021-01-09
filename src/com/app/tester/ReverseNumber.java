package com.app.tester;

public class ReverseNumber {

	public static void main(String[] args) {
		int number= -52364;
		int reverse=0;
		while(number != 0) {
			int endNo=number%10;
			reverse = reverse *10 +endNo;
			number= number/10;
		}
		System.err.println(reverse);
	}

}
