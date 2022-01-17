package com.test2;

import java.io.IOException;

class ClassTest{
	
	public void Testing() throws Exception  {
		System.out.println("parent class method ");
		throw new IOException("Simple IO exception");
	}
	
	
}

public class TestParentClassDeclaresException extends ClassTest{
	
	public void Testing() throws IOException {
		System.out.println("child class method ");
		throw new IOException("Simple IO exception");
	}
	
	
	public static void main(String[] args) {
		ClassTest ct=new TestParentClassDeclaresException();
		try {
			ct.Testing();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("handled in main method "+ e);
		}
	}

}
