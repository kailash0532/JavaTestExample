package com.test2;

import com.test.ClassA;

public class ClassC extends ClassA {
	
	 protected  void test3() {
		 System.out.println("this is protected in child class");
	}
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC aObj=new ClassC();
		
		System.out.println(aObj.b);		
		System.out.println(aObj.D);
		
		

		
		aObj.test1();	
		aObj.test3();
	}

}
