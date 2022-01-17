package com.test2;

public class ArrayClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array1[]= {10,20,30};
		
		int array2[] =array1.clone();
		
		for(int a : array2) {
			System.out.println("values of array2  " + a);
		}

	}

}
