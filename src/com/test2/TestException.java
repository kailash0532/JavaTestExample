package com.test2;

import java.io.IOException;

public class TestException {
	
	 void Test1() throws IOException  {
		throw new IOException("Simple IO Exception");
	}
	
 void Test2() throws IOException {
	Test1();	
	}


 void Test3() {
	try {
	Test2();
	}catch (Exception e) {
		System.out.println("Test" + e);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestException TE=new TestException();
		TE.Test3();
	}

}
