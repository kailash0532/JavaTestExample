package com.test.collection;

import java.util.PriorityQueue;

public class QueueExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			PriorityQueue<Integer> queue=new  PriorityQueue<Integer>();
			
			queue.add(10);
			queue.add(30);
			queue.add(50);
			queue.offer(20);
			queue.offer(40);
			
			System.out.println(queue);
			
			
			System.out.println(queue.element());
			System.out.println(queue.peek());
			
			System.out.println(queue.poll());
			
			System.out.println(queue);
			
			System.out.println(queue.remove(20));
			System.out.println(queue);
			
			
			
	}

}
