package com.test;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A=8;
		
		switch (A) {
		
		case 0:
			System.out.println("Value is 0");
			
			break;
		case 1:
			System.out.println("Value is 1");
			
			break;
		case 8:	
		case 9:	
		case 10:
			System.out.println("Value is 10");
			
			break;

		default:
			System.out.println("value is not 10");
			break;
		}

	}

}
