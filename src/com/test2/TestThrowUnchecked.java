package com.test2;

public class TestThrowUnchecked {
	
	
	public void validateAge(int age) {
		
		
		if(age<18) {
			throw new ArithmeticException("Not eligible");
		}else {
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThrowUnchecked tt=new TestThrowUnchecked();
		tt.validateAge(15);
		
		

	}

}
