package com.test;

public class ForEach {
	
	public static void main(String[] args) {
		
		
		int[] array1= {1,2,3,4,5};
		
		for(int val : array1) {
			System.out.println("value is "+val);
		}
		
		int len=array1.length;  // 5
		
		for(int i=0;i<=len-1;i++) {
			System.out.println( "value in array"+ array1[i]);
		}
		
		
	}

}
