package com.test2;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("Java");
		
		sb.append("books");  
		
		System.out.println(sb);
		
		
	//	System.out.println(sb.reverse());
		
		
		System.out.println(sb.insert(4, "/"));  // Java/books
		
		System.out.println(sb.replace(4, 5, "#"));
		System.out.println(sb.charAt(2));
		System.out.println(sb.length());
		
		
		
		
		
StringBuilder sb1=new StringBuilder("Java");
		
		sb1.append("books");  
		
		System.out.println(sb1);
		
		
	//	System.out.println(sb.reverse());
		
		
		System.out.println(sb1.insert(4, "/"));  // Java/books
		
		System.out.println(sb1.replace(4, 5, "#"));
		System.out.println(sb1.charAt(2));
		System.out.println(sb1.length());
		
		
		
		String str="Test";  // immutabl;e
		
		StringBuffer sb2=new StringBuffer(str);  // mutable
		System.out.println(sb2);
		
		
		String str3=sb2.toString();
		System.out.println(str3);
		
		StringBuffer sb4=new StringBuffer();
		sb4.append("javabooksTestRead");
		System.out.println(sb4.capacity()); // 16*2+2=34
		
		//string buffer --> String --> String builder
		
	}

}
