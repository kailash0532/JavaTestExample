package com.test2;

public class StringExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str=String.join("%", "This","is","java","class");
		
		System.out.println(str);
		
		String[] str2=str.split("\\%",3);
		
		for(String strs:str2) {
			System.out.println(strs);
		}
		
		String str3="This is Java class";
		
		System.out.println(str3.startsWith("This"));
		System.out.println(str3.startsWith("is",5));
		System.out.println(str3.endsWith("class"));
	}

}
