package com.test2;

public class StringReverse {

	public static void main(String[] args) {
		String originalString="selenium";
		String reversedString="";	

		System.out.println("Original String "+ originalString);
		for(int i=originalString.length()-1;i>=0;i--) {
			
			reversedString=reversedString+originalString.charAt(i);
			
		}
		
		System.out.println("String reverse "+ reversedString);
	}
	
}
