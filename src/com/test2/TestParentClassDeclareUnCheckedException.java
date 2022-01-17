package com.test2;

import java.io.IOException;

class ClassTest12{
	
	public void Testing() throws Exception  {   
		System.out.println("parent class method ");
		throw new Exception("parent exception");
	}
	
	
}

public class TestParentClassDeclareUnCheckedException extends ClassTest12{
	
	public void Testing() throws Exception {                             /// same exception  in parent  and same exception in child -- No compiler error 
																		/// Parent exception(Exception class)  in parent  and same exception(checked or Unchecked Exceptions) in child -- No compiler error
																		///Child exception(checked or Unchecked Exceptions)  in parent  and parent exception(Exception class) in child -- compiler error
		System.out.println("child class method ");
		throw new Exception("Simple Arithmetic exception");     
	}
	
	
	public static void main(String[] args) {
		ClassTest12 ct=new TestParentClassDeclareUnCheckedException();
		try {
			ct.Testing();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("handled in main method" + e);
		}
	}

}
