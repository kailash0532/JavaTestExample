package com.test.Exception;

import com.test.ArthematicOperators;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a =10;
		int b=0;
		String s=null;
		try {
			
		int len=s.length();	 // null pointer exception 
		System.out.println("Testing");
		b=a/0; // arithematic exception
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound exception "+ e);
		}
		catch (ArithmeticException e) {
			System.out.println("Divided By Zero "+ e);
		}
		catch (Exception e) {
			System.out.println("Parent Class Exception "+ e);
		}
		
		System.out.println("value of b"+b);

	}

}
