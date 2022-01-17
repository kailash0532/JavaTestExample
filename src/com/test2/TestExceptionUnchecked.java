package com.test2;

import java.io.IOException;

public class TestExceptionUnchecked {
	
	 void Test1()  {
		throw new ArithmeticException("Simple IO Exception");
	}
	
 void Test2() {
	Test1();	
	}


 void Test3() {
	try {
	Test2();
	}catch (Exception e) {
		System.out.println("Exception handled "+ e);
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestExceptionUnchecked TE=new TestExceptionUnchecked();
		TE.Test3();
	}

}
