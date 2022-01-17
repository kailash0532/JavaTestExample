package com.test2;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="Java";
		String str2="java";
		
		char c='C';
		char[] ch= {'A','B','C'};
		
		String str1=new String(ch);
		
		
		String str3=new String("Java");
		
		String str4=new String();
		
		System.out.println(str);
		System.out.println(str1);
		
		
		str3=str3.concat("Books"); // "JavaBooks"
	
		System.out.println(str3);
		
		
		System.out.println(str3.charAt(4));
		
		System.out.println(str3.length());
		
		
		System.out.println(str3.substring(4));
		
		System.out.println(str3.substring(4,7));
		
		System.out.println(str3.contains("Books"));
		System.out.println(str3.contains("Test"));
		System.out.println(str3.contains("books"));
		
		
		System.out.println(str.equals(str2));
		
		System.out.println(str.equalsIgnoreCase(str2));
		
	System.out.println(str3.replace('B', 'b'));
	
	System.out.println(str3.replaceAll("a", "c"));
	
	System.out.println(str3.toLowerCase());
	
	System.out.println(str3.isEmpty());
	
	System.out.println(str4.isEmpty());
	
	System.out.println(str3.indexOf("Books"));
	
	
	
	String strg=" selenium ";
	String strg2="";
	
//	int len=strg.length();
	
	for(int i=strg.length()-1;i>=0;i--) {
		
		strg2=strg2+strg.charAt(i);
		
	}
	
	System.out.println("String reverse "+ strg2);
	
	char[] ch2=strg.toCharArray();// {'s','e','l','e','n'}
	
	
		System.out.println(strg.trim());
	}

}
