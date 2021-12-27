package com.test;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =1;
		
		while(a<=10) {
			
			if(a==5) {
				a++;
				continue;
				
			}
			
			System.out.println("value of a"+a);
			a++;
		}

	}

}
