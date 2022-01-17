package com.test2;

public class WrapperClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// converting from Primitive data type to Objects 
		
		
		int a=10;
		Integer inte=a; // autoboxing
		
		Integer integer=Integer.valueOf(20); 
		
		
		System.out.println(inte);
		System.out.println(integer);
		
		int b=integer.intValue();  // unboxing  wrapper to Primitive
		
		System.out.println(b);
		
		
		

		float test=10.01f;
		float inte1=a; // autoboxing
		
		Float flt=Float.valueOf(20.00f);
		
		
		System.out.println(inte1);
		System.out.println(flt);
		
		float bt=flt.floatValue();  // unboxing  wrapper to Primitive
		
		System.out.println(bt);
		
		
		String str="123";
		
		int ab=Integer.parseInt(str);
		double abc=Double.parseDouble(str);
		System.out.println(ab);
		System.out.println(abc);
		String st=String.valueOf(ab);
		System.out.println(st);
		
		
	}

}
