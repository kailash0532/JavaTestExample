package com.test2;

public class ThisExample {
	
	int a;
	String test;
	boolean result;
	
	public void method1(int a, String test,boolean result) {
		
		System.out.println("int "+ a + " String "+ test + " boolean "+result);
	}
	
	
	ThisExample(int a, String test,boolean result){
		this.a=a;
		this.test=test;
		this.result=result;
	
	}
	
	
	void Test(){
		
		System.out.println("int "+ a + " String "+ test + " boolean "+result);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisExample example=new ThisExample(20,"Books",false);
		
		example.Test();
		
	}

}
