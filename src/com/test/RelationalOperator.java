package com.test;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Test";
		String s1 ="Test";
		String s2=new String("Test");
		int a =10;
		int b=20;
		int c=10;
		
		System.out.println("relational operator "+ (a>b));
		System.out.println("relational operator "+ (b>a));
		
		System.out.println("relational operator "+ (a>=b));
		System.out.println("relational operator "+ (a>=c));
		
		System.out.println("not equals"+ (a!=b));
		System.out.println("not equals"+ (a==c));
		System.out.println("Strings "+ (s==s1));
		System.out.println("Strings "+ (s==s2));
		System.out.println("Strings "+ (s.equals(s2)));
	}

}
