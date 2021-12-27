package com.test2;

public class staticBlocks {
	
	static int a=10;
	
	int b=20 ;
	
	int c;
	static String str;
	
	static {
		
	System.out.println("value of a "+a);	
	
	}
	
	{
		System.out.println("value of b "+b);	
	}
	
	
	{
		System.out.println("value of c "+c);	
		
	}
	
	static {
		System.out.println("value of string "+ str);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticBlocks sb=new staticBlocks();
		
	}

}
