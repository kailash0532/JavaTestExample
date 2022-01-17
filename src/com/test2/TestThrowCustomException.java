package com.test2;

import java.io.IOException;

public class TestThrowCustomException {
	
	
	public void validateAge(int age) throws CustomException {
		
		
		if(age<18) {
			throw new CustomException("Not Eligible for Voting");
		}else {
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThrowCustomException tt=new TestThrowCustomException();
		
			try {
				tt.validateAge(15);
			} catch (CustomException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception occured "+ e);
			}
		
		
		

	}

}
