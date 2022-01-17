package com.test.Exception;

import com.test.ArthematicOperators;

public class NestedTryBlocksExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {1,2,3,4};
		int a=10;
		String s=null;
		int b;
		try {
			
			
			try {
				
				
				try {
					
					System.out.println(arr[5]);
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println("Array index out of bound Exception" + e);
				}
				
			b=a/0;
			
			}catch (Exception e) {
				System.out.println("Arithmetic Exception" + e);
			}
			
			
			int len=s.length();
			
		}catch (NullPointerException e) {
			System.out.println("Null pointer exception"+e);
		}
		
		catch (Exception e) {
			System.out.println("Generic exception"+e);
		}
		
		finally {
			System.out.println("Finally block ");
		}
		
		System.out.println("Testing");
		
	}

}
