package com.test;

public class VariableExample {
	
	int a=10;   //instance varibale 
	static int d=5;
	
	public void Test() {
		int c=12;
		System.out.println("inside Method : local variable"+c);
	}
	
	public static void Test2() {
		
		int e=12;
		System.out.println("static method :"+ e);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=11; 
		
		VariableExample variableObject =new VariableExample();
		
		System.out.println("instace variable "+variableObject.a);
		
		System.out.println("static variable"+d);
		
		variableObject.Test();
		
		System.out.println("instance varible at main method"+b);
		
		Test2();
	}

}
