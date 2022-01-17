package com.test2;

import java.io.IOException;

public class TestThrowChecked {
	
	
	public void validateAge(int age) throws IOException {
		
		
		if(age<18) {
			throw new IOException("Not eligible");
		}else {
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThrowChecked tt=new TestThrowChecked();
		try {
			tt.validateAge(15);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in Method " +  e);
		}
		
		

	}

}
