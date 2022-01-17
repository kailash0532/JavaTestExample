package com.test2;

import java.io.FileNotFoundException;

public class ThrowsExample {
	
	
	public void Test() throws FileNotFoundException {
		
		throw new FileNotFoundException("File not found at specified location") ;
		
	}

	public static void main(String[] args)  {
		ThrowsExample TE =new ThrowsExample();
		
		try {
			TE.Test();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
