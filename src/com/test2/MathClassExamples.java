package com.test2;

public class MathClassExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(Math.addExact(10, 20));
		
		System.out.println(Math.subtractExact(10,20));   // 2 power 32  ==
		System.out.println(Math.multiplyExact(10, 2));
		
		
		System.out.println(Math.max(10.50, 10.51));
		
		System.out.println(Math.min(10.50, 10.51));
		
		System.out.println(Math.pow(2,32));
		
		System.out.println(Math.sqrt(9));
		
		
		System.out.println(Math.abs(-12));
		
		
		System.out.println(Math.ceil(-23.99));  // -23 >-24 
		System.out.println(Math.ceil(23.99));   // 24
		
		
		System.out.println(Math.floor(-23.99));  // -24 
		System.out.println(Math.floor(23.99));   // 23
		
		double d=Math.random();
		
		System.out.println(d);
		
		try  
        {  
        int data=50/0; //may throw exception   
        }  
            //handling the exception  
		
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
		catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        } 
        System.out.println("rest of the code");  
    }  
		
		
	

}
