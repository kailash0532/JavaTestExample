package com.test2;

public class Constructor {
	int a = 10;
int b=20;
	Constructor() {
		System.out.println("default constructor");
	}

	Constructor(int a) {
		 this();
		System.out.println("Single parameter constructor " + a);
	}

	Constructor(String b) {
		 this();
		System.out.println("Single parameter constructor " + a);
	}
	Constructor(int a, String str) {
        this(a);
		System.out.println("Two parameter constructor " + a + " " + str);
	}

	Constructor(Constructor con) {
		this(con.a);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		String str = "Test";
		Constructor constr1 = new Constructor(a,str);
		
		
	}

}
