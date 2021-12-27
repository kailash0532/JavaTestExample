package com.test;

public class ClassA {
	
	private int a =10;
	public int b=20;
	int c=30;
	protected int D=40;
	
	private void test() {
		System.out.println("this is private");
	}
	
	public void test1() {
		System.out.println("this is public");
	}
	
	 void test2() {
		System.out.println("this is default");
	}
	 
	 protected  void test3() {
		 System.out.println("this is protected");
	}
	
	
	public static void main(String[] args) {
		ClassA aObj=new ClassA();
		System.out.println(aObj.a);
		System.out.println(aObj.b);
		System.out.println(aObj.c);
		System.out.println(aObj.D);
		
		
		
		aObj.test();
		aObj.test1();
		aObj.test2();
		aObj.test3();
		
	}

}
