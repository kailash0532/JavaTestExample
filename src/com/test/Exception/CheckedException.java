package com.test.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Class exm=Class.forName("Checked2");
			
			
			FileInputStream fis=new FileInputStream("C:\\Users\\Kailash_Sopparapu\\Desktop\\Test\\First1.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File may not be present" +e);
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Class not found " +e);
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Most genreic exception "+e);
			e.printStackTrace();
		}
		
		
		System.out.println("Testings");
		
	}

}
