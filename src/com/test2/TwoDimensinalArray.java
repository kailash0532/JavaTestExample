package com.test2;

public class TwoDimensinalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[][] array1= {{1,2,3},{4,5,6},{7,8,9}};
 
 int[][] array2= new int[2][2];
 array2[0][0]=10;
 array2[0][1]=20;
 
 
 array2[1][0]=10;
 array2[1][1]=20;
 
 
 
 
 for(int i=0 ; i<2;i++  ) {
	 
	 
	 for (int j=0;j<2;j++) {
		 
		 System.out.println("array1 values "+ array2[i][j]);
	 }
 }
 
	}

}
