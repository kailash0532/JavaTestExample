package com.test.collection;

import java.util.ArrayDeque;

public class DequeueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayDeque<Integer>  adq=new ArrayDeque<Integer>();
		
		ArrayDeque<Integer>  adq2=new ArrayDeque<Integer>();
		adq.add(10);
		adq.add(30);
		adq.add(50);
		adq.offer(20);
		adq.offer(40);
		adq.offerLast(60);
		adq.offerFirst(5);
		System.out.println(adq);
		
		
		adq.poll();
		
		System.out.println(adq);
		
		
		  adq.pollLast(); 
		  System.out.println(adq); 
		  adq.pollFirst();
		  System.out.println(adq); 
		 
			
			
			System.out.println(adq.peek());
			
		  
		  System.out.println(adq.peekFirst()); 
		  
		  System.out.println(adq.peekLast()); 
		  
		  adq2.add(123);
		  adq2.add(124);
		  adq.addAll(adq2);
		  System.out.println(adq);
		  
		 System.out.println(adq.contains(123));
		 System.out.println(adq.containsAll(adq2));
		 
		 

	}

}
