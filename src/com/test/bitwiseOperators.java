package com.test;

public class bitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean a=true;
		boolean b=false;
		boolean c=true;
		boolean d=false;
		System.out.println(" bitwise and "+ (a & b)); // true & false == false
		
		System.out.println(" bitwise and "+ (a & c)); // true & true == false
		
		System.out.println(" bitwise and "+ (b & d)); //  false & false == false 
		
		System.out.println(" bitwise and "+ (b & c)); // false & true == false 
		
		System.out.println("Logical and "+  (a && b)); // 
		
		System.out.println("Logical and "+  (b && d));
		
		
		System.out.println(" bitwise OR "+ (a | b));  // true  OR false == true 
		
     System.out.println(" bitwise and "+ (a | c)); // true OR true == true
		
		System.out.println(" bitwise and "+ (b | d)); //  false OR false == false 
		
		System.out.println(" bitwise and "+ (b | c)); // false OR true == true  
		
System.out.println("Logical and "+  (a || b)); // 
		
		System.out.println("Logical and "+  (b || d));
		
		
		
		
	}

}
