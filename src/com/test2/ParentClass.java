package com.test2;

public class ParentClass {
	
	public int a=10;
	public String str="Test";
	
	 ParentClass(int a) {
		System.out.println("Parent class constructor"+a);
	}
	
	public ParentClass() {
		System.out.println("default Parent class constructor");
	}
	public void Test() {
		System.out.println("Method in Parent class");
	}
	
	public void Test1() {
		System.out.println("Method2 in Parent class");
	}

}
