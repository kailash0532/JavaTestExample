package com.test2;

public class ChildClass  extends ParentClass{
	
	int b=20;
    String Str2="Test2";
    ChildClass(){
    	super();
    	System.out.println("Child class constructor");
    	
    }
    public void Test() {
    	
    	System.out.println("Method in Parent class  AND ");
		System.out.println("Method in Child class");
		super.Test1();
		System.out.println(super.a);
	}
    public static void main(String[] args) {
		
    	ChildClass childObject=new ChildClass();
    	ParentClass childObject1=new ChildClass();
    	
    	
    	System.out.println(childObject.a);
    	System.out.println(childObject.str);
    	childObject.Test();
    	childObject1.Test1();
    	System.out.println(childObject.b);
    	System.out.println(childObject.Str2);
    	
	}

}
