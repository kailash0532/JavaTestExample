package com.test;

public class ShiftOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;

System.out.println("Right shift "+ (a>>2)); // 10 / 2^2 = 2
System.out.println("Right shift "+ (b>>2)); // 20 / 2^2 = 5

int c=10;
int d=20;
System.out.println("Left shift "+ (a<<2)); // 10 * 2^2 == 40

	}

}
