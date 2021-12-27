package com.test2;

public class SubSubClassExample extends SubClass{

	
	void test3() {
		
		System.out.println(" Test3 ");
	}
	
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubSubClassExample ex=new SubSubClassExample();
		ex.test1();
		ex.test2();
		ex.test3();
		AbstarctExample.Test4();
		System.out.println(AbstarctExample.test);
	}

	

}
