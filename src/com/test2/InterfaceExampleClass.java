package com.test2;

 class InterfaceExampleClass implements InterfaceExample1,InterfaceExample2 {

	public void Test1() {
		System.out.println("Test1");
	}

	
	public void Test2() {
		System.out.println("Test2");
		
	}
	
	@Override
	public void Test3() {
		System.out.println("Test3");
		
	}


	@Override
	public void Test4() {
		System.out.println("Test4");
		
	}

	
	@Override
	public void Test5() {
		InterfaceExample1.super.Test5();
		System.out.println("implemented in class");
	}


	public static void main(String[] args) {
		InterfaceExampleClass iec=new InterfaceExampleClass();
		iec.Test1();
		iec.Test2();
		
		InterfaceExample1 iec1=new InterfaceExampleClass();
		iec1.Test1();
		iec1.Test2();
		
		InterfaceExample2 iec2=new InterfaceExampleClass();
		iec2.Test3();
		iec2.Test4();
		
		System.out.println("variable a"+InterfaceExample2.a);
		iec2.Test5();
		
		InterfaceExample1.Test6();
		InterfaceExample2.Test6();
	}


	
}
