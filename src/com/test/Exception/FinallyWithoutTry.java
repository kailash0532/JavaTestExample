package com.test.Exception;

public class FinallyWithoutTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=10;
		try {
		int b=a/0;   // we get Arithematic exception		
		
		}
		
		catch (ArithmeticException e) {
			System.out.println("Arithematic in catch block "+ e);
			
		}
		catch (Exception e) {
			System.out.println("handled in catch block "+ e);
		}
		
		
		finally {     // compilation error because no try block added
			System.out.println("Test");
		}
		
		

	}

}
