package com.test;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  a =5;
int b=10;
System.out.println("unary postfix "+ a++);  //printed value :5  saved value is 6
System.out.println("unary postfix "+ a);
System.out.println("unary prefix "+ ++a); // value will be 7 , printed value is 7
System.out.println("unary postfix "+ ++b); // 11  , 11
int c=-5;
int d=10;
System.out.println("unary prefix"+ --c);//printed value :4  saved value is 4
System.out.println("unary prefix"+ d--); // printed value : 10 , saved value is 9
System.out.println("unary prefix"+ d) ; // printed value is 9

System.out.println("negation "+ ~c);

boolean test=false;
boolean test1=true;
System.out.println("boolean Test "+!test);

System.out.println("boolean Test1 "+!test1);


	}

}
