package com.test2;

public interface InterfaceExample1 {
	int b=20;
	void Test1();
	
	void Test2();
	
	default void Test5() {
		System.out.println("Test5 in Interface1");
	}
	
	static void Test6() {
		System.out.println("static method in Interface1");
	}

}
