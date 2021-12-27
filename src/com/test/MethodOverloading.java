package com.test;

public class MethodOverloading {
	
	
	public void Test() {
		System.out.println("method without parameter");
	}
	
	public void Test(String s) {
		System.out.println("method with one parameter" + s);
	}
	
	public void Test(String s, String s1) {
		System.out.println("method with two  parameter" + s + " "+s1);
	}
	
	public void Test(String s, int a) {
		System.out.println("method with two different parameter" + s + " "+a);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="one";
		String s1="two";
		String s2="three";
		int a=10;
		
		MethodOverloading methodoverloadObj=new MethodOverloading();
		methodoverloadObj.Test();
		methodoverloadObj.Test(s);
		methodoverloadObj.Test(s,s1);
		methodoverloadObj.Test(s,a);
	}

}
