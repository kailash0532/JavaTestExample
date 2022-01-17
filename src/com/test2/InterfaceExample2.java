package com.test2;

public interface InterfaceExample2 {
	int a=10;
	
	void Test1();
	
	void Test3();
	void Test4();
	
	default void Test5() {
		System.out.println("Test5 in Interface1");
	}
	static void Test6() {
		System.out.println("static method in Interface2");
	}
}
