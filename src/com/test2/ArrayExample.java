package com.test2;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] array1= {1,2,3};
		
		int[] array2= new int[4];
		
		array2[0]=10;
		array2[2]=20;
		array2[3]=30;
		array2[1]=40;
		
		String[] array3= {"Test","Books","Java","C#","selenium","XYZ"};
		
		int[] array4= {1,2,'A'};
		
		
		
		for(int i=0;i<=array1.length-1;i++) {
			
			System.out.println("array 1  "+array1[i]);
		}
		
 for(int a:array1) {
	 
	 System.out.println("for each "+a);
 }
 
 
 for(int i=0;i<=array4.length-1;i++) {
		
		System.out.println("array 1  "+array4[i]);
	}
	
for(int a:array4) {

System.out.println("for each "+a);
}

String[] array5=new String[array3.length-2];

System.arraycopy(array3, 2, array5, 0, array3.length-2);


for(String str:array5) {

System.out.println("for each "+str);
}


String[] strarr=new String[array3.length];

for(int i=0;i<=array3.length-1;i++) {
	
	strarr[i]=array3[i];
}
for(String str:strarr) {

System.out.println("for loop "+str);
}

	}

}
